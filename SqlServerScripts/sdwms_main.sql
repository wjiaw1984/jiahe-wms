if exists(select * from sysobjects where id = object_id ('SDWMS_MainProc') and xtype = 'P')
  drop procedure SDWMS_MainProc
Go
Create procedure [dbo].[SDWMS_MainProc]  
-----------------------------------------------------------------
--SDWMS_MainProc   ��׼WMS�����ӿ����ع���
--������
--���أ���־0=�ɹ�  �ϵ��(9721XX)
--�����InterfaceSheetList0,FR_UpNote,WMS_downNote
--�����InterfaceSheetList
--0. �������ɶ�ʱ�����ã����������
--1. ҵ��ϵͳ�����ӿڵ����嵥InterfaceSheetList0
--2. �ȴ���ת��ҵ��,�ٴ���ת��ҵ��,������Ʒ���ѭ����
--�޸�: ������ 2012.9.28 �ؽ��������.......
--�޸�: ������ 2013.5.9  �������ش����½ӿ�ͣ��.....
--�޸ģ��� 2013.11.7 ��ֲ��R5.
-----------------------------------------------------------------
as  
Begin  
  declare @Err  int;  
  declare @BreakPoint int;  
  declare @ISAM  int;  
  declare @Msg  varchar(255);  
  declare @StartWork int;  
  declare @InterfaceSystem char(8);        --�ӿ�����  
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
  
  --���ݷ���  
  select @BreakPoint = 9721010;  
  DECLARE Cur_SendData cursor local for  
        --gzt ���� ���ݱ���+��������ѭ��  
	select SheetID,SheetType from InterfaceSheetList0  
   	where InterfaceSystem=@InterfaceSystem and ExecuteFlag=0  
  OPEN Cur_SendData  
  WHILE (1=1)  
  BEGIN  
 	if @@Error != 0 goto ErrHandle;  
	FETCH NEXT FROM Cur_SendData INTO @SheetID,@SheetType;  
	if @@fetch_status !=0 break;  
  
        --gzt û����Ҫ���������  
	select @Cnt=count(*) from InterfaceSheetList0  
	where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  
	if @Cnt <= 0 begin --���������Ѵ���  
	 	select @StartWork = 0;  
  		continue;  
 	end;  
  
        begin tran   
  
        --�����ó�100  
        update InterfaceSheetList0 set ExecuteFlag=99  
	where SheetID=@SheetID and SheetType=@SheetType and InterfaceSystem=@InterfaceSystem;  
  
        commit;  
  
        --��ʼ��������...  
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
  
	--�ӿ�����ת��  
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
  
  
  --���ݽ���  
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
  
        --��ʼ��������  
 	begin Tran;  
 	select @StartWork = 1;  
  
   	select @BreakPoint = 9721080;  
 	exec @Err=TL_SheetIn_SDWMS @SheetID,@SheetType;  

        if @Err=-1       --�ϴ�ʧ�ܻع�����......  
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
        if @Err=-1       --�ϴ�ʧ�ܻع�����......  
        begin  
          	Rollback;  
          	update InterFaceWMSDB.dbo.FR_UpNote set Flag=0 where SheetID=@SheetID and SheetType=@SheetType;  
   	  	select @StartWork = 0;  
          	select @Err=0;  
          	Continue;  
        end;        
  
   	select @BreakPoint = 9721090;  
   	exec @Err=SDWMSIn_UpBak @SheetID,@SheetType;  
        if @Err=-1       --�ϴ�ʧ�ܻع�����......  
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
  
  raiserror('%s,�ϵ�=%d,Err=%d',16,1,@Msg,@BreakPoint,@Err);  
  return -1;  
end;
