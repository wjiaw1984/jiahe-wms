if exists(select * from sysobjects where id = object_id ('SDWMS_MainProc') and xtype = 'P')
  drop procedure SDWMS_MainProc
Go
Create procedure [dbo].[SDWMS_MainProc]  
-----------------------------------------------------------------
--SDWMS_MainProc   标准WMS物流接口主控过程
--参数：
--返回：标志0=成功  断点号(9721XX)
--输入表：InterfaceSheetList0,FR_UpNote,WMS_downNote
--输出表：InterfaceSheetList
--0. 本过程由定时器调用，无事务控制
--1. 业务系统产生接口单据清单InterfaceSheetList0
--2. 先处理转出业务,再处理转入业务,事务控制放在循环体
--修改: 郭振滔 2012.9.28 重建事务控制.......
--修改: 郭振滔 2013.5.9  避免严重错误导致接口停滞.....
--修改：丘丹 2013.11.7 移植到R5.
-----------------------------------------------------------------
as  
Begin  
  declare @Err  int;  
  declare @BreakPoint int;  
  declare @ISAM  int;  
  declare @Msg  varchar(255);  
  declare @StartWork int;  
  declare @InterfaceSystem char(8);        --接口名称  
  declare @SheetID char(32);  
  declare @SheetType int;  
  declare @ShopType int;  
  declare @Cnt  int;  
  declare @ShopID char(6);  
  declare @count int;  
  declare @OldFlag int;  
  
  select @StartWork = 0;  
  select @BreakPoint = 1;  
  select @BreakPoint = 9721001;  
  select @InterfaceSystem = 'CalsWMS';  
  
  --数据发送  
  select @BreakPoint = 9721010;  
  DECLARE Cur_SendData cursor local for  
        --gzt 根据 单据编码+单据类型循环  
	select SheetID,SheetType from InterfaceSheetList0  
   	where InterfaceSystem=@InterfaceSystem and ExecuteFlag=0  
  OPEN Cur_SendData  
  WHILE (1=1)  
  BEGIN  
 	if @@Error != 0 goto ErrHandle;  
	FETCH NEXT FROM Cur_SendData INTO @SheetID,@SheetType;  
	if @@fetch_status !=0 break;  
  
        --gzt 没有需要处理的内容  
	select @Cnt=count(*) from InterfaceSheetList0  
	where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  
	if @Cnt <= 0 begin --基本资料已处理  
	 	select @StartWork = 0;  
  		continue;  
 	end;  
  
        begin tran   
  
        --先设置成100  
        update InterfaceSheetList0 set ExecuteFlag=99  
	where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  
  
        commit;  
  
        --开始处理事务...  
 	begin tran;  
 	select @StartWork = 1;  
 	select @BreakPoint = 9721020;  
  
  
  
 	select @BreakPoint = 22;  
 	exec @Err=TL_SheetOut_SDWMS @InterfaceSystem,@SheetID,@SheetType,@ShopID output,@SheetID output;  
        if @Err=-1  
        begin  
          	Rollback;  
          	update InterfaceSheetList0 set ExecuteFlag=0  
     		where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  

   		    select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;  
  
	--接口数据转移  
	select @BreakPoint = 9721030;  
    if @SheetType<>1001
 	    update InterfaceSheetList0 set ExecuteFlag=1  
 	    where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  
  
        select @Err = @@error;                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                               
                                                                                                                      
        if @Err != 0  
        begin  
          	Rollback;  

          	update InterfaceSheetList0 set ExecuteFlag=0  
     		where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  

   		    select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;      
 	commit;  
 	select @StartWork = 0;  
  END;  
  CLOSE Cur_SendData;  
  DEALLOCATE Cur_SendData;  

  insert into InterfaceSheetList select * from InterfaceSheetList0  
    where InterfaceSystem=@InterfaceSystem and ExecuteFlag=60;  
  
  select @Err = @@error;             
  if @Err != 0  
  begin  
    Rollback;  
  end;
                                                                                                                                                                                                                                                                                                                                                                                      

  delete from InterfaceSheetList0  
 	where InterfaceSystem=@InterfaceSystem and ExecuteFlag=60;  
  
  select @Err = @@error;                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                      
  if @Err != 0  
  begin  
    Rollback;  
  end;
  
  insert into InterfaceSheetList select * from InterfaceSheetList0  
    where InterfaceSystem=@InterfaceSystem and DATEDIFF(day,sTime,getdate()) > 10;  
    
  select @Err = @@error;             
  if @Err != 0  
  begin  
    Rollback;  
  end;
  
  delete from InterfaceSheetList0  
 	where InterfaceSystem=@InterfaceSystem and DATEDIFF(day,sTime,getdate()) > 10;  
  
  select @Err = @@error;                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                      
  if @Err != 0  
  begin  
    Rollback;  
  end;
  
  
  --数据接收  
  select @BreakPoint = 9721070;  
  
  DECLARE Cur_ReceData cursor local for  
     select LTrim(RTrim(SheetID)),SheetType from InterFaceWMSDB.dbo.FR_UpNote where flag = 0 or Flag=50  
  OPEN Cur_ReceData  
  WHILE (1=1)  
  BEGIN  
 	if @@Error != 0 goto ErrHandle;  
 	FETCH NEXT FROM Cur_ReceData INTO @SheetID,@SheetType;  
 	if @@fetch_status !=0 break;  
  
        begin tran   
  
        select @OldFlag=0;  
        select @OldFlag=Flag from InterFaceWMSDB.dbo.FR_UpNote where SheetID=@SheetID and SheetType=@SheetType;   
   
        if @OldFlag<>50  
          update InterFaceWMSDB.dbo.FR_UpNote set Flag=50  
          where SheetID=@SheetID and SheetType=@SheetType;   
        else   
          update InterFaceWMSDB.dbo.FR_UpNote set Flag=99  
          where SheetID=@SheetID and SheetType=@SheetType;   
  
        commit;  
  
        --开始处理事务  
 	begin Tran;  
 	select @StartWork = 1;  
  
   	select @BreakPoint = 9721080;  
 	exec @Err=TL_SheetIn_SDWMS @SheetID,@SheetType;  

        if @Err=-1       --上传失败回滚数据......  
        begin  
          	Rollback;  
          	update InterFaceWMSDB.dbo.FR_UpNote set Flag=0 where SheetID=@SheetID and SheetType=@SheetType;  
   	  	select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;  
  
        update InterFaceWMSDB.dbo.FR_UpNote set Flag=1  
        where SheetID=@SheetID and SheetType=@SheetType;   
  
        select @Err = @@error;  
        if @Err=-1       --上传失败回滚数据......  
        begin  
          	Rollback;  
          	update InterFaceWMSDB.dbo.FR_UpNote set Flag=0 where SheetID=@SheetID and SheetType=@SheetType;  
   	  	select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;        
  
   	select @BreakPoint = 9721090;  
   	exec @Err=SDWMSIn_UpBak @SheetID,@SheetType;  
        if @Err=-1       --上传失败回滚数据......  
        begin  
          	Rollback;  
          	update InterFaceWMSDB.dbo.FR_UpNote set Flag=0 where SheetID=@SheetID and SheetType=@SheetType;  
   	  	select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;  
  
 	commit;  
	 select @StartWork = 0;  
  END;  
  CLOSE Cur_ReceData;  
  DEALLOCATE Cur_ReceData;   
  
  return 0;  
  
ErrHandle:  
  
  raiserror('%s,断点=%d,Err=%d',16,1,@Msg,@BreakPoint,@Err);  
  return -1;  
end;
