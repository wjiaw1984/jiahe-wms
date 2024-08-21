IF exists(select 1 from sysobjects where id = OBJECT_ID('TL_SheetIn_SDWMS'))
  drop proc TL_SheetIn_SDWMS
Go

CREATE PROCEDURE [dbo].[TL_SheetIn_SDWMS](@SheetID CHAR(32),@SheetType INT)
AS BEGIN
---------------------------------------------------------------------------------------
--������zhangqu 2008.11.13
--�޸ģ�hanhao 2009.2.10 ���������ص�ͬʱ�޸���������ֶ�
--�޸�: ������ 2011.7.13 �˻�����ǰ׺Ӧ����'B'
--�޸�: ������ 2011-12-14 ����֧�ֲּ����ҵ��..........
--�޸�: ������ 2011-12-15 ����֧����������ҵ��..........   +1
--�޸�: ������ 2011-12-29 ����������û��Ч
--�޸�: ������ 2012-1-9   ������Ʒ��̯�������Զ����ӿ�֧��
--�޸�: ������ 2012.1.9   ֧���Զ�����·�WMS����Ƿ��������
--�޸�: ������ 2012.5.10 �����̵���˻��ӿ�
--�޸�: ������ 2012.6.1	�����Զ����Ͷ�����������Ч�ڵ����ӿڵ���....
--�޸�: ������ 2012.6.1 ���Ӳּ�����ӿ�.....................
--�޸�: ������ 2012.6.4 �ּ�������������������з������Բ�����������޸�Flagֵ���ŵ�ST_Transfer����ȥ
--�޸�: ������ 2012.7.5  �����������ӿ�...................
--�޸�: ������ 2012.7.5  ����WMS�������ͳ��ⵥ�ӿ�...................
--�޸�: ������ 2012.7.10 ����������ֱ���Ƶ����������û���µ�BUG	+1
--�޸�: ������ 2012.9.28 �ؽ��������.....
--�޸�: ������ 2012.9.28 ���ӱ��𵥺��������õ�...
--�޸�: ������ 2012.11.5 �ӿڱ�׼��		+1
--�޸ģ�qirun 2012.11.15 ������˵����ɹ�Ӧ����ʱ����
--�޸ģ������� 2012.11.26 ��������嵥�ϴ�û���ɵ��ݵ����⡣+1
--�޸ģ������� 2012.11.27 ���ͳ��ⵥ�����ŵ�+����+����֪ͨ���ż�
--�޸�: ������ 2012.11.27 ����̵������ϴ�����....
--�޸�: ������ 2012.11.28 ����RationNoteΪ100,�����������û�����µ�����
--�޸�: ������ 2012.11.28 ����WMS������
--�޸�: ������ 2012.11.30 ����ֱͨ�󶩵��ϴ�����������������Ϊ0��BUG
--�޸�: ������ 2012.11.30 �������õ��ӿڱ�ʹ��FR_RationNote_Close
--�޸�: ������ 2012.12.3  ������͵��ϴ����ݸ������ݴ����Bug
--�޸�: ������ 2012.12.9  ʹ��2443�����̵�¼�뵥
--�޸�: ������ 2012.12.14 ����֪ͨ��᲻��ʵ������֪ͨ���Ƿ���ͬ�����ϴ�ҵ�����ģ���ΪҪ����������......
--�޸�: ������ 2012.12.14 ������˵����ɹ�Ӧ����ʱ����Զ�����ϴ�...
--�޸�: ������ 2012.12.28 ���Ӵ�����˵�д���������嵥�������ϴ�ҵ�����ģ�����������Դ֧��
--�޸�: ������ 2013.1.28  ����WMS�˻��ص�ʱ����Ʒû���ټ�¼�ش��������ERPʵ������WMSʵ������һ�µ�����
--�޸�: ������ 2013.2.1   ���Ӵ������������ϴ����̵�ӯ����..........
--�޸�: ������ 2013.2.20  ������˿���Ŀ�����־ͳһ����Ϊ1=�ۿ�
--�޸�: ������ 2013.3.14  ���Ӽ�¼�����ϴ����ݵ�������Ϣ.....
--�޸�: ������ 2013.3.22  �������ʽӿ� ���ɱ����������θ����Ĵ���....
--�޸�: ������ 2013.3.24  �������ʲֿⱨ��������������δ���....
--�޸�: ������ 2013.4.4   �����ŵ귵�����ݴ���................
--�޸�: ������ 2013.4.5   ����WMS�ӹ��ֽ�����2522�ϴ�����.....
--�޸�: ������ 2013.4.15  ����������յ�һƷ���̵ı������.
--�޸�: ������ 2013.4.27  WMS�ϴ��������յ������һ����Ʒ������ε����....
--�޸�: ������ 2013.5.3   ����WMS�̵�ӯ���������н����ֶ�.....
--�޸�: ������ 2013.5.10  ����WMSֱ������ǿ�䵥��֧��......
--�޸�: ������ 2013.8.16  ֧��WMSֱ�����ɱ���........
--�޸�: ������ 2013.9.9   �˻�ż���������ݹ�ȥ��,����û�д�������,�ڿ��ܵĵط����������...
--�޸ģ��� 2013.11.6 ��ֲ��R5.
--�޸ģ��� 2013.11.26 �����ж����յ�,����ش����ݲ���ȫʱ������˵��ݡ�
--�޸�: ������ 2013.11.30 ��ֲ��R5��,���ɵ����ͳ��ⵥ,Flag���ó�3
--�޸ģ�gyf    2015.03.30  �����˻���¼���ӵ�FreshWMS_SheetGoodsCostInfo���� 
--�޸�: �� 2015.04.01 �������á������ջ�����ȡֵ�������յ��Ŀ��ƣ�����Ϊ0ʱ������ȡ��ǰ���ۣ����ౣ�ֲ���.
--�޸ģ��� 2015.09.07 ���ӡ����������˻������ӿڡ�
--modify by qiudan:2016.09.06 Add Cost Value into FreshWMS_SheetGoodsCostInfo,When wms pass Goods' goodscostid record of retcostitem.
--�޸ģ��� 2016.12.27 ���ӡ�����֪ͨ�����ӿڣ��ɶ�γ��⡣
--�޸ģ��� 2017.02.17 ����������һ����Ʒ������¼�޷�ͨ��������.
--�޸ģ�caichengming 2017-09-13 ��������֪ͨ����WMS�ӿ�,֪ͨ���ӿڵ�������sheettype=2450 +1
--�޸ģ�caichengming 2018-02-17 �����������ɳ��ⵥ����ȡ�����,������Ʒȡ��Ӧ��Ӧ�̽���
--�޸ģ��� 2022.07.19 �������ǰ���жϿ�棬��治�㲻����
--�޸ģ������� 202210.19 e150603 ���²��������г����˲����������µ����յ��ش�û�а�WMS���μ���
--�޸ģ�caichengming 2023.03.14 eCare159361 ����������������
--�޸ģ������� 2023.0331 �������յ������Ŵ�������
--�޸ģ������� 2023.7.10 ���յ�����ƽ���������ӹ�����������
-----------------------------------------------------------------
  declare @Err			int;
  declare @BreakPoint		int;
  declare @ISAM			int;
  declare @Msg			varchar(1000);
  declare @GoodsID		int;
  declare @Cnt			int;
  declare @VenderID		int;
  declare @Qty			dec(12,3);
  declare @Qty1			dec(12,3);
  declare @ShopID		char(6)
  declare @RefSheetID		char(32);
  declare @RefSheetID2		char(32);
  declare @RefSheetType		int;
  declare @UpNoteType		int;
  declare @VenderType 		char(1);
  declare @Paytypeid		char(2);
  declare @Count		int;
  declare @Count1		int;
  declare @Count2		int;
  declare @ASheetID		varchar(16);
  declare @SnDate		datetime;
  declare @SendNO               varchar(20);
  declare @HeadShopID		char(4);
  declare @HeadShopType		int;
  declare @MyShopID		char(4);
  declare @MyShopType		int;
  declare @BatchFlag		int;
  declare @RealQty		dec(12,3);
  declare @Pursheetid		char(16);
  declare @ERPSheetType		int;
  declare @FixString		varchar(10);
  declare @NewSheetID		varchar(16);
  declare @PlaceID		int;
  declare @CostFlag		int;
  declare @RationSheetID	varchar(20);
  declare @LevelValue 		int;
  declare @inShopID		varchar(10);
  declare @inShopName	varchar(64);
  declare @Operator		varchar(8);
  declare @ManageDeptID		int;
  declare @StockPlaceMode	int;
  declare @i_ReqID  		int;
  declare @OASQL		varchar(256);
  declare @IASQL		varchar(256);
  declare @value 		varchar(255);
  declare @Logistics		int;
  declare @PreFixString		varchar(1);
  declare @NoteSheetID		varchar(20);
  declare @Notes		varchar(300);
  declare @SDate		datetime;
  declare @LastUpdateTime	datetime;
  declare @TranSheetID		varchar(20);
  declare @MoneyFlag		int;
  declare @FreshWMSManage 	varchar(1000); --�����ֿ������
  declare @OrderPKNumType 	int;
  declare @RationPKNumType 	int;
  declare @MasterVenderID	int;  
  declare @ChanageType		int;
  declare @VenderPayableFlag	int;
  declare @Deptid		int;
  declare @TaxRate		dec(5,2);
  declare @Cost			dec(12,4);
  declare @MachineFlag		int;	
  declare @NewCostFlag int;
  declare @FreshWMSFlag int;
  declare @Str 	varchar(1000);
  DECLARE @fyNewSheetID CHAR(16);
  DECLARE @basecost DEC(16,4);
  DECLARE @goodscostid INT;

  SET NOCOUNT ON
  SET XACT_ABORT ON			--�ֲ�ʽ�������
  SET ANSI_NULLS ON			--�ֲ�ʽ�������
  SET ANSI_WARNINGS ON			--�ֲ�ʽ�����

  execute @Err=TL_GetMyShopID @MyShopID output,@HeadShopID output,@MyShopType output,@HeadShopType output;
  if @Err <> 0 or @Err is null begin
      select @Msg='ȡ����Ŵ���';
      goto ErrHandle;
  END;

  select @NewCostFlag=value from config where name='wms�ش��ջ�����ȡֵ';
  if @NewCostFlag is null select @NewCostFlag=0;

  execute @LevelValue=Tl_managedeptgene; --TL_ManageDeptGene;

  select @StockPlaceMode=value from Config with (NOLOCK) where name='����������ع���ʽ';
  if @StockPlaceMode <> 1 select @StockPlaceMode=0;

  select @FreshWMSManage = ',' + Isnull(Value, '') + ','
  from   Config
  where  Name = '�����ֿ������';

  select @SheetID=Cast(@SheetID as Varchar(32));
  --ȥ��ǰ׺�ĵ���
  select @ASheetID=Cast(SubString(@SheetID,2,16) as Varchar(16));
  select @FixString=SubString(@SheetID,1,1);
  select @ERPSheetType=SheetType From Sheet_PreFixString where FixString=@FixString and WMSType='CalsWMS';
  select @sheetid,@asheetid
  
  --if len(@SheetID)<>17 select @ERPSheetType=-1;

  select @BreakPoint = 9721400;
  --2211 �����ϴ� 	InterFaceWMSDB.dbo.FR_RECEIPT       --ͬʱ����ּ�������
  --2231 �����ϴ� 	InterFaceWMSDB.dbo.FR_RATIONNOTE
  --2252 �˹�Ӧ���ϴ� 	InterFaceWMSDB.dbo.FR_RET
  --2253 �����˲��ϴ� 	InterFaceWMSDB.dbo.FR_RetRATION     --ͬʱ����ּ��������
  --2274 �̵�ӯ�����ϴ� 	InterFaceWMSDB.dbo.FR_PDYK
  --2275 �̵�¼�뵥�ϴ� 	InterFaceWMSDB.dbo.FR_PDInPut
  --9400 ���ͬ���ϴ� 	InterFaceWMSDB.dbo.FR_Stock
  --2317 ������������ϴ� 	InterFaceWMSDB.dbo.FR_DPDY
  IF @SheetType = 2211 BEGIN	--���յ����� InterFaceWMSDB.dbo.FR_RECEIPT

    IF @ERPSheetType=2344 BEGIN
        select @Count=Count(*) From Transfer0 where SheetID=@ASheetID;
       if @Count=0 begin
		 select @Msg='�ּ������ⵥ�Ҳ���Դ���ݣ�';
         goto ErrHandle;
       END;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;

       --���µ������ⵥʵ����
       select @GoodsID=null;
--select a.inqty,b.qty,a.goodsid from TransferItem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b
 --      where a.SheetID=@ASheetID and b.refSheetID=@SheetID and a.GoodsID=b.GoodsID and a.inqty<>b.qty;
       select @GoodsID=a.GoodsID from TransferItem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b
       where a.SheetID=@ASheetID and b.refSheetID=@SheetID and a.GoodsID=b.GoodsID and a.INQty<>b.Qty;
       if @GoodsID is not null begin
         select @Msg='��Ʒ'+cast(@GoodsID as varchar(10))+'��ʵ����������WMSʵ������';
         goto ErrHandle;
       END;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;
       
       select @ManageDeptID=managedeptid FROM Transfer0 WHERE sheetid=@ASheetID;
       
       --����ȡ�������ۣ�������ԭ�н��۲���
       if Charindex(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) > 0  
         SELECT @NewCostFlag=1;

       select @Count=Count(*) from TransferItem0 where sheetid=@ASheetID;

       IF @NewCostFlag=0  --ȡ��ǰ����
         INSERT INTO FreshWMS_SheetGoodsCostInfo
         (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2344,@ASheetID,a.LotNo,a.GoodsID,case when ISNUMERIC(a.VenderID)=0 then -1 else a.VenderID end,-1,a.Qty
         from interfaceWMSDB.dbo.FR_RECEIPT a
         WHERE  RefSheetID=@SheetID and Qty<>0 and (LotNo<>-1 OR (@ManageDeptID IN (351,352) AND LotNo=-1))  ;   
       else
         INSERT INTO FreshWMS_SheetGoodsCostInfo
         (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2344,@ASheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,Cost,Qty
         from interfaceWMSDB.dbo.FR_RECEIPT where RefSheetID=@SheetID and Qty<>0 and (LotNo<>-1 OR (@ManageDeptID IN (351,352) AND LotNo=-1))  ; 
       if @@RowCount>@Count begin
         select @Msg='���յ���Ӧ��Ʒ���ϲ���ȫ��δ���ش��������ɱ��壡';
         select @Err=-1;
         goto ErrHandle;
       END;  /**/  

       --�Զ���˵������ⵥ
       exec @Err=ST_Transfer @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�ּ������ⵥ��˴���!'
		goto ErrHandle;
       END;
      return 0;
    END;   

     select @Count2=0;
     select @Count2=Count(*) from Receipt where SheetID=@ASheetID;
   
     if @Count2=0
       select @Count2=Count(*) from CRReceipt where SheetID=@ASheetID; 
  
     if @Count2>0
     begin
           select @Msg='���յ��Ѿ������� or 99��¼,�������ظ�����!'
           goto ErrHandle;     
     END;

     select @Count=0;
     select @Count=Count(*) from Receipt0 where SheetID=@ASheetID and flag=3;

   
     if @Count=0
       select @Count=Count(*) from CRReceipt0 where SheetID=@ASheetID and flag=3;

     --Ҫͬʱ������ͨ����,�󶩵��ͽ��������ϴ������.....
     IF @ERPSheetType=2301 OR @Count=0
     BEGIN  
       select @Count=Count(*) from Receipt0 where SheetID=@ASheetID;
       --֧���޶����ջ�ģʽ....
      /* IF @Count=0
       BEGIN
         select @count=0;
         select @Count=count(*) from Receipt0 where refsheetid=@Sheetid;
         select @Count=@Count+count(*) from Receipt where refsheetid=@Sheetid;

         --�����Ѿ��ϴ�,�����ظ�,����������...
         if @Count>0
         begin
           select @Msg='WMS�������յ��Ѿ������յ���¼,�������ظ�����!'
           goto ErrHandle;
         END;         
         execute @Err=TL_GetNewSheetID 2301,@NewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='���յ��Ų���ʧ��!'
              goto ErrHandle;
         END;

         --�������
         select @OrderPKNumType=OrderPKNumType from ShopType where ShopTypeID = 21;
         if Object_id('#GoodsPKNum') is not null drop table #GoodsPKNum;

         create table #GoodsPKNum
         (
           GoodsID int not null,
           PKNum int default 1 not null,		--��������
           PKName char(8) default '��' not null,		--������λ
           PKSpec char(32) default '1*1' not null, 	--�������
         );

         create index i1_TMP_GoodsPKNum on #GoodsPKNum(GoodsID);

         --��ͼ�����ȡ������ļ�װ��
         insert into #GoodsPKNum
         select DISTINCT a.GoodsID,1,'',''
         From InterFaceWMSDB.dbo.FR_RECEIPT a where a.RefSheetID=@SheetID;

         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

         --��һ����ȡ��ת��ļ�װ��
         update #GoodsPKNum
         set    PKNum = b.PKNum,
                PKName = b.PKName,
                PKSpec = b.PKSpec
         from   #GoodsPKNum a,Barcode b
         where  a.GoodsID = b.GoodsID and b.Flag = 1

         --������ȡ����GoodsPKNum�ж����
         if @OrderPKNumType = 1
         begin
           update #GoodsPKNum
           set    PKNum = b.OrderPKNum1,
                  PKName = b.OrderPKName1,
                  PKSpec = b.OrderPKSpec1
           from   #GoodsPKNum a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END
         ELSE IF @OrderPKNumType = 2
         begin
           update #GoodsPKNum
           set    PKNum = b.OrderPKNum2,
                  PKName = b.OrderPKName2,
                  PKSpec = b.OrderPKSpec2
           from   #GoodsPKNum a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END;
         ELSE IF @OrderPKNumType = 3
         BEGIN
           update #GoodsPKNum
           set    PKNum = b.OrderPKNum3,
                 PKName = b.OrderPKName3,
                 PKSpec = b.OrderPKSpec3
           from   #GoodsPKNum a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END;

         select @ManageDeptID=b.sgroupid,@Paytypeid=b.paytypeid,@Venderid=b.venderid,@MasterVenderID=b.MasterVenderID
         from (select distinct venderid from InterFaceWMSDB.dbo.FR_RECEIPT where Refsheetid=@Sheetid) a,vender b
         where a.venderid=b.venderid;

         
         select @Operator=max(Operator) from InterFaceWMSDB.dbo.FR_RECEIPT where Refsheetid=@Sheetid;

         --����Ĭ�ϴ����
         select @PlaceID=null;
         if @StockPlaceMode=0 begin	--��������
		   execute TL_DeptPlace 0,@ManageDeptID, @PlaceID out;
		   IF @PlaceID IS NULL SELECT @PlaceID=0
         END
         ELSE BEGIN			--��ҵ�����͹���
		   select @PlaceID=ID from place where type=2 and clearflag=0 and Flag=0;	--����/����
		   select @Err = @@error;
		   if @Err != 0 goto ErrHandle;
		   IF @PlaceID IS NULL BEGIN
			 select @Msg='��������ô���!';
			 goto ErrHandle;
		  END
         END

         if Charindex(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) > 0  --����ȡ�������ۣ�������ԭ�н��۲���
            select @NewCostFlag=1;
	     --д���ͷ
     
	     SELECT @SendNO=MAX(sheetid) FROM interfaceWMSDB.dbo.FR_RECEIPT WHERE refSheetID=@sheetid;
         Insert into Receipt0
	     (SheetID,RefSheetID,ShopID,ManageDeptID,ReceiptFlag,VenderID,PayTypeID,Logistics,Notes,
	      Flag,Editor,EditDate,Operator,Checker,CheckDate,PlaceID,MasterVenderID)
         Values(@NewSheetID,@SendNO,@MyShopID,@ManageDeptID,3,@VenderID,@PayTypeID,1,'WMS�ϴ��������յ�',0,@Operator,Getdate(),@Operator,@Operator,Getdate(),@PlaceID,@MasterVenderID)
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

	     --д�����
         Insert into ReceiptItem0
	      (SheetID,GoodsID,BarCodeID,PKNum,DeptID,OrderQty,OrderPresentQty,Qty,PresentQty,Cost,Price,Taxrate,PromFlag,PkName,PkSpec,notes,ProductDate)
         select @NewSheetID,a.GoodsID,b.barcodeID,c.pknum,b.deptid,0,0,a.qty,0,case when @NewCostFlag=0 OR a.cost=0 then e.cost else a.cost end,d.price,e.costtaxrate,e.promflag,c.pkname,c.pkspec,'', a.ProductDate
         from (select RefSheetID,GoodsID,Sum(Qty) as Qty,Sum(Qty*Cost)/Sum(Qty) as Cost,max(Venderid) as venderid,ProductDate 
         from InterFaceWMSDB.dbo.FR_RECEIPT where Qty<>0 and RefSheetID=@SheetID Group by RefSheetID,GoodsID,ProductDate) a,goods b,#GoodsPKNum c,goodsshop d,cost e
         where a.RefSheetID=@SheetID and a.goodsid=b.goodsid and a.goodsid=c.goodsid and a.goodsid=d.goodsid and d.shopid=@myshopid and a.goodsid=e.goodsid
         and e.shopid=@myshopid and e.venderid=a.venderid;

         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
     
         select @Count=isnull(count(*),0) from ReceiptItem0 where SheetID=@NewSheetid;
         IF @NewCostFlag=0  --ȡ��ǰ����
           INSERT INTO FreshWMS_SheetGoodsCostInfo
           (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
           SELECT DISTINCT 2301,@Newsheetid,a.LotNo,a.GoodsID,CASE WHEN ISNUMERIC(a.VenderID)=0 THEN -1 ELSE a.VenderID END,b.Cost,a.Qty
           FROM interfaceWMSDB.dbo.FR_RECEIPT a,cost b WHERE a.GoodsID=b.GoodsID AND a.VenderID=b.VenderID AND
           a.RefSheetID=@SheetID AND Qty<>0 AND LotNo<>-1
         ELSE
         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2301,@Newsheetid,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,Cost,Qty
         from interfaceWMSDB.dbo.FR_RECEIPT where RefSheetID=@SheetID and Qty<>0 and LotNo<>-1;   
         if @@RowCount>@Count begin
           select @Msg='���յ���Ӧ��Ʒ���ϲ���ȫ��δ���ش��������ɱ��壡';
           select @Err=-1;
           goto ErrHandle;
         END;    

      	 exec @Err=ST_Receipt @NewSheetID,'WMS';
	 if @@error !=0 select @Err=@@error
	 if (@Err is null) or (@Err <> 0) begin
		select @Msg='���յ���˴���!'
		goto ErrHandle;
	 END;    
	  
	  IF EXISTS (SELECT 1 FROM interfaceWMSDB.dbo.fr_receipt WHERE RefSheetID=@sheetid AND cost<>base_cost)
	    BEGIN 
	    SELECT @BreakPoint=22038001
         execute @Err=TL_GetNewSheetID 220381,@fyNewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='���ʷ��õ���������ʧ��!'
              goto ErrHandle;
              END
       INSERT INTO dbo.FreshExpense0
              ( SheetID ,Flag , Editor ,EditDate ,Operator , Checker ,CheckDate ,ShopID , RefSheetID,SheetFlag)
       Values(@fyNewSheetID,0,'WMS',GETDATE(),'WMS',@Operator,Getdate(),@MyShopID,@NewSheetID,0)
       INSERT INTO dbo.FreshExpenseItem0
               ( SheetID ,goodsid , subitem_iid ,Cost ,CostValue)
       SELECT @fyNewSheetID,goodsid,ROW_NUMBER()OVER(ORDER BY GOODSID) ,base_cost ,base_cost*qty FROM interfaceWMSDB.dbo.FR_RECEIPT
       WHERE refsheetid=@sheetid;
       
       EXEC @Err=ST_ReceiptExpense @fyNewSheetID,'WMS';
	 if (@Err is null) or (@Err <> 0) begin
		select @Msg='���ʷ��õ���˴���!'
		goto ErrHandle;
	 END;   
	 
      UPDATE Receipt SET KXCalculated=1 WHERE SheetID=@NewSheetID ;
      END
       END else */  BEGIN --�������յ�......
	     Update Receiptitem0
	     Set Qty=0,PresentQty=0
       	 where SheetID=@ASheetID;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

      	 Update Receipt0
      	 Set Flag=0
      	 where SheetID=@ASheetID;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

         select @ManageDeptID =ManageDeptID From Receipt0 where SheetID=@ASheetID;         
         IF CHARINDEX(',' + CAST(@ManageDeptID AS VARCHAR(50)) + ',', @FreshWMSManage) > 0 	--�����ֿⲿ�൥��
           AND EXISTS(SELECT 1 FROM interfaceWMSDB.dbo.FR_RECEIPT WHERE refSheetID=@SheetID AND LotNo<>-1)
         BEGIN
           IF object_id('tempdb..#FR_RECEIPT') IS NOT NULL DROP TABLE #FR_RECEIPT;

           Create table #FR_RECEIPT
           (
               SheetID	varchar(20)	not null,	--ERP���ݱ���
               GoodsID	int		not null,	--��Ʒ����
               Cost	dec(12,4)	not null,	--ƽ������
               Qty	dec(12,3)	not null,	--��������
               CostValue dec(12,4)	not NULL,	--�ܳɱ�
               ProductDate DATETIME
           );

           Insert into #FR_RECEIPT
             (SheetID,GoodsID,Cost,Qty,CostValue,ProductDate)
           select RefSheetID,GoodsID,SUM(Cost*Qty)/SUM(Qty),SUM(Qty),SUM(Cost*Qty),MIN(ProductDate) From InterFaceWMSDB.dbo.FR_RECEIPT where RefSheetID=@SheetID Group by RefSheetID,GoodsID;
           select @Err = @@error;
           if @Err != 0 goto ErrHandle;
 
          /* Update #FR_RECEIPT
           Set Cost=CostValue/(a.Qty-b.OrderPresentQty)
           From #FR_RECEIPT a,Receiptitem0 b
           where a.SheetID=@SheetID and a.SheetID=@FixString+b.SheetID and a.GoodsID=b.GoodsID and (a.Qty-b.OrderPresentQty)<>0;
           select @Err=@@Error; if @Err!=0 goto ErrHandle;*/
            
           --���ȷ�̯��Ʒ
           --1. ʵ������С�ڵ�����Ʒ����,��ô��ȫ����������Ʒ
       	   Update Receiptitem0
       	   --Set PresentQty=b.Qty,Cost=b.Cost,ProductDate=B.ProductDate,Qty=0
       	   Set PresentQty=b.Qty,ProductDate=B.ProductDate,Qty=0
       	   From Receiptitem0 a,#FR_RECEIPT b
       	   where @FixString+a.SheetID=b.SheetID and a.GoodsID=b.GoodsID and b.SheetID=@SheetID and a.OrderPresentQty>=b.Qty;
           select @Err=@@Error; if @Err!=0 goto ErrHandle;
       	 
           --2. ʵ������������Ʒ��������ô������������Ʒ
       	   Update Receiptitem0
       	   --Set Qty=b.Qty-a.OrderPresentQty,PresentQty=a.OrderPresentQty,Cost=b.Cost,ProductDate=B.ProductDate
       	   Set Qty=b.Qty-a.OrderPresentQty,PresentQty=a.OrderPresentQty,ProductDate=B.ProductDate
       	   From Receiptitem0 a,#FR_RECEIPT b
       	   where @FixString+a.SheetID=b.SheetID and a.GoodsID=b.GoodsID and b.SheetID=@SheetID and a.OrderPresentQty<b.Qty;
           select @err=@@Error; if @err!=0 goto ErrHandle;

	         INSERT INTO FreshWMS_SheetGoodsCostInfo
            (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
           select distinct 2301,@ASheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,Cost,Qty
           from interfaceWMSDB.dbo.FR_RECEIPT
           where RefSheetID=@SheetID and (LotNo<>-1 or (@ManageDeptID IN (351,352) AND LotNo=-1));
           select @err=@@Error; if @err!=0 goto ErrHandle;
          
           --ȡƽ������
           update FreshWMS_SheetGoodsCostInfo 
           set Cost=round((b.Cost*b.Qty)/a.sumqty,4)
           from (select sheetid,sum(qty) sumqty,goodsid from FreshWMS_SheetGoodsCostInfo 
           WHERE sheetid=@ASheetID and SheetType=2301 group by sheetid,goodsid)  a, 
           Receiptitem0 b ,FreshWMS_SheetGoodsCostInfo c
           where  a.SheetID=@ASheetID and b.sheetid=@ASheetID and a.GoodsID=b.GoodsID
            and  c.SheetID =@ASheetID and c.SheetType=2301 and a.GoodsID=c.GoodsID and b.Qty<>a.sumqty;
               
         end else BEGIN              --���������൥��
          IF object_id('tempdb..#FR_RECEIPT1') IS NOT NULL DROP TABLE #FR_RECEIPT1;

           Create table #FR_RECEIPT1
           (
               SheetID	varchar(20)	not null,	--ERP���ݱ���
               GoodsID	int		not null,	--��Ʒ����
               Cost	dec(12,4)	not null,	--ƽ������
               Qty	dec(12,3)	not null,	--��������
               CostValue dec(12,4)	not NULL,	--�ܳɱ�
               ProductDate DATETIME
           );

           Insert into #FR_RECEIPT1
             (SheetID,GoodsID,Cost,Qty,CostValue,ProductDate)
           select RefSheetID,GoodsID,SUM(Cost*Qty)/SUM(Qty),SUM(Qty),SUM(Cost*Qty),MIN(ProductDate)
           From InterFaceWMSDB.dbo.FR_RECEIPT where RefSheetID=@SheetID Group by RefSheetID,GoodsID;
           select @Err = @@error;
           if @Err != 0 goto ErrHandle;
           --1. ʵ������С�ڵ�����Ʒ����,��ô��ȫ����������Ʒ
           Update Receiptitem0
       	   --Set PresentQty=b.Qty,Cost=b.Cost,ProductDate=B.ProductDate,Qty=0
       	   Set PresentQty=b.Qty,ProductDate=B.ProductDate,Qty=0
       	   From Receiptitem0 a,#FR_RECEIPT1 b
       	   where @FixString+a.SheetID=b.SheetID and a.GoodsID=b.GoodsID and b.SheetID=@SheetID and a.OrderPresentQty>=b.Qty;
           select @Err=@@Error; if @Err!=0 goto ErrHandle;
       	 
           --2. ʵ������������Ʒ��������ô������������Ʒ
       	   Update Receiptitem0
       	   --Set Qty=b.Qty-a.OrderPresentQty,PresentQty=a.OrderPresentQty,Cost=b.Cost,ProductDate=B.ProductDate
       	   Set Qty=b.Qty-a.OrderPresentQty,PresentQty=a.OrderPresentQty,ProductDate=B.ProductDate
       	   From Receiptitem0 a,#FR_RECEIPT1 b
       	   where @FixString+a.SheetID=b.SheetID and a.GoodsID=b.GoodsID and b.SheetID=@SheetID and a.OrderPresentQty<b.Qty;
           select @err=@@Error; if @err!=0 goto ErrHandle;
       
           if @NewCostFlag=0  BEGIN --ȡ��ǰ���� 
             Update ReceiptItem0 set cost=c.Cost  
             from Receiptitem0 a,receipt0 b,cost c
       	     where @FixString+a.SheetID=@SheetID and a.sheetid=b.sheetid AND b.VenderID=c.VenderID
             and a.GoodsId=c.GoodsID;
             select @Err=@@Error; if @Err!=0 goto ErrHandle;
                
	           INSERT INTO FreshWMS_SheetGoodsCostInfo---2021.06.03�� ���¹����Ρ�
             (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
             SELECT DISTINCT 2301,@ASheetID,a.LotNo,a.GoodsID,CASE WHEN ISNUMERIC(a.VenderID)=0 THEN -1 ELSE a.VenderID END,
             b.Cost,a.Qty
             FROM interfaceWMSDB.dbo.FR_RECEIPT a,cost b WHERE a.GoodsID=b.GoodsID AND a.VenderID=b.VenderID AND
             a.RefSheetID=@SheetID AND Qty<>0 AND (LotNo<>-1 OR (@ManageDeptID IN (351,352) AND LotNo=-1))  ; 
           END 
           ELSE BEGIN
             INSERT INTO FreshWMS_SheetGoodsCostInfo---2021.06.03�� ���¹����Ρ�
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
             SELECT DISTINCT 2301,@ASheetID,LotNo,GoodsID,CASE WHEN ISNUMERIC(VenderID)=0 THEN -1 ELSE VenderID END,Cost,Qty
             FROM interfaceWMSDB.dbo.FR_RECEIPT  WHERE RefSheetID=@SheetID AND Qty<>0 AND (LotNo<>-1 OR (@ManageDeptID IN (351,352) AND LotNo=-1))  ; 
           END
           --ȡƽ������
           update FreshWMS_SheetGoodsCostInfo 
           set Cost=round((b.Cost*b.Qty)/a.sumqty,4)
           from (select sheetid,sum(qty) sumqty,goodsid from FreshWMS_SheetGoodsCostInfo 
           WHERE sheetid=@ASheetID and SheetType=2301 group by sheetid,goodsid)  a, 
           Receiptitem0 b ,FreshWMS_SheetGoodsCostInfo c
           where  a.SheetID=@ASheetID and b.sheetid=@ASheetID and a.GoodsID=b.GoodsID 
            and  c.SheetID =@ASheetID and c.SheetType=2301 and a.GoodsID=c.GoodsID and b.qty<>a.sumqty;
         END;
      	 exec @Err=ST_Receipt @ASheetID,'WMS';
	       if @@error !=0 select @Err=@@error
	       if (@Err is null) or (@Err <> 0) begin
		       select @Msg='���յ���˴���!'
		       goto ErrHandle;
	       END;

		--δ֪��;
       /*IF EXISTS (SELECT 1 FROM interfaceWMSDB.dbo.fr_receipt WHERE RefSheetID=@sheetid AND cost<>base_cost)
	   BEGIN 
	     SELECT @BreakPoint=22038101
         execute @Err=TL_GetNewSheetID 220381,@fyNewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='���ʷ��õ���������ʧ��!'
              goto ErrHandle;
         END
         INSERT INTO dbo.FreshExpense0
              ( SheetID ,Flag , Editor ,EditDate ,Operator , Checker ,CheckDate ,ShopID , RefSheetID,SheetFlag)
         Values(@fyNewSheetID,0,'WMS',GETDATE(),'WMS',@Operator,Getdate(),@MyShopID,@NewSheetID,0)
         INSERT INTO dbo.FreshExpenseItem0
               ( SheetID ,goodsid , subitem_iid ,Cost ,CostValue)
         SELECT @fyNewSheetID,goodsid,ROW_NUMBER()OVER(ORDER BY GOODSID) ,base_cost ,base_cost*qty FROM interfaceWMSDB.dbo.FR_RECEIPT
         WHERE refsheetid=@sheetid;
       
         EXEC @Err=ST_ReceiptExpense @fyNewSheetID,'WMS';
	     if (@Err is null) or (@Err <> 0) begin
		   select @Msg='���ʷ��õ���˴���!'
		   goto ErrHandle;
	     END;   
	 
         UPDATE Receipt SET KXCalculated=1 WHERE SheetID=@NewSheetID ;
       END*/

       END;
     end else IF @ERPSheetType=2303 BEGIN
         select @ManageDeptID=ManageDeptID from CRReceipt0 where SheetID=@ASheetID;
         if Charindex(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) > 0  --����ȡ�������ۣ�������ԭ�н��۲���
            select @NewCostFlag=1;
	       Update CRReceiptitem0
	       Set Qty=0,PresentQty=0
       	 where SheetID=@ASheetID;
         select @err=@@Error; if @err!=0 goto ErrHandle;

         Update CRReceipt0
     	   Set Flag=0
         where SheetID=@ASheetID;
         select @err=@@Error; if @err!=0 goto ErrHandle;

         --���ȷ�̯��Ʒ
         --1. ʵ������С�ڵ�����Ʒ����,��ô��ȫ����������Ʒ
       	 Update CRReceiptitem0
       	 Set PresentQty=b.Qty,ProductDate=b.ProductDate
       	 From crReceiptitem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b
       	 where @FixString+a.SheetID=b.RefSheetID and a.GoodsID=b.GoodsID and b.RefSheetID=@SheetID and a.OrderPresentQty>=b.Qty;

         --2. ʵ������������Ʒ��������ô������������Ʒ
       	 Update CRReceiptitem0
       	 Set Qty=b.Qty-a.OrderPresentQty,PresentQty=a.OrderPresentQty,ProductDate=b.ProductDate
       	 From crReceiptitem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b
       	 where @FixString+a.SheetID=b.RefSheetID and a.GoodsID=b.GoodsID and b.RefSheetID=@SheetID and a.OrderPresentQty<b.Qty;

         if @NewCostFlag=0 --ȡ��ǰ����
           Update CRReceiptitem0 set cost=c.Cost  
           from CRReceiptitem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b,cost c
       	   where @FixString+a.SheetID=b.RefSheetID and a.GoodsID=b.GoodsID and b.VenderID=c.VenderID
           and a.GoodsId=c.GoodsID and b.RefSheetID=@SheetID ;
           select @Err=@@Error; if @Err!=0 goto ErrHandle;
           --�����Զ��ֲ�.....
           execute ST_CRReceiptAllot @ASheetID;

         IF @NewCostFlag=0 
          INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
          select distinct 2301,@ASheetID,a.LotNo,a.GoodsID,case when ISNUMERIC(a.VenderID)=0 then -1 else a.VenderID end,b.Cost,a.Qty
          from interfaceWMSDB.dbo.FR_RECEIPT a,cost b where a.goodsid=b.goodsid and a.VenderID=b.VenderID 
          and a.SheetID=@SheetID and a.LotNo<>-1;  
         else
         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2301,@ASheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,Cost,Qty
         from interfaceWMSDB.dbo.FR_RECEIPT where SheetID=@SheetID and LotNo<>-1;       

      	 exec @Err=ST_CRReceipt @ASheetID,'WMS';
	       if @@error !=0 select @Err=@@error
	       if (@Err is null) or (@Err <> 0) begin
		       select @Msg='ֱͨ�ջ���˴���!'
		       goto ErrHandle;
	       END;

		 --δ֪��;
	    /*IF EXISTS (SELECT 1 FROM interfaceWMSDB.dbo.fr_receipt WHERE RefSheetID=@sheetid AND cost<>base_cost)
	    BEGIN 
	    SELECT @BreakPoint=2203810001
         execute @Err=TL_GetNewSheetID 220381,@fyNewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='���ʷ��õ���������ʧ��!'
              goto ErrHandle;
              END
       INSERT INTO dbo.FreshExpense0
              ( SheetID ,Flag , Editor ,EditDate ,Operator , Checker ,CheckDate ,ShopID , RefSheetID,SheetFlag)
       Values(@fyNewSheetID,0,'WMS',GETDATE(),'WMS',@Operator,Getdate(),@MyShopID,@NewSheetID,0)
       INSERT INTO dbo.FreshExpenseItem0
               ( SheetID ,goodsid , subitem_iid ,Cost ,CostValue)
       SELECT @fyNewSheetID,goodsid,ROW_NUMBER()OVER(ORDER BY GOODSID) ,base_cost ,base_cost*qty FROM interfaceWMSDB.dbo.FR_RECEIPT
       WHERE refsheetid=@sheetid;
       
       EXEC @Err=ST_ReceiptExpense @fyNewSheetID,'WMS';
	 if (@Err is null) or (@Err <> 0) begin
		select @Msg='���ʷ��õ���˴���!'
		goto ErrHandle;
	 END;   
	 
      --UPDATE CRReceipt SET KXCalculated=1 WHERE SheetID=@NewSheetID ;
      END*/
       END;
       /*end else if @ERPSheetType=2342 begin         --�������
       select @Count=Count(*) From Transfer0 where SheetID=@ASheetID;

       if @Count=0 begin
		select @Msg='�ּ������ⵥ�Ҳ���Դ���ݣ�';
        	goto ErrHandle;
       end;

       --�޸ĵ���ԭ����������������������Ĭ�ϵ���֪ͨ������WMS��û�з��ض�Ӧ��Ϣ���У�������ɵĿ�治�ԡ�
       Update TransferItem0
       Set Inqty=0
       where SheetID=@ASheetID;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;

       --���µ������ⵥʵ����
       Update TransferItem0
       Set InQty=b.Qty
       From TransferItem0 a,InterFaceWMSDB.dbo.FR_RECEIPT b
       where @FixString+a.SheetID=b.RefSheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;

       select @Err = @@error;
       if @Err != 0 goto ErrHandle;

       --�Զ���˵�����ⵥ
       exec @Err=ST_Transfer @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�ּ������ⵥ��˴���!'
		goto ErrHandle;
       end;
    end;*/
  end else IF @SheetType=2231 BEGIN     --����֪ͨ,WMS�ϴ������嵥�������嵥�������ͳ��ⵥ.....     note

       declare Cur_RationDataNoNote cursor local for
          select distinct a.ShopID,Ceiling(b.DeptID/@LevelValue) from interfaceWMSDB..FR_RATIONNOTE a,Goods b 
          where a.GoodsID=b.GoodsID and a.SheetID = @SheetID and (a.RefSheetID='' OR a.RefSheetid='N' OR (SHEETID LIKE 'T%' AND  LEFT(a.RefSheetid,1) IN ('O','T')));
       open Cur_RationDataNoNote;   

       WHILE (1=1)
       Begin
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationDataNoNote into @inShopID,@ManageDeptID;
         if @@fetch_status != 0 break;
       
         --����Ĭ�ϴ����
         if @StockPlaceMode = 0
         begin --��������
           execute TL_Deptplace 0,@ManageDeptID,@PlaceID out;
           IF @PlaceID IS NULL
             SELECT @PlaceID = 0
         END ELSE BEGIN
             select @PlaceID = ID from   place
             where  type = 2 and clearflag = 0 and Flag = 0; --ȡ������
             select @Err = @@error;
             if @Err != 0 goto ErrHandle;

             IF @PlaceID IS NULL
             BEGIN
               select @Msg = '��������ô���!';
               goto ErrHandle;
             END
         END;
         --���͡�
          select @Count=0;

          select @Count=Count(*) from Ration0 where WMSSheetID=@SheetID and SheetID='' and ManageDeptID=@ManageDeptID;

          if @Count=0
          begin
            select @count=Count(*) from Ration where WMSSheetID=@SheetID and SheetID='' and ManageDeptID=@ManageDeptID;
          END;

          if @Count>0 
          begin
            select @Msg='�����嵥['+@SheetID+']�����Ѿ����������͵��ˣ��������ظ�����!'
            goto ErrHandle;
          END;       

          select @BreakPoint = 223005;
          execute @Err=TL_GetNewSheetID 2332,@NewSheetID output;
          if @Err <> 0 or @Err is null begin
         	select @Msg='���ͳ��ⵥ���Ų���ʧ��!'
              goto ErrHandle;
          END;

        --���͹��
         select @RationPKNumType = RationPKNumType from   ShopType        
         where  ShopTypeID = 21;
         if Object_id('#GoodsPKNum2') is not null drop table #GoodsPKNum2;
         create table #GoodsPKNum2
         (
           GoodsID int not null,
           PKNum int default 1 not null,		--��������
           PKName char(8) default '��' not null,		--���͵�λ
           PKSpec char(32) default '1*1' not null, 	--���͹��
         );

         --��ͼ�����ȡ������ļ�װ��
         insert into #GoodsPKNum2
         select DISTINCT a.GoodsID,1,'',''
         From interfaceWMSDB.dbo.FR_RATIONNOTE a where a.SheetID=@SheetID;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

         --��һ����ȡ��ת��ļ�װ��
         update #GoodsPKNum2
         set    PKNum = b.PKNum,PKName = b.PKName,PKSpec = b.PKSpec
         from   #GoodsPKNum2 a,Barcode b
         where  a.GoodsID = b.GoodsID and b.Flag = 1

         --������ȡ����GoodsPKNum�ж����
         if @RationPKNumType = 1
         begin
           update #GoodsPKNum2
           set    PKNum = b.RationPKNum1,PKName = b.RationPKName1,PKSpec = b.RationPKSpec1
           from   #GoodsPKNum2 a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END
         ELSE IF @RationPKNumType = 2
         begin
           update #GoodsPKNum2
           set    PKNum = b.RationPKNum2,PKName = b.RationPKName2,PKSpec = b.RationPKSpec2
           from   #GoodsPKNum2 a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END;
         ELSE IF @RationPKNumType = 3
         BEGIN
           update #GoodsPKNum2
           set   PKNum = b.RationPKNum3,PKName = b.RationPKName3,PKSpec = b.RationPKSpec3
           from   #GoodsPKNum2 a,GoodsPKNum b
           where  a.GoodsID = b.GoodsID and DCShopID = @MyShopID;
         END;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

	     insert into Ration0
             (SheetID,OutShopID,InShopID,ManageDeptID,PurDay,RationType,
              Flag,Editor,EditDate,Operator,Checker,CheckDate,            
              OutPlaceID,InPlaceID,Note,SheetFlag,Logistics,WMSSheetID,NoteSheetID,Batchflag)
         Values(@NewSheetID,@MyshopID,@InShopID,@ManageDeptID,100,'I',
              3,'WMS',getdate(),Cast(@Operator as varchar(8)),'WMS',getdate(),
              @PlaceID,@PlaceID,'�˵�����WMSǿ������',0,3,@SheetID,'',0);
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

         Insert into RationItem0
 	   (SheetID,GoodsCostID,GoodsID,DeptID,OutPrice,InPrice,PKNum,notifyQty,OutQty,InQty,CostValue,BadFlag,ReasonTypeID,Reason,SortID,PKName,PKSpec,ShopsstockQty,Notes)
         select @NewSheetID,a.LotNO,a.GoodsID,b.DeptID,c.Price,c.Price ,d.PKNum,0,RealQty,0,0,1,0,null,null,d.PKName,d.PKSpec,0,''
         From interfaceWMSDB.dbo.FR_RATIONNOTE a,Goods b,GoodsShop c,#GoodsPKNum2 d
         where a.SheetID=@SheetID and a.GoodsID=b.GoodsID and a.GoodsID=c.GoodsID and c.ShopID=@myShopID and a.GoodsID=d.GoodsID;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;        
         
         /*  --���¹������� 
         IF @ManageDeptID NOT IN (351,352)
         update Ration0 set Batchflag=1         
         where SheetID=@NewSheetID --and Charindex(',' + Cast(ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <> 0;
        */
        
         update Ration0 set Batchflag=1         
         where SheetID=@NewSheetID and Charindex(',' + Cast(ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <> 0  and ManageDeptID not in (351,352)

         select @Err = @@error;
         if @Err != 0 goto ErrHandle;        

         exec @Err=St_Ration @NewSheetID,'WMS';
         if @@error != 0
         select @Err = @@error;
         if ( @Err is null )  or ( @Err <> 0 )
         begin
           select @Msg = '���ͳ��ⵥ��˴���!'
           goto ErrHandle;
         END;                 
       END;
       CLOSE Cur_RationDataNoNote
       DEALLOCATE Cur_RationDataNoNote;
 
       select @PreFixString=FixString from Sheet_PreFixString where SheetType=2342;   
       declare Cur_RationData cursor local for
          select distinct c.SheetID from interfaceWMSDB..FR_RATIONNOTE a,Goods b, Transfer0 c 
          where a.GoodsID=b.GoodsID and a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID;
       open Cur_RationData;

       select @BreakPoint = 223001;

       WHILE (1=1)
       BEGIN
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData into @NoteSheetID;
         if @@fetch_status != 0 break; 

         update TransferItem0 set OutQty=b.Qty,InQty=b.Qty from TransferItem0 a,(select goodsid,sum(realqty) as qty from interfaceWMSDB..FR_RATIONNOTE
         where sheetid=@SheetID group by goodsid) b
         where a.GoodsID=b.GoodsID and a.sheetid=@NoteSheetID;
         select @Err=@@Error; if @Err!=0 goto ErrHandle;
         
         select @BreakPoint=223021;
         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2342,@NewSheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID and LotNo<>-1 and substring(Refsheetid,2,16)=@NoteSheetID;  
         select @Err=@@Error; if @Err!=0 goto ErrHandle;

        /* Exec @Err=ST_Transfer @NoteSheetID;
         if @Err!=0 or @Err is null begin
           select @Msg='��˵������ⵥ����';
           goto ErrHandle;
         end;*/
       END;
       Close Cur_RationData;
       DEALLOCATE Cur_RationData;
         

       select @PreFixString=FixString FROM Sheet_PreFixString where SheetType=2341;   
       declare Cur_RationData cursor local for
          select distinct floor(b.DeptID/@LevelValue),c.SheetID from interfaceWMSDB..FR_RATIONNOTE a,Goods b, TransferNote0 c 
          where a.GoodsID=b.GoodsID and a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID;
       open Cur_RationData;

       select @BreakPoint = 223001;

       WHILE (1=1)
       BEGIN
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData into @ManageDeptID,@NoteSheetID;
         if @@fetch_status != 0 break;    
      
         --����Ĭ�ϴ����
         if @StockPlaceMode = 0
         begin --��������
           execute TL_Deptplace 0,@ManageDeptID,@PlaceID out;
           IF @PlaceID IS NULL
             SELECT @PlaceID = 0
         END 
         ELSE BEGIN
           select @PlaceID = ID from place
           where type = 2 and clearflag = 0 and Flag = 0; --ȡ������
           select @Err = @@error;
           if @Err != 0 goto ErrHandle;

           IF @PlaceID IS NULL
           BEGIN
             select @Msg = '��������ô���!';
             goto ErrHandle;
           END
         END;
      
          select @BreakPoint=223008;
          Exec @Err=TL_GetNewSheetID 2342,@NewSheetID output;
          if @Err is null or @Err!=0 begin
            select @Msg='����������ⵥ���Ų�������';
            goto ErrHandle;
          END;
          select @BreakPoint=223009;
          Insert into Transfer0(SheetID,OutShopID,InShopID,PurDay,
	        Flag,Editor,EditDate,Operator,Checker,CheckDate,note,managedeptid,OutPlaceID,InPlaceID,
	        OutCMShopID,InCMShopID,OutCMShopName,InCMShopName,Inshopname,outShopname,wmsflag,wmssheetid,notesheetid)
          select @NewSheetID,OutShopID,InShopID,PurDay,
	        3,Editor,EditDate,Operator,Checker,CheckDate,note,managedeptid,@PlaceID,@PlaceID,
	        OutCMShopID,InCMShopID,OutCMShopName,InCMShopName,Inshopname,outShopname,wmsflag,@SheetID,@notesheetid
	      from TransferNote0
	      where SheetID=@NoteSheetID;
          select @Err=@@Error; if @Err!=0 goto ErrHandle;

          select @BreakPoint=223010;  ----20180816 jiayanmei  ���������������ֻ������������ ����������¼�ظ�����
          IF object_id('#TransferItem02') IS NOT NULL DROP TABLE #TransferItem02;
          
          select identity(int,1,1) as SerialID,SheetID,A.GoodsID,B.DeptID,C.Price as OutPrice,C.Price as InPrice,Pknum,
	      NotifyQty,CAST(0.00 AS DEC(12,3)) as OutQty,CAST(0.00 AS DEC(12,3)) as InQty,CAST(0.00 AS DEC(12,2)) as CostValue,a.PkName,a.PkSpec,a.notes
          into #TransferItem02
          from TransferNoteItem0 A, Goods B with (NOLOCK), GoodsShop C with (NOLOCK)
          where a.SheetID=@NoteSheetID and A.GoodsID=B.GoodsID and A.GoodsID=C.GoodsID and floor(b.DeptID/@LevelValue)=@ManageDeptID;
          select @Err=@@Error; if @Err!=0 goto ErrHandle;

          update #TransferItem02 set OutQty=b.Qty,InQty=b.Qty from #TransferItem02 a,(select REFSHEETID,goodsid,sum(realqty) as qty from interfaceWMSDB..FR_RATIONNOTE
          where sheetid=@SheetID group by goodsid,REFSHEETID) b 
          where a.GoodsID=b.GoodsID  and B.RefSheetID = @PreFixString+A.SheetID  ;
          select @Err=@@Error; if @Err!=0 goto ErrHandle;
  
          select @BreakPoint=223011;
          Insert into TransferItem0
	      (SheetID,GoodsID,DeptID,OutPrice,InPrice,Pknum,NotifyQty,OutQty,InQty,CostValue,PkName,PkSpec,SerialID,notes)
          select @NewSheetID,GoodsID,DeptID,OutPrice,InPrice,Pknum,NotifyQty,OutQty,InQty,CostValue,PkName,PkSpec,SerialID,notes
          From #TransferItem02;
          select @Err=@@Error; if @Err!=0 goto ErrHandle;

         select @BreakPoint=223021;
         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2342,@NewSheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID and LotNo<>-1 and substring(Refsheetid,2,16)=@NoteSheetID;  
         select @Err=@@Error; if @Err!=0 goto ErrHandle;

          Drop table #TransferItem02;
          select @Err = @@error;
          if @Err != 0 goto ErrHandle;  
          
          select @BreakPoint=223012;
          Exec @Err=ST_Transfer @NewSheetID,'WMS';
          if @Err is null or @Err!=0 goto ErrHandle;

        END;
        close Cur_RationData;
        deallocate Cur_RationData; 
    
       select @PreFixString=FixString FROM Sheet_PreFixString where SheetType=2330;

    
       declare Cur_RationData cursor local for
          select distinct a.ShopID,Ceiling(b.DeptID/@LevelValue),c.SheetID,c.Logistics from interfaceWMSDB..FR_RATIONNOTE a,Goods b, RationNote c 
          where a.GoodsID=b.GoodsID and a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID and a.RefSheetID<>'';

       open Cur_RationData;

       select @BreakPoint = 223001;

       WHILE (1=1)
       Begin
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData into @inShopID,@ManageDeptID,@NoteSheetID,@Logistics;
         if @@fetch_status != 0 break;
         
         select 2;

         --����Ĭ�ϴ����
         if @StockPlaceMode = 0
         begin --��������
           execute TL_Deptplace 0,@ManageDeptID,@PlaceID out;
           IF @PlaceID IS NULL
             SELECT @PlaceID = 0
         END ELSE BEGIN
             select @PlaceID = ID from   place
             where  type = 2 and clearflag = 0 and Flag = 0; --ȡ������
             select @Err = @@error;
             if @Err != 0 goto ErrHandle;

             IF @PlaceID IS NULL
             BEGIN
               select @Msg = '��������ô���!';
               goto ErrHandle;
             END
         END;

         select @BreakPoint = 223010;      

         select @Count=0;

         select @Count=Count(*) from Ration0 where WMSSheetID=@SheetID and SheetID=@NoteSheetID and ManageDeptID=@ManageDeptID;

         if @Count=0
         begin
            select @count=Count(*) from Ration where WMSSheetID=@SheetID and SheetID=@NoteSheetID and ManageDeptID=@ManageDeptID;
         END;

         if @Count>0 
         begin
              select @Msg='�����嵥['+@SheetID+']�����Ѿ����������͵��ˣ��������ظ�����!'
              goto ErrHandle;
         END;


         select @BreakPoint = 223005;
         execute @Err=TL_GetNewSheetID 2332,@NewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='���ͳ��ⵥ���Ų���ʧ��!'
              goto ErrHandle;
         END;

	    insert into Ration0
             (SheetID,OutShopID,InShopID,ManageDeptID,PurDay,RationType,
              Flag,Editor,EditDate,Operator,Checker,CheckDate,            
              OutPlaceID,InPlaceID,Note,SheetFlag,Logistics,WMSSheetID,NoteSheetID)
         Values(@NewSheetID,@MyshopID,@InShopID,@ManageDeptID,100,'I',
              3,'WMS',getdate(),Cast(@Operator as varchar(8)),'WMS',getdate(),
              @PlaceID,@PlaceID,'�˵�����WMS�Զ�����',0,@Logistics,@SheetID,@NoteSheetID)

         select @Err = @@error;
         if @Err != 0 goto ErrHandle;

         select @BreakPoint = 223015;

         select @FixString=FixString From Sheet_PreFixString where SheetType=2330 and WMSType='CalsWMS';

         insert into RationItem0
         (
           SheetID,goodscostid,GoodsID,DeptID,OutPrice,InPrice,Pknum,NotifyQty,OutQty,InQty,CostValue,BadFlag,ReasonTypeID,Reason,sortid,PkName,PkSpec,notes
         )
         select @NewSheetID,a.LotNO,a.GoodsID,b.DeptID,D.Price,D.Price,c.PKNum,c.NotifyQty,a.RealQty,0,0,c.BadFlag,c.ReasonTypeID,c.Reason,c.SortID,c.PKName,c.PKSpec,Notes
         from interfaceWMSDB.dbo.FR_RATIONNOTE a,Goods b,RationNoteitem c,GoodsShop d, RationNote f
         where a.GoodsID=b.GoodsID and c.SheetID = f.SheetID and a.GoodsID=d.GoodsID and
         Ceiling(b.DeptID/@LevelValue)=@ManageDeptID and a.SheetID=@SheetID and a.refSheetid=@FixString+c.SheetID
         and a.GoodsID = c.GoodsID and f.SheetID=@NoteSheetID                    
          /*--���¹�������
         update Ration0
         set Batchflag=1
         where SheetID=@newSheetID --and Charindex(',' + Cast(ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <> 0;
         
         update Ration0
         set Batchflag=1
         where SheetID=@newSheetID --and Charindex(',' + Cast(ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <> 0;
         */
         
         /*
         select @BreakPoint = 223025;
         insert into WMSRationRelation(RationSheetID,NoteSheetID,GoodsID,Qty)
         select @NewSheetID,@RationSheetID,A.GoodsID,a.RealQty
         from   InterFaceWMSDB.dbo.FR_RATIONNOTE A,Goods B with (NOLOCK),GoodsShop C with (NOLOCK), RationNote d, RationNoteitem E
         where  a.RefSheetid = @FixString+d.SheetID and a.RefSheetID = @RationSheetID and d.SheetID = e.SheetID and a.GoodsID = e.GoodsID
         a.SheetID = @ASheetID and A.GoodsID = B.GoodsID and A.GoodsID = C.GoodsID and d.Logistics = @Logistics and a.GoodsID = e.GoodsID and
         C.ShopID = A.ShopID and a.GoodsID = @GoodsID;

         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
         */

         select @BreakPoint = 223030;
         exec @Err=St_Ration @NewSheetID,'WMS';

         if @@error != 0
         select @Err = @@error;
         if ( @Err is null )  or ( @Err <> 0 )
         begin
               select @Msg = '���ͳ��ⵥ��˴���!'
               goto ErrHandle;
         END;
       END;

       CLOSE Cur_RationData
       DEALLOCATE Cur_RationData

       --�����������͵�����.....
       select @PreFixString=FixString from Sheet_PreFixString where SheetType=2331;            
       declare Cur_RationData2 cursor local for
          select distinct a.RefSheetID from interfaceWMSDB..FR_RATIONNOTE a,Ration0 c 
          where a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID and Charindex(',' + Cast(c.ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <> 0
           	
       open Cur_RationData2;
       select @BreakPoint = 223001;
       WHILE (1=1)
       Begin
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData2 into @NoteSheetID;
         if @@fetch_status != 0 break;

         select @count=Count(*) from ration0 where notesheetid=@notesheetid and @PreFixString+sheetid=@notesheetid;
  
         if @count=0
         begin
           --֤�������ǵ�һ�δ���...
           update rationitem0 set outqty=0          
           where sheetid=@notesheetid;           
         END;

         update Ration0 set NoteSheetID=@NoteSheetID        
         where SheetID=@NoteSheetID;

         update Rationitem0 set outqty=b.Realqty        
         from Rationitem0 a,interfacewmsdb.dbo.FR_RATIONNOTE b
         where a.goodscostid=b.lotNO and b.sheetid=@Sheetid and b.RefSheetID = @PreFixString+a.SheetID and a.sheetid=@NoteSheetID;        

       END;
       CLOSE Cur_RationData2;
       DEALLOCATE Cur_RationData2;

       
       --�����������õ�����.....
             select @PreFixString=FixString from Sheet_PreFixString where SheetType=2423;   
       declare Cur_RationData3 cursor local for
          select distinct SubString(a.RefSheetid,2,20) from interfaceWMSDB..FR_RATIONNOTE a,XTran0 c 
          where a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID --and Charindex(',' + Cast(c.ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <>0 
           	
       open Cur_RationData3;
       select @BreakPoint = 223001;
       WHILE (1=1)
       BEGIN
         --if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData3 into @NoteSheetID;
         if @@fetch_status != 0 break;
         IF object_id('tempdb..#realqty') IS NOT NULL DROP TABLE #realqty;  
         select goodsid,sum(RealQty) realqty INTO #realqty FROM InterFaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID AND RefSheetid=@PreFixString+@NoteSheetID GROUP by GoodsID;
         UPDATE XTranItem0 SET qty=b.realqty FROM XTranItem0 a,#realqty b WHERE a.goodsid=b.goodsid AND  sheetid=@NoteSheetID;

         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2423,SubString(RefSheetID,2,20),LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID and LotNo<>-1 and  RefSheetid=@PreFixString+@NoteSheetID;   
         
         DROP TABLE #realqty ; 
         UPDATE XTran0 SET Flag=0 WHERE SheetID=@NoteSheetID;
        exec @Err=ST_XTran @NoteSheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�������õ���˴���!'
		goto ErrHandle;
       END;
      
       END;
       CLOSE Cur_RationData3;
       DEALLOCATE Cur_RationData3;
   
  
       select @PreFixString=FixString from Sheet_PreFixString where SheetType=2450;   
       declare Cur_RationData4 cursor local for
          select distinct floor(b.DeptID/@LevelValue),c.SheetID 
          from interfaceWMSDB..FR_RATIONNOTE a,Goods b with(NOLOCK),WholeSaleNote0 c 
          where a.refSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID AND a.goodsid=b.GoodsID
          -- and Charindex(',' + Cast(c.ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <>0 
           	
       open Cur_RationData4;
       select @BreakPoint = 223001;
       WHILE (1=1)
       BEGIN
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData4 into @ManageDeptID,@NoteSheetID;
         if @@fetch_status != 0 break;
         
         --0=���� 1=����
         if CHARINDEX(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) > 0
            select @FreshWMSFlag = 1
         ELSE
            SELECT @FreshWMSFlag = 0;
         
         select @BreakPoint=223051;
         Exec @Err=TL_GetNewSheetID 2451,@NewSheetID output;
         if @Err is null or @Err!=0 begin
            select @Msg='���������뵥�Ŵ���';
            goto ErrHandle;
         END;
         
         select @BreakPoint=223053;
         if object_id('tempdb..#WholeSaleItem') is not null
           drop table #WholeSaleItem;
         
         select identity(int,1,1) as SerialID,a.SheetID,a.GoodsID,PKNum,cast(0 AS dec(12,3)) AS Qty,Price,
           PkName,PkSpec,cast(0 AS DEC(12,3)) as PlanQty,Notes,PKPrice,-1 AS GoodscostID,cast(0 AS DEC(12,3)) WholeQty,
           cast(0 AS DEC(12,3)) GiftQty
         into #WholeSaleItem
         from WholeSaleNoteItem0 a, Goods b with(NOLOCK)
         where a.SheetID=@NoteSheetID and a.GoodsID=b.GoodsID and floor(b.DeptID/@LevelValue)=@ManageDeptID ;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
         
         select @BreakPoint=223054;
         update #WholeSaleItem set Qty=b.Qty,PlanQty=b.Qty,WholeQty=b.Qty
         from #WholeSaleItem a,(select GoodsID,Sum(RealQty) Qty from interfaceWMSDB..FR_RATIONNOTE 
         WHERE SheetID=@SheetID AND RefSheetid=@PreFixString+@NoteSheetID group by GoodsID) b
         where a.GoodsID=b.GoodsID;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
  
        select @BreakPoint=223058;
        IF @FreshWMSFlag=0 
        begin
         select @Str = '';
         select @Str=@Str + CAST(x.GoodsID AS VARCHAR(10))+ ',' from (
           select SheetID,GoodsID,sum(Qty) Qty from (
             select RefSheetID as SheetID,GoodsID,Qty from WholeSaleItem a, WholeSale b
             where a.SheetID=b.SheetID and b.RefSheetID=@NoteSheetID
             union all
             select SheetID,GoodsID,Qty from #WholeSaleItem
           ) e group by SheetID,GoodsID
         ) x, WholeSaleNoteItem0 y
         where x.SheetID=y.SheetID and x.GoodsID=y.GoodsID and x.Qty>y.Qty;
         if len(@Str) > 0 
         begin
           select @Msg='��������Ʒ��' + @Str + '���������������뵥[' + @NoteSheetID +']��������!';
           goto ErrHandle;
         END;
         END;
         
         select @BreakPoint=223052;
        IF @FreshWMSFlag=1
         insert into WholeSale0
         (SheetID,ShopID,GuestID,RetFlag,Flag,Editor,EditDate,
	      Operator,Checker,CheckDate,ManageDeptID,Note,PlaceID,BadFlag,CRFlag,GoodsCostFlag,RefSheetID)
         select @NewSheetID,ShopID,GuestID,RetFlag,3,Editor,EditDate,
	      Operator,'','',ManageDeptID,Note,@PlaceID,BadFlag,case when DeliverFlag=2 then 2 else 0 end,GoodsCostFlag,@NoteSheetID
	     from WholeSaleNote0 where SheetID=@NoteSheetID
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
         
         select @BreakPoint=223055;
         insert into WholeSaleItem0
         (SerialID,SheetID,GoodsID,PKNum,Qty,Price,PkName,PkSpec,
          PlanQty,Notes,PKPrice,GoodsCostID,WholeQty,GiftQty)
         select SerialID,@NewSheetID,GoodsID,PKNum,Qty,Price,PkName,PkSpec,
          PlanQty,Notes,PKPrice,GoodsCostID,WholeQty,GiftQty
         from #WholeSaleItem;
         select @Err = @@error;
         if @Err != 0 goto ErrHandle;
         if object_id('tempdb..#WholeSaleItem') is not null
         drop table #WholeSaleItem;
         
       --  IF @FreshWMSFlag=1
         INSERT INTO FreshWMS_SheetGoodsCostInfo
         (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2451,@NewSheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RATIONNOTE 
         where SheetID=@SheetID and LotNo<>-1 and Refsheetid=@PreFixString+@NoteSheetID; 
         
         exec @Err=ST_WholeSale @NewSheetID,'WMS';
         if @@error != 0 select @Err=@@error
         if (@Err is null) or (@Err <> 0) begin
	 	    select @Msg='��������˴���!'
		    goto ErrHandle;
         END;     
       
       END;
       CLOSE Cur_RationData4;
       DEALLOCATE Cur_RationData4;
       
       
       select @PreFixString=FixString from Sheet_PreFixString where SheetType=2451;   
       declare Cur_RationData5 cursor local for
          select distinct SubString(a.RefSheetid,2,20),c.ManageDeptID from interfaceWMSDB..FR_RATIONNOTE a,wholesale0 c 
          where a.RefSheetID = @PreFixString+c.SheetID and a.SheetID = @SheetID --and Charindex(',' + Cast(c.ManageDeptID as varchar(50)) + ',', @FreshWMSManage) <>0 
           	
       open Cur_RationData5;
       select @BreakPoint = 223001;
       WHILE (1=1)
       BEGIN
         if @@error != 0 goto ErrHandle;
         fetch NEXT from Cur_RationData5 into @NoteSheetID,@ManageDeptID;
         if @@fetch_status != 0 break;
          select @BreakPoint = 223005;
         execute @Err=TL_GetNewSheetID 2451,@NewSheetID output;
         if @Err <> 0 or @Err is null begin
         	select @Msg='�������ⵥ���Ų���ʧ��!'
                goto ErrHandle;
         end;
                  
         select @BreakPoint = 223010;

       --  select @Logistics=Logistics From wholesalenote where SheetID=@NoteSheetID;
  

	     execute TL_DeptPlace 0,@ManageDeptID, @PlaceID out;
	     if @PlaceID is null select @PlaceID=0;

         select @Count=0;

         select @Count=Count(*) from dbo.WholeSale0 where PayNote=@SheetID and REFSheetID=@NoteSheetID and ManageDeptID=@ManageDeptID;

         if @Count=0
         begin
            select @count=Count(*) from WholeSale where PayNote=@SheetID and REFSheetID=@NoteSheetID and ManageDeptID=@ManageDeptID;
         end;

         --�Ѿ����ɹ����ͳ��ⵥ�ˣ�Ӧ���ǲ����ظ����ɵ����⣬������ϣ�ֱ�ӱ����˳�.......
         if @Count>0 goto ErrHandle;

         insert into dbo.WholeSale0
                 ( SheetID ,ShopID ,GuestID , RetFlag ,Flag ,Editor ,EditDate , Operator , Checker , CheckDate , ManageDeptID ,note ,
                 PlaceID ,BadFlag ,CRFlag , PrintCount ,PayNote,goodscostflag ,RefSheetID ,RefSheetType ,YSFlag)
        SELECT @NewSheetID,shopid, GuestID , RetFlag ,Flag ,Editor ,getdate() , Operator , 'WMS' , getdate() , ManageDeptID ,'�˵�����WMS�Զ�����' ,
                 PlaceID ,BadFlag ,CRFlag , PrintCount ,@SheetID,goodscostflag ,@NoteSheetID,2451 ,YSFlag   
          FROM   WholeSale0 WHERE SheetID=@NoteSheetID  ;
         insert into WholeSaleitem0
         ( SheetID ,serialid ,GoodsID ,PKNum ,Qty ,Price ,PKName , PKSpec ,planQty ,Notes ,GoodsCostID , pkprice ,WholeQty ,GiftQty)
         select @NewSheetID,0,a.GoodsID,c.PKNum,SUM(a.realqty),c.price,c.PKName,c.PKSpec,c.planQty,c.Notes,0,c.pkPrice,c.WholeQty,c.GiftQty
         from interfaceWMSDB..FR_RATIONNOTE a,wholesale0 b,wholesaleitem0 c
         where a.RefSheetID = @PreFixString+b.SheetID and a.SheetID = @SheetID AND a.GoodsID=c.GoodsID and b.SheetID = c.SheetID 
         AND  b.SheetID=@NoteSheetID 
         GROUP BY a.GoodsID,c.PKNum,c.price,c.PKName,c.PKSpec,c.Notes,c.pkPrice,c.WholeQty,c.GiftQty,c.planQty
         select @Err = @@error;    
         if @Err != 0 goto ErrHandle; 
         
         IF object_id('tempdb..#realqty1') IS NOT NULL DROP TABLE #realqty1;  
         select goodsid,sum(RealQty) realqty INTO #realqty1 FROM InterFaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID AND RefSheetid=@PreFixString+@NoteSheetID GROUP by GoodsID;
         UPDATE wholesaleitem0 SET qty=b.RealQty FROM wholesaleitem0 a,#realqty1 b WHERE a.goodsid=b.goodsid AND  sheetid=@NoteSheetID;
 
         INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2451,@NewSheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID and LotNo<>-1 and  RefSheetid=@PreFixString+@NoteSheetID;   
       
         DROP TABLE #realqty1 ; 
        exec @Err=ST_WholeSale @NewSheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='��������˴���!'
		goto ErrHandle;
       END;
           
       END;
       CLOSE Cur_RationData5;
       DEALLOCATE Cur_RationData5;

       select @BreakPoint = 223025;
       insert into WMSRationRelation(RationSheetID,NoteSheetID,GoodsID,Qty)
       SELECT CASE WHEN LEN(@SheetID)>16 THEN  SUBSTRING(@SheetID,2,16) ELSE @sheetid END ,SubString(SheetID,2,32),A.GoodsID,a.RealQty
       from   InterFaceWMSDB.dbo.FR_RATIONNOTE A
       where  A.SheetID = @SheetID;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;
         
  end else IF @SheetType = 2232 begin	--���� InterFaceWMSDB.dbo.FR_RATIONNOTE_Close(���ͣ�ֱͨ����������������(�õ���Q����))

     if @ERPSheetType=2341 --������֪ͨ���ⵥ��
     begin
       select @Count=count(*) from TransferNote0 where sheetid=@ASheetid and Flag=3;
       if @Count=0 begin
          select @Msg='�������֪ͨ���Ҳ���Դ���ݣ�';
          goto ErrHandle;
       END;
       
       update TransferNote0 set Flag=100,checker='WMS',checkdate=getdate() where sheetid=@ASheetID;
       select @Err=@@Error;  if @Err!=0 goto ErrHandle;
             
       Exec @Err=TL_SheetTransfer @ASheetID,1,'TransferNote0','TransferNoteItem0','','TransferNote','TransferNoteItem','';
       if @Err is null or @Err!=0 goto ErrHandle;

     END ELSE IF @ERPSheetType=2342 begin                --��������
       select @Count=Count(*) From Transfer0 where SheetID=@ASheetID;
       if @Count=0 begin
		 select @Msg='�ּ�������ⵥ�Ҳ���Դ���ݣ�';
         goto ErrHandle;
       END;

       --�޸ĵ���ԭ���ĳ������������������Ĭ�ϵ���֪ͨ������WMS��û�з��ض�Ӧ��Ϣ���У�������ɵĿ�治�ԡ�
       Update TransferItem0 Set Outqty=0,Inqty=0      
       where SheetID=@ASheetID;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;

       --���µ������ⵥʵ����
       Update TransferItem0
       Set Outqty=b.RealQty,Inqty=b.RealQty
       From TransferItem0 a,InterFaceWMSDB.dbo.FR_RATIONNOTE b
       where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;
      
       --�Զ���˵������ⵥ
       exec @Err=ST_Transfer @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�ּ�������ⵥ��˴���!'
		goto ErrHandle;
       END;
     END ELSE IF @ERPSheetType=2344 --�������
     begin
       select @Count=Count(*) From Transfer0 where SheetID=@ASheetID;
       if @Count=0 begin
		 select @Msg='�ּ������ⵥ�Ҳ���Դ���ݣ�';
         goto ErrHandle;
       END;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;

       --���µ������ⵥʵ����
       select @GoodsID=null;
       select @GoodsID=a.GoodsID from TransferItem0 a,InterFaceWMSDB.dbo.FR_RATIONNOTE b
       where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID and a.OutQty<>b.RealQty;
       if @GoodsID is not null begin
         select @Msg='��Ʒ'+cast(@GoodsID as varchar(10))+'��ʵ����������WMSʵ������';
         goto ErrHandle;
       END;
       select @Err = @@error;
       if @Err != 0 goto ErrHandle;


       --�Զ���˵������ⵥ
       exec @Err=ST_Transfer @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�ּ������ⵥ��˴���!'
		goto ErrHandle;
       END;
     END ELSE  IF @ERPSheetType=2331     --(���ͳ���)      ����ֻ�����������͵�����ͨ���͵�ֻ������;����
     Begin
       select @Count=Count(*),@BatchFlag=Max(BatchFlag),@ManagedeptID=Max(ManagedeptID) From Ration0 where SheetID=@ASheetID and Flag=3 and RationType='I';
       if @Count=0 begin
		 select @Msg='���ͳ��ⵥ�Ҳ���Դ���ݣ�';
         goto ErrHandle;
       END;

       Update RationItem0 Set OutQty=0 where SheetID=@ASheetID;
       select @Err = @@error;if @Err != 0 goto ErrHandle;       

       if @BatchFlag=1        --�������ͳ��ⵥ
       begin
         --��ͨ�������͵�
         IF Charindex(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) = 0 	
         BEGIN       
           --�����������͵����⣬���ȳ������κ�С��....
           DECLARE Cur_WMSData cursor local for
                select GoodsID,RealQty From InterFaceWMSDB.dbo.FR_Rationnote where SheetID=@SheetID;
           OPEN Cur_WMSData
           WHILE (1=1)
           BEGIN
	       if @@Error != 0 goto ErrHandle;
	       FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
               if @@fetch_status !=0 break;

	       --�������κ�����
	       DECLARE Cur_RationQty cursor local for
		   select notifyQty From RationItem0 where SheetID=@ASheetID and GoodsID=@GoodsID order by GoodsCostID asc;
	       OPEN Cur_RationQty
	       WHILE (1=1)
	       BEGIN
	        if @@Error != 0 goto ErrHandle;
	        FETCH NEXT FROM Cur_RationQty INTO @RealQty;
	        if @@fetch_status !=0 break;

                        --���WMSʵ����ʣ�಻��֪ͨ�������������������
                        if @Qty<@RealQty
                        begin
                          select @RealQty=@Qty;
                        END;

                        select @Qty=@Qty-@RealQty;
                        Update RationItem0
                        Set OutQty=@RealQty
                        where Current of Cur_RationQty;

                        select @Err = @@error;

                        if @Err != 0 goto ErrHandle;

                        if @Qty=0 Break;
                        select @RealQty=0;
	      END;
	      CLOSE Cur_RationQty
	      DEALLOCATE Cur_RationQty
           END;
           CLOSE Cur_WMSData
           DEALLOCATE Cur_WMSData
         END ELSE BEGIN       --�����ֿⲿ���������͵�....  
/*
           --����������У��,��������嵥������û����ȫ�ϴ�,���������.
           select @Count=count(*) from ration0 where notesheetid=@ASheetid;
           if @Count>0
           begin
	 	     select @Msg='ERPδΪ���յ�wms�ϴ��Ľ����嵥,������˵���!';
		     goto ErrHandle;                  
           end;           */

          select @ASheetid=SheetID from Ration0 Where notesheetID=@ASheetID;

           select @Count=count(*) from (select goodsid,sum(outqty) as outqty from rationitem0 where sheetid=@ASheetid group by goodsid) a,
                               (select GoodsID,sum(RealQty) as RealQty From InterFaceWMSDB.dbo.FR_Rationnote where SheetID=@SheetID group by goodsid) b
           where a.goodsid=b.goodsid and a.outqty<>b.realqty;

           --У�鲻����,���ݸ���ʵ������wms���ܵĲ���,�п����ǽ����嵥û�ϴ�,���߿��ڽӿ�����.....
           if @Count>0
           begin
	 	     select @Msg='�������ͳ��ⵥ����У�鲻����,���ݸ���ʵ������wms���ܵĲ���!'
		     goto ErrHandle;                  
           END;
         END;

         Update Ration0
         Set Flag=3
         where SheetID=@ASheetID;

         exec @Err=ST_Ration @ASheetID,'WMS';
         if @@error !=0 select @Err=@@error;
         if (@Err is null) or (@Err <> 0) begin
	 	     select @Msg='���ͳ��ⵥ��˴���!'
		     goto ErrHandle;
         END;
       END;
     END ELSE IF @ERPSheetType=2330 begin
         /*Update RationItem0
         set OutQty=b.Realqty
         From Rationitem0 a,InterFaceWMSDB.dbo.FR_RATIONNOTE_Close b
         where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;
         */
 
         select @InShopID=InShopID From RationNote where SheetID=@ASheetID;
 		 if @InShopID is null
         begin
			select @Msg='���ͳ���֪ͨ�Ҳ���Դ���ݣ�';
	     	goto ErrHandle;
         END;
         
         Update RationNote
         Set Flag=100
         where SheetID=@ASheetID;
         
         select @Count=SUM(RealQty) from InterFaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID;
         if @Count=0 
         begin
           Update RationNote
           Set Flag=99
           where SheetID=@ASheetID;         
         END;

	         --2331ֻ�����������͵�����;���ݣ���ͨ���͵���2330ֱ���������ͳ��ⵥ
  		 --2012-11-8 GZT ����������,�������ͼ����Ͳ����Ҫͬ����;..........
		 select @BreakPoint=900340;
		 insert into SynDemand0(SheetID,SheetType,SheetFlag,GoodsID,ShopID,Qty)
 		 select @ASheetID,2331,0,GoodsID,@inShopID,(RealQty-PlanQty) as Qty
                 From InterFaceWMSDB.dbo.FR_Rationnote_Close
                 where SheetID=@SheetID-- and RealQty<>PlanQty

	 	 --д����
		 select @BreakPoint=900350;
		 execute @i_ReqID = GetNextValue 'TRANS_REQ_REQID'
		 if @i_reqId is null or @i_reqId < 0 begin
	 		select @Msg='ȡͨѶ˳��Ŵ���'
			goto ErrHandle;
	  	END
  		select @BreakPoint=900355;
		select @OASQL='TL_ClearSynDemand '''+@ASheetID+''',2331,'''+@inShopID+'''';			--ת���������
		select @IASQL='TL_SynDemandResult '''+@ASheetID+''''  	select @BreakPoint=900360;		--ת��������

		insert into trans_req(ReqID,ReqType,TargetID,SheetType,LocalType,ExecuteFlag,
			OPSQL,OASQL,IPSQL,IASQL,Description)
	  	values(@i_ReqID,1,@HeadShopID,'shop','shop',0,'',@OASQL,'',@IASQL,'ͬ��������');

		if @@Error <>0 goto ErrHandle;

		select @BreakPoint=900365;
		insert into SynDemand  select *  from SynDemand0 where sheetid=@ASheetID and SheetType=2331 and ShopID=@InshopID
		if @@Error <>0 goto ErrHandle;
		select @BreakPoint=900370;
		delete from SynDemand0 where sheetid=@ASheetID and SheetType=2331 and ShopID=@InshopID
		if @@Error <>0 goto ErrHandle;

		select @BreakPoint=900375;
		insert into trans_reqitems(ReqID,ID,NodeName,OutSQL)
		values(@i_ReqID,1,'SynDemand0',' select *  from SynDemand where sheetid='''+@ASheetID+''' and SheetType=2331 and ShopID='''+@InshopID+'''')
		if @@Error <>0 goto ErrHandle;

     END ELSE IF @ERPSheetType=2450 begin		--����֪ͨ��

       select @Count=Count(*) From WholeSaleNote0 where SheetID=@ASheetID and Flag=3 and RetFlag=0;
       if @Count=0 begin
       select @Msg='�������Ҳ���Դ���ݣ�';
        	goto ErrHandle;
       END;
       
       SELECT @Count=COUNT(*) FROM interfaceWMSDB.dbo.FR_RationNote WHERE RefSheetid=@SheetID;
       IF @Count>0 
         RETURN 0;
       
       update WholeSaleNote0 set Flag=100,Checker='WMS',CheckDate=Getdate() 
       where SheetID=@ASheetID;
       select @Err=@@Error;  
       if @Err!=0 goto ErrHandle;
             
       Exec @Err=TL_SheetTransfer @ASheetID,1,'WholeSaleNote0','WholeSaleNoteItem0','','WholeSaleNote','WholeSaleNoteItem','';
       if @Err is null or @Err!=0 goto ErrHandle;
 /*      
       Update WholeSaleItemNote0
       Set Qty=0
       where SheetID=@ASheetID and PlanQty<>0;

       --û�ش�����Ϊ0.
       UPDATE WholeSaleItem0 SET qty=0 FROM wholesaleitem0 a 
       WHERE sheetid=@ASheetID and NOT EXISTS
       (SELECT 1 FROM InterFaceWMSDB.dbo.FR_RATIONNOTE_Close where SheetID=@SheetID AND goodsid=a.GoodsID);

       --�����������������⣬���ȳ������κ�С��....
       DECLARE Cur_WMSData cursor local for
            select GoodsID,sum(RealQty) From InterFaceWMSDB.dbo.FR_RATIONNOTE_Close 
            where SheetID=@SheetID group by GoodsID;
       OPEN Cur_WMSData
       WHILE (1=1)
       BEGIN
	       if @@Error != 0 goto ErrHandle;
	       FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
               if @@fetch_status !=0 break;

	       --�������κ�����
	       DECLARE Cur_WholeQty cursor local for
		   select Case when PlanQty=0 then Qty else PlanQty End as Qty From WholeSaleItem0 
		   where SheetID=@ASheetID and GoodsID=@GoodsID --��ʱע�� by qirun 2012.10.09
	       OPEN Cur_WholeQty
	       WHILE (1=1)
	       BEGIN
			if @@Error != 0 goto ErrHandle;
			FETCH NEXT FROM Cur_WholeQty INTO @RealQty;
			if @@fetch_status !=0 break;

                        Update WholeSaleItem0
                        set Qty=0
                        where Current of Cur_WholeQty;

         		select @Err = @@error;
         		if @Err != 0 goto ErrHandle;

                        --���WMSʵ����ʣ�಻��֪ͨ�������������������
                        if @Qty<@RealQty
                        begin
                          select @RealQty=@Qty;
                        end;

                   
                        select @Qty=@Qty-@RealQty;
                        Update WholeSaleItem0
                        Set Qty=@RealQty
                        where Current of Cur_WholeQty;

        		select @Err = @@error;
       			if @Err != 0 goto ErrHandle;

                        if @Qty=0 Break;
                        select @RealQty=0;
	      END;
   	      CLOSE Cur_WholeQty
	      DEALLOCATE Cur_WholeQty
       END;
       CLOSE Cur_WMSData
       DEALLOCATE Cur_WMSData
*/
   
     END ELSE IF @ERPSheetType=2451 BEGIN		--�������п��ܻ������ε�....��

       select @Count=Count(*) From WholeSale0 where SheetID=@ASheetID and Flag=3 and RetFlag=0;
       if @Count=0 begin
       
       RETURN 0;
       END;
       
       Update WholeSaleItem0
       Set Qty=0
       where SHeetID=@ASheetID and planqty<>0;
       --û�ش�����Ϊ0.
       UPDATE WholeSaleItem0 SET qty=0 FROM wholesaleitem0 a WHERE sheetid=@ASheetID and NOT EXISTS
       (SELECT 1 FROM InterFaceWMSDB.dbo.FR_Rationnote_Close where SheetID=@SheetID AND goodsid=a.GoodsID);

       --�����������������⣬���ȳ������κ�С��....
       DECLARE Cur_WMSData cursor local for
            select GoodsID,sum(RealQty) From InterFaceWMSDB.dbo.FR_Rationnote_Close where SheetID=@SheetID group by GoodsID;
       OPEN Cur_WMSData
       WHILE (1=1)
       BEGIN
	       if @@Error != 0 goto ErrHandle;
	       FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
               if @@fetch_status !=0 break;

	       --�������κ�����
	       DECLARE Cur_WholeQty cursor local for
		   select Case when PlanQty=0 then Qty else PlanQty End as Qty From WholeSaleItem0 where SheetID=@ASheetID and GoodsID=@GoodsID ORDER BY Qty DESC;/*order by GoodsCostID asc;*/ --��ʱע�� by qirun 2012.10.09
	       OPEN Cur_WholeQty
	       WHILE (1=1)
	       BEGIN
			if @@Error != 0 goto ErrHandle;
			FETCH NEXT FROM Cur_WholeQty INTO @RealQty;
			if @@fetch_status !=0 break;

             IF @RealQty=0 SELECT @RealQty=@Qty;

                        --���WMSʵ����ʣ�಻��֪ͨ�������������������
                        if @Qty<@RealQty
                        begin
                          select @RealQty=@Qty;
                        END;
 
                   
                        select @Qty=@Qty-@RealQty;
                        Update WholeSaleItem0
                        Set Qty=@RealQty
                        where Current of Cur_WholeQty;

        		select @Err = @@error;
       			if @Err != 0 goto ErrHandle;

                        if @Qty=0 Break;
                        select @RealQty=0;
	      END;
   	      CLOSE Cur_WholeQty
	      DEALLOCATE Cur_WholeQty
       END;
       CLOSE Cur_WMSData
       DEALLOCATE Cur_WMSData
/*
       exec @Err=ST_WholeSale @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='��������˴���!'
		goto ErrHandle;
       END;*//*
       ----������
        select @Count=Count(*) From WholeSale0 where SheetID=@ASheetID and Flag=3 and RetFlag=0;
       if @Count=0 begin
       select @Msg='�������Ҳ���Դ���ݣ�';
        	goto ErrHandle;
       end;
       
       Update WholeSaleItem0
       Set Qty=0
       where SHeetID=@ASheetID and planqty<>0;
       --û�ش�����Ϊ0.
       UPDATE WholeSaleItem0 SET qty=0 FROM wholesaleitem0 a WHERE sheetid=@ASheetID and NOT EXISTS
       (SELECT 1 FROM InterFaceWMSDB.dbo.FR_RATIONNOTE where SheetID=@SheetID AND goodsid=a.GoodsID);

       --�����������������⣬���ȳ������κ�С��....
       DECLARE Cur_WMSData cursor local for
            select GoodsID,sum(RealQty) From InterFaceWMSDB.dbo.FR_RATIONNOTE
             where SheetID=@SheetID group by GoodsID;
       OPEN Cur_WMSData
       WHILE (1=1)
       BEGIN
	       if @@Error != 0 goto ErrHandle;
	       FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
               if @@fetch_status !=0 break;

	       --�������κ�����
	       DECLARE Cur_WholeQty cursor local for
		   select Case when PlanQty=0 then Qty else PlanQty End as Qty From WholeSaleItem0 where SheetID=@ASheetID and GoodsID=@GoodsID ORDER BY Qty DESC;/*order by GoodsCostID asc;*/ --��ʱע�� by qirun 2012.10.09
	       OPEN Cur_WholeQty
	       WHILE (1=1)
	       BEGIN
			if @@Error != 0 goto ErrHandle;
			FETCH NEXT FROM Cur_WholeQty INTO @RealQty;
			if @@fetch_status !=0 break;

             IF @RealQty=0 SELECT @RealQty=@Qty;

                        --���WMSʵ����ʣ�಻��֪ͨ�������������������
                        if @Qty<@RealQty
                        begin
                          select @RealQty=@Qty;
                        end;
 
                   
                        select @Qty=@Qty-@RealQty;
                        Update WholeSaleItem0
                        Set Qty=@RealQty
                        where Current of Cur_WholeQty;

        		select @Err = @@error;
       			if @Err != 0 goto ErrHandle;

                        if @Qty=0 Break;
                        select @RealQty=0;
	      END;
   	      CLOSE Cur_WholeQty
	      DEALLOCATE Cur_WholeQty
       END;
       CLOSE Cur_WMSData
       DEALLOCATE Cur_WMSData

       exec @Err=ST_WholeSale @ASheetID,'WMS';
       if @@error !=0 select @Err=@@error
       if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='��������˴���!'
		goto ErrHandle;
       end;*/
       
     END if @ERPSheetType=2423 begin --��������
        select @PreFixString=FixString from Sheet_PreFixString where SheetType=2423;            

        select @Count=Count(*) From XTran0 where SheetID=@ASheetID and Flag=3;
        if @Count=0 begin
  
         RETURN 0;
        END;

        Update XTranItem0
        set Qty=0
        where SheetID=@ASheetID;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        Update XTranItem0
        set Qty=b.Realqty
        From XTranItem0 a,(select sheetid,goodsid,sum(realqty) as realqty from InterFaceWMSDB.dbo.FR_Rationnote_Close where sheetid=@SheetID group by sheetid,goodsid) b
        where @PreFixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;

        select @Count=count(*) from (select goodsid,sum(Qty) as outqty from XTranItem0 where @PreFixString+sheetid=@Sheetid group by goodsid) a,
                               (select GoodsID,sum(RealQty) as RealQty From InterFaceWMSDB.dbo.FR_Rationnote_Close where SheetID=@SheetID group by goodsid) b
        where a.goodsid=b.goodsid and a.outqty<>b.realqty;

        --У�鲻����,���ݸ���ʵ������wms���ܵĲ���,�п����ǽ����嵥û�ϴ�,���߿��ڽӿ�����.....
        if @Count>0
        begin
	 	     select @Msg='�����������õ�����У�鲻����,���ݸ���ʵ������wms���ܵĲ���!'
		     goto ErrHandle;                  
        END;
		/*
        Update XTran0
        set Flag=0
        where SheetID=@ASheetID;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        exec @Err=ST_XTran @ASheetID,'WMS';
        if @@error !=0 select @Err=@@error
        if (@Err is null) or (@Err <> 0) begin
		select @Msg='�������õ���˴���!'
		goto ErrHandle;
        END; */
      END;
  END ELSE IF @SheetType = 2253 BEGIN   --����InterFaceWMSDB.dbo.FR_RetRATION:�ŵ귴���ˣ������˻�
     IF @ERPSheetType=2423 --���������˻�,2015.09.07
     BEGIN
         select @Count=Count(*) From XTran0 where SheetID=@ASheetID and Flag=3;
        if @Count=0 begin
		select @Msg='���յ��������õ��Ҳ���Դ���ݣ�';
        	goto ErrHandle;
        END;

        update xtran0 set flag=0 where sheetid=@ASheetID;

        Update XTranItem0
        set Qty=0
        where SheetID=@ASheetID;
        select @Err = @@error;
        if @Err != 0 goto ErrHandle;


        Update XTranItem0
        set Qty=b.Realqty
        From XTranItem0 a,(select sheetid,goodsid,sum(realqty) as realqty from InterFaceWMSDB.dbo.FR_RetRATION where sheetid=@SheetID group by sheetid,goodsid) b
        where a.SheetID=@ASheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;
        select @Err = @@error;
        if @Err != 0 goto ErrHandle;
                
          INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
         select distinct 2423,SubString(SheetID,2,20),LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
         from interfaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID and LotNo<>-1 --and sheetid=@NoteSheetID;               
       
        exec @Err=ST_XTran @ASheetID,'WMS';
        if @@error !=0 select @Err=@@error
        if (@Err is null) or (@Err <> 0) begin
		select @Msg='�������õ��˻���˴���!'
		goto ErrHandle;
        END;     
  
     END ELSE IF @ERPSheetType=2332 --�������
     begin
             select @Count=Count(*),@BatchFlag=Max(BatchFlag) From Ration0 where SheetID=@ASheetID and Flag=3 and RationType='O';
             if @Count=0 begin
				select @Msg='������ⵥ�Ҳ���Դ���ݣ�';
        		goto ErrHandle;
             END;

             Update RationItem0
             set InQty=0
             where SheetID=@ASheetID;

             --�����������.....
             if @BatchFlag=1        --����������ⵥ
             Begin
                 --�����������͵����⣬���ȳ������κ�С��....
                 DECLARE Cur_WMSData cursor local for
                    select GoodsID,sum(RealQty) From InterFaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID group by goodsid;
                 OPEN Cur_WMSData
                 WHILE (1=1)
                 BEGIN
		       if @@Error != 0 goto ErrHandle;
	  	       FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
         	       if @@fetch_status !=0 break;

			--�������κ�����
			DECLARE Cur_RationQty cursor local for
			   select OutQty From RationItem0 where SheetID=@ASheetID and GoodsID=@GoodsID order by GoodsCostID asc;
			OPEN Cur_RationQty
			WHILE (1=1)
			BEGIN
				if @@Error != 0 goto ErrHandle;
				FETCH NEXT FROM Cur_RationQty INTO @RealQty;
				if @@fetch_status !=0 break;

                                --���WMSʵ����ʣ�಻��֪ͨ�������������������
                     
			        if @Qty<@RealQty
                                begin
                                  select @RealQty=@Qty;
                                END;

                               --select @Qty=@Qty-@RealQty;

                                Update RationItem0
                                Set inQty=@Qty
                                where Current of Cur_RationQty;

         			select @Err = @@error;
        			if @Err != 0 goto ErrHandle;

                                if @Qty=0 Break;
                                select @RealQty=0;
			END;
			CLOSE Cur_RationQty
			DEALLOCATE Cur_RationQty
                 END;
                 CLOSE Cur_WMSData
                 DEALLOCATE Cur_WMSData
             END ELSE BEGIN
                 Update RationItem0
                 set InQty=b.Realqty,ProductDate=B.ProductDate
                 From RationItem0 a,(select sheetid,goodsid,sum(realqty) as realqty ,ProductDate FROM InterFaceWMSDB.dbo.FR_RetRATION group by sheetid,goodsid,ProductDate) b
                 where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;

                 select @Err = @@error;
                 if @Err != 0 goto ErrHandle;

                 --���������ͲŸ���Flagֵ�������˻����Զ���ST_Ration������µ���.....
                 Update Ration0
                 Set Flag=0
                 where SheetID=@ASheetID;
             END;

             select @Managedeptid=Managedeptid,@inshopid=inshopid from ration0 where sheetid=@ASheetID;
           -- if Charindex(',' + Cast(@ManageDeptID as varchar(50)) + ',', @FreshWMSManage) > 0 	--�����ֿⲿ�൥��  AND 
             IF EXISTS(select 1 from interfaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID and LotNo<>-1)  
             begin
               select @Count=count(*) from RationCostItem where sheetid=@ASheetid;
               if @Count=0
               begin
	 			select @Msg='���ͼ��˵���δ�ʹ������ʱ�������....'
				goto ErrHandle;              
               END;

	       --���֮ǰ�����ͼ�������...
               Delete from RationCostitem where sheetid=@ASheetid;

               select @Err = @@error;
               if @Err != 0 goto ErrHandle;

	       --����д���������,�����ǰ�������ʵ������������˵ģ��п�����ɳ���ⲻƥ��....
               insert into RationCostitem
                 (sheetid,goodscostid,goodsid,fromshopid,venderid,paytypeid,qty,cost,taxrate,promflag,logistics,ProductDate)
               select @ASheetID,LotNo,goodsid,@inshopid,Venderid,paytypeid,RealQty,cost,taxrate,promflag,3,ProductDate
                from interfaceWMSDB.dbo.FR_RetRATION where sheetid=@Sheetid;              
             END;
			
       	    exec @Err=ST_Ration @ASheetID,'WMS';
	     if @@error !=0 select @Err=@@error
	     if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='������ⵥ��˴���!'
		goto ErrHandle;
    	     END;
     END ELSE IF @ERPSheetType=2450 --�������
     begin
        select @Count=Count(*) From WholeSaleNote0 where SheetID=@ASheetID and Flag=3 and RetFlag=1;
        if @Count=0 begin
        select @Msg='�����˻����Ҳ���Դ���ݣ�';
           goto ErrHandle;
        END;
        
        update WholeSaleNote0 set Flag=100,Checker='WMS',CheckDate=Getdate() 
        where SheetID=@ASheetID;
        select @Err=@@Error;  
        if @Err!=0 goto ErrHandle;
             
        Exec @Err=TL_SheetTransfer @ASheetID,1,'WholeSaleNote0','WholeSaleNoteItem0','','WholeSaleNote','WholeSaleNoteItem','';
        if @Err is null or @Err!=0 goto ErrHandle;
     END ELSE IF @ERPSheetType=2451 --�������			--�����˻����
     BEGIN
             select @Count=Count(*) From WholeSale0 where SheetID=@ASheetID and Flag=3 and RetFlag=1;
             if @Count=0 begin
		select @Msg='�����˻����Ҳ���Դ���ݣ�';
        	goto ErrHandle;
             END;
             
             UPDATE wholesaleitem0 SET Qty=0 WHERE SheetID=@ASheetID and NOT EXISTS(SELECT 1 FROM InterFaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID
             AND goodsid=wholesaleitem0.GoodsID);

             --�����������������⣬���ȳ������κ�С��....
             DECLARE Cur_WMSData cursor local for
                    select GoodsID,SUM(RealQty) From InterFaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID GROUP BY goodsid;
             OPEN Cur_WMSData
             WHILE (1=1)
             BEGIN
	       		if @@Error != 0 goto ErrHandle;
	       		FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
               		if @@fetch_status !=0 break;

	       		--�������κ�����
	       		DECLARE Cur_WholeQty cursor local for
		   		select Case when Qty!=0 then Qty WHEN WholeQty!=0 THEN WholeQty ELSE PlanQty End as Qty From WholeSaleItem0 where SheetID=@ASheetID and GoodsID=@GoodsID /*order by GoodsCostID asc;*/--��ʱע�� by qirun 2012.10.09
	       		OPEN Cur_WholeQty
	       		WHILE (1=1)
	       		BEGIN
				if @@Error != 0 goto ErrHandle;
				FETCH NEXT FROM Cur_WholeQty INTO @RealQty;
				if @@fetch_status !=0 break;

                IF @RealQty=0 SELECT @RealQty=@Qty;
                                Update WholeSaleItem0
                                Set Qty=0
                        	where Current of Cur_WholeQty;

         			select @Err = @@error;
         			if @Err != 0 goto ErrHandle;


                        	--���WMSʵ����ʣ�಻��֪ͨ�������������������
                        	if @Qty<@RealQty
                        	begin
                          	  select @RealQty=@Qty;
                        	END;

                        	--select @Qty=@Qty-@RealQty;

                        	Update WholeSaleItem0
                        	Set Qty=@Qty
                        	where Current of Cur_WholeQty;

				select @Err = @@error;
         			if @Err != 0 goto ErrHandle;

                        	if @Qty=0 Break;
                        	select @RealQty=0;
	      		END;
   	      		CLOSE Cur_WholeQty
	      		DEALLOCATE Cur_WholeQty
       	     END;
       	     CLOSE Cur_WMSData
       	     DEALLOCATE Cur_WMSData
             --�޸ģ�gyf    2015.03.30  �����˻���¼���ӵ�FreshWMS_SheetGoodsCostInfo����  
             INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
               select distinct 2451,@ASheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,Cost,RealQty
               from InterFaceWMSDB.dbo.FR_RetRATION where SheetID=@SheetID and LotNo<>-1;   

             IF @ASheetID<>'A00L201807070113'
       	     exec @Err=ST_WholeSale @ASheetID,'WMS';
	     if @@error !=0 select @Err=@@error
	     if (@Err is null) or (@Err <> 0) begin
	 	select @Msg='�����˻�����˴���!'
		goto ErrHandle;
    	     END;

     END;
  end else IF @SheetType = 2252 
  BEGIN	--�˹�Ӧ�̻� InterFaceWMSDB.dbo.FR_RET
    select @Count=Count(*) From InterFaceWMSDB.dbo.FR_RET where SheetID=@SheetID and VenderID=888888
    IF @Count>0
    BEGIN
      IF @ERPSheetType=2413        --����
      BEGIN

        select @Count=Count(*) From Lost0 where SheetID=@ASheetID and Flag=3;
        if @Count=0 begin
		select @Msg='���յı����Ҳ���Դ���ݣ�';
         	goto ErrHandle;
        END;
        SELECT @goodscostid=NULL,@GoodsID=null;
        SELECT TOP 1 @GoodsID=a.Goodsid,@goodscostid=a.LotNO  from interfaceWMSDB.dbo.FR_RET a JOIN goods b ON a.goodsid=b.goodsid where SheetID=@SheetID and LotNo<>-1 AND NOT EXISTS(SELECT 1 FROM
        goodscost WHERE goodsid=a.Goodsid AND GoodsCostID=a.LotNO) AND Ceiling(b.DeptID/@LevelValue) NOT IN (351,352);
        IF @goodscostid IS NOT null BEGIN
          SELECT @msg='��Ʒ��'+CAST(@GoodsID AS VARCHAR(10))+'����Ӧ���Ρ�'+CAST(@Goodscostid AS VARCHAR(20))+'����ERP�����ڣ�';
          GOTO ErrHandle;
        END;  

          Update LostItem0
          set Qty=0
          where SheetID=@ASheetID;

          Update Lost0
          set Flag=0
          where SheetID=@ASheetID;

          Update LostItem0
          set Qty=b.Realqty
          From LostItem0 a,(select sheetid,goodsid,sum(realqty) as realqty from InterFaceWMSDB.dbo.FR_RET where sheetid=@sheetid group by sheetid,goodsid) b
          where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;

          INSERT INTO FreshWMS_SheetGoodsCostInfo
               (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
          select distinct 2413,@ASheetID,LotNo,GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,0,RealQty
          from interfaceWMSDB.dbo.FR_RET where SheetID=@SheetID and LotNo<>-1;   

          select @Err = @@error;
          if @Err != 0 goto ErrHandle;

          exec @Err=ST_Lost @ASheetID,'WMS';
          if @@error !=0 select @Err=@@error
          if (@Err is null) or (@Err <> 0) begin
		select @Msg='������˴���!'
		goto ErrHandle;
          END;
      END 
	  else if @ERPSheetType=2323 
	  begin	--�˻����������˻���һ�ŵ���ͬ������Ʒ��ͬ����ʱ�����ȷ�̯�����κ�С�ļ�¼��
        select @Count=Count(*),@CostFlag=Max(CostFlag),@ManageDeptID=max(ManageDeptID) From Ret0 where SheetID=@ASheetID and Flag=3;
        if @Count=0 begin
		  select @Msg='���յ��˻����Ҳ���Դ���ݣ�';
          goto ErrHandle;
        END;
      
  
        if @CostFlag=1        --�����˻���
        Begin
          Update RetItem0
          set RealQty=0
          where SheetID=@ASheetID;

          select @Err = @@error;
          if @Err != 0 goto ErrHandle;

          --�����������͵����⣬���ȳ������κ�С��....
          DECLARE Cur_WMSData cursor local for
             select GoodsID,RealQty From InterFaceWMSDB.dbo.FR_RET where SheetID=@SheetID;
          OPEN Cur_WMSData
          WHILE (1=1)
          BEGIN
   		    if @@Error != 0 goto ErrHandle;
	     	FETCH NEXT FROM Cur_WMSData INTO @GoodsID,@Qty;
         	if @@fetch_status !=0 break;

		    --�������κ�����
		    DECLARE Cur_RetQty cursor local for
		    select planqty From RetItem0 where SheetID=@ASheetID and GoodsID=@GoodsID order by GoodsCostID asc;
		    OPEN Cur_RetQty
		    WHILE (1=1)
		    BEGIN
		  	  if @@Error != 0 goto ErrHandle;
			  FETCH NEXT FROM Cur_RetQty INTO @RealQty;
			  if @@fetch_status !=0 break;

                        --���WMSʵ����ʣ�಻��֪ͨ�������������������
                        if @Qty<@RealQty
                        begin
                          select @RealQty=@Qty;
                        END;

                        select @Qty=@Qty-@RealQty;
                        Update RetItem0
                        Set Realqty=@RealQty
                        where Current of Cur_RetQty;

        		select @Err = @@error;
        		if @Err != 0 goto ErrHandle;
               
         		if @Qty=0 Break;
                        select @RealQty=0;
		    END;
		    CLOSE Cur_RetQty
		    DEALLOCATE Cur_RetQty
          END;
          CLOSE Cur_WMSData
          DEALLOCATE Cur_WMSData
        END 
		ELSE 
		BEGIN
          
          Update RetItem0
          set RealQty=0
          where SheetID=@ASheetID;

          select @Err = @@error;
          if @Err != 0 goto ErrHandle;
     
	     Update RetItem0
	     set Realqty=b.Realqty
	     From RetItem0 a,InterFaceWMSDB.dbo.FR_RET b
	     where @FixString+a.SheetID=b.SheetID and b.SheetID=@SheetID and a.GoodsID=b.GoodsID;

          select @Err = @@error;
          if @Err != 0 goto ErrHandle;
        END
	
     

        Update Ret0
        set Flag=3
        where SheetID=@ASheetID;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;


        exec @Err=ST_Ret @ASheetID,'WMS';
        if @@error !=0 select @Err=@@error
        if (@Err is null) or (@Err <> 0) begin
		  select @Msg='�˻�����˴���!'
		  goto ErrHandle;
        END;
      END;
	end;
  end else IF @SheetType=2315 begin     --�������ӿڴ���

    --ɾ�����������ļ�¼.....
    Delete PurchaseOverItem From PurchaseOverItem a,InterFaceWMSDB.dbo.FR_PurOver b where a.PurSheetID=b.PurSheetID and b.SheetID=@SheetID and CheckFlag=1

    --���û��¼�˾�ɾ�����ݣ��м�¼����ˣ��ø�������ᣬ�����ڵ����ڡ�
    select @Count=Count(*) From PurchaseOverItem where SheetID=@ASheetID;
    if @Count=0
    begin
      --ȡ�����ŵ���......
      update PurchaseOver
      Set Flag=99
      where SheetID=@ASheetID;
    END ELSE BEGIN
      Update PurchaseOver
      set Flag=100
      where SheetID=@ASheetID;

      select @Err = @@error;
      if @Err != 0 goto ErrHandle;

      execute @Err=ST_PurchaseOverRun @ASheetID
      IF @Err <> 0 OR @Err IS NULL BEGIN
		select @Msg='������ᴦ��ʧ��!';
		goto ErrHandle;
      END
    END;
  END ELSE IF @SheetType=2317 begin --������������ϴ�
    select @Count=Count(*) From InterFaceWMSDB.dbo.FR_DPDY where SheetID=@SheetID
    if @Count>0
      begin
        select @BreakPoint = 2317001;
        execute @Err=TL_GetNewSheetID 5202,@NewSheetID output;
        if @Err <> 0 or @Err is null begin
        select @Msg='��ʱ����Ų���ʧ��!'
            goto ErrHandle;
        END;


        select @BreakPoint = 2317003;
        insert into VenderKXTemp0(sheetid,shopid,flag,Editor,EditDate,note)
        Values(@NewSheetID,@MyShopID,0,'ϵͳ����',Getdate(),'������˵�'+@SheetID)
        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        select @BreakPoint = 2317006;
        select @Value = value from Config with (NOLOCK) where name='������˹�Ӧ����ʱ�������';
        if isnull(LTrim(RTrim(@Value)),'') = '' goto ErrHandle;

        --SheetID,ManageDeptID,VenderID,Kno,KMoney,KKflag,ReceivableDate,Note
        select @BreakPoint = 2317009;
        if object_id('tempdb..#tempVenderKX') > 0 drop table #tempVenderKX;
        select @Err = @@error;
        if @Err != 0 
        begin
          select @Msg = 'δ���ô�����˹�Ӧ����ʱ������롣';
          goto ErrHandle;
        END;
        
	--0=���� 1=�ֽ�
        select @MoneyFlag=MoneyFlag from InterFaceWMSDB.dbo.FR_DPDY where SheetID=@SheetID;
 
        if @MoneyFlag=0
        begin
          select @BreakPoint = 2317012;

	  --kkflag���ʽΪ�ۻ��
          select @NewSheetID sheetid,isnull(b.sgroupid,0) ManageDeptID, a.VenderID, convert(int,@Value) Kno, Cost KMoney,1 as KKflag,
          Sdate as ReceivableDate, convert(varchar(64),'') Note, identity(int,1,1) SerialID into #tempVenderKX
          from InterFaceWMSDB.dbo.FR_DPDY a join Vender b on a.Venderid = b.Venderid where a.SheetID = @SheetID;
          select @Err = @@error;
          if @Err != 0 goto ErrHandle;

          select @BreakPoint = 2317015;        
          insert into VenderKXTempItem0(SheetID,ManageDeptID,VenderID,Kno,KMoney,KKflag,ReceivableDate,Note,shopid)
          select SheetID,ManageDeptID,VenderID,Kno,KMoney,KKflag,ReceivableDate,Note,@MyShopID from #tempVenderKX
          select @Err = @@error;
          if @Err != 0 goto ErrHandle;


          select @BreakPoint = 2317018;
          exec @Err=ST_VenderkxTemp @NewSheetID,'WMS';
          select @Err = @@error;
          if @Err != 0 goto ErrHandle;         
        END;

	--������˱�������...
        insert into DPDYList
            (SheetID,ShopID,VenderID,Cost,SDate,MoneyFlag)
        select SheetID,ShopID,VenderID,Cost,SDate,MoneyFlag From InterFaceWMSDB.dbo.FR_DPDY where SheetID=@SheetID;

        --�ϴ�ҵ������
	execute @Err=SendToShop @HeadShopID,@SheetID,1,'shop','shop','','','','','DPDYList','DPDYList','�ϴ���������嵥';   
	if @Err!=0 or @Err is null
	begin 
	    select @Msg='дͨѶ��¼ʧ�ܣ�';
	    goto ErrHandle;
	END;            
     END;
  END ELSE IF @SheetType = 2274 begin	--�̵�ӯ�� InterFaceWMSDB.dbo.FR_PDYK
    select @BreakPoint=1
  end ELSE IF @SheetType = 2275 begin	--�̵�¼�� InterFaceWMSDB.dbo.FR_PDInPut
        --WMS�̵�����ݣ�ͳһ����һ���̵�¼�뵥.................
        --���ɱ�ͷ
        select @BreakPoint=230930;
        execute @Err=TL_GetNewSheetID 2443,@NewSheetID output;
        if @Err <> 0 or @Err is null or @NewSheetID is null or @NewSheetID='' begin
	  select @Msg='�����̵�¼�뵥�ݺ������'
	  goto ErrHandle;
        END;

        select @PlaceID=Max(ID) from Place with (NOLOCK) where type=2 and clearflag=0;
        if @PlaceID is null select @PlaceID=0;

        Insert into PDInput0
          (SheetID,RefSheetID,Flag,PlaceID,Editor,EditDate,Operator,Note)
        values(@NewSheetID,@ASheetID,0,@PlaceID,'WMS',GetDate(),'WMS','�˵�����WMS�ϴ���������');

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        IF object_id('tempdb..#PDInputitem0') IS NOT NULL DROP TABLE #PDInputitem0
        select @NewSheetID as SheetID,identity(int,1,1) as OrderNO,a.GoodsID,0 as PreQty,SUM(a.Qty) as Qty,b.Price
        Into #PDInputitem0
        From InterFaceWMSDB.dbo.FR_PDInPut a,Goodsshop b where a.goodsid=b.goodsid and b.shopid=@MyshopID and a.SheetID=@SheetID
        Group by a.GoodsID,b.Price

        --д��Ԥ�̱���¼������
        Update #pdinputitem0
        Set PreQty=isnull(b.Qty,0)
        From #pdinputitem0 a,PDGoodsItem0 b
        where b.sheetid=@NewSheetID and a.goodsID=b.GoodsID

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        Insert into PDInputitem0 (SheetID,OrderNO,GoodsID,PreQty,Qty)
        select SheetID,OrderNO,GoodsID,PreQty,Qty From #pdinputitem0;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

        Drop table #pdinputitem0;

  END ELSE IF @SheetType = 9400 begin	--���Ա� InterFaceWMSDB.dbo.FR_Stock        

        select @Count=Count(*) From interFaceWMSDB.dbo.FR_StockUp where WMSID=@SheetID;

        --֮ǰ�Ѿ������ˣ���ô��ֱ���˳���
        if @Count=0 Return 0;
        
        Delete From interFaceWMSDB.dbo.FR_upNoteBak where SheetType=9400;
        
        DECLARE Cur_UpdWMSStock cursor local for
	   select GoodsID,Max(SDate) as SDate From interFaceWMSDB.dbo.FR_StockUp where WMSID=@SheetID Group by GoodsID
	OPEN Cur_UpdWMSStock
	WHILE (1=1)
	BEGIN
		if @@Error != 0 goto ErrHandle;
		FETCH NEXT FROM Cur_UpdWMSStock INTO @GoodsID,@SDate;
		if @@fetch_status !=0 break;

		--��ȡ��Ʒ���ĸ���ʱ��
                select @LastUpdateTime=null;
                select @LastUpdateTime=LastUpdateTime from FR_WMSStock where GoodsID=@GoodsID and WMSID=@SheetID;
		if (@LastUpdateTime is null) or (@LastUpdateTime<@SDate)
                begin
                   Delete From FR_WMSStock where GoodsID=@GoodsID and WMSID=@SheetID;

        	   select @Err = @@error;
  		   if @Err != 0 goto ErrHandle;

                   Insert into FR_WMSStock(ShopID,WMSID,GoodsID,Qty,BadQty,LastUpdateTime)
                   select @MyshopID,@SheetID,@GoodsID,Qty,BadQty,@SDate From interFaceWMSDB.dbo.FR_StockUp
                   where WMSID=@SheetID and GoodsID=@GoodsID and SDate=@SDate;

	           select @Err = @@error;
	           if @Err != 0 goto ErrHandle;

                   Insert into FR_WMSStock9(ShopID,WMSID,GoodsID,Qty,BadQty,LastUpdateTime)
                   select @MyshopID,@SheetID,@GoodsID,Qty,BadQty,@SDate From interFaceWMSDB.dbo.FR_StockUp
                   where WMSID=@SheetID and GoodsID=@GoodsID and SDate=@SDate;

	           select @Err = @@error;
		   if @Err != 0 goto ErrHandle;
                END;
	END;
	CLOSE Cur_UpdWMSStock
        DEALLOCATE Cur_UpdWMSStock

        select @Count=Count(*) From FR_WMSStock9 where SheetID is null

        --�ϴ�FR_WMSStock9��ҵ�����ĸ���ҵ����������....
        if @Count>0
        begin
	 
 	--����ͨѶ����
	  	select @BreakPoint=399150
  		execute @Err=TL_GetNewSheetID 1102,@TranSheetID output;
		if @Err <> 0 or @Err is null or @SheetID is null or @SheetID='' begin
			select @Msg='ȡ���ݺ������!��������('+'1102'+')';
			goto ErrHandle;
		END;

		Update FR_WMSStock9
		Set SheetID=@TranSheetID
                where SheetID is null;

        	select @Err = @@error;
        	if @Err != 0 goto ErrHandle;		

		execute @Err=SendToShop @HeadShopID,@TranSheetID,1,'shop','shop','','TL_ClearFR_WMSStock9','','IF_WMSStock9',
                						'FR_WMSStock9','FR_WMSStock9','�ϴ�WMS�������';   
		if @Err!=0 or @Err is null
		begin 
		    select @Msg='дͨѶ��¼ʧ�ܣ�';
		    goto ErrHandle;
		 END;             
        END;

	--ֱ��ɾ���������ڸ�WMS�����ݾͿ�����,��Ϊһͬ����ġ�
        Delete From interFaceWMSDB.dbo.FR_StockUp where WMSID=@SheetID;

        select @Err = @@error;
        if @Err != 0 goto ErrHandle;

  END ELSE IF @SheetType=5566 begin		--WMS��������֪ͨ��
	execute @Err=WMS_ClearRationSheet @ASheetID

 	if @Err <> 0 or @Err is null begin
		select @Msg='WMS�������ͳ��ⵥ����!';
		goto ErrHandle;
    	END;
  END ELSE IF @SheetType=8001	--�����̵�ӯ����
  BEGIN

	DECLARE Cur_PDYK cursor local for
		select Distinct Ceiling(b.DeptID/@LevelValue) as ManageDeptID from interfaceWMSDB.dbo.FR_PDYK a,goods b where SheetID=@SheetID and a.GoodsID=b.GoodsID
                and a.WasteType=0
	OPEN Cur_PDYK;
	select @Err = @@error;
	if @Err != 0 goto ErrHandle;
	WHILE (1=1)
	BEGIN
		if @@Error != 0 goto ErrHandle;
		FETCH Cur_PDYK into @ManageDeptID
		if @@fetch_status !=0 break;

		select @BreakPoint=352135;
		select @NewSheetID=null
		execute @Err=TL_GetNewSheetID 2444,@NewSheetID output;
		if @Err<>0 or @NewSheetID is null or @NewSheetID='' begin
			select @Err=0
			select @Msg='ȡ���ݺ������!';
			goto ErrHandle;
		END;

         	--����Ĭ�ϴ����
         	if @StockPlaceMode = 0
         	begin --��������
           		execute TL_Deptplace 0,@ManageDeptID,@PlaceID out;
           		IF @PlaceID IS NULL
             		SELECT @PlaceID = 0
         	END ELSE BEGIN
             		select @PlaceID = ID from place
             		where  type = 2 and clearflag = 0 and Flag = 0; --ȡ������
             		select @Err = @@error;
             		if @Err != 0 goto ErrHandle;

	             IF @PlaceID IS NULL
        	     BEGIN
	               select @Msg = '��������ô���!';
        	       goto ErrHandle;
	             END
        	 END;
		
		select @BreakPoint=352136;
		insert into PDYK0(SheetID,ShopID,RefSheetID,Flag,Editor,EditDate,Operator,ManageDeptID)
		values(@NewSheetID,@MyshopID,@SheetID,0,'WMS',getdate(),'WMS',@ManageDeptID);
		select @Err = @@error;
		if @Err != 0 goto ErrHandle;

		select @BreakPoint=352137;
		Insert into PDYKItem0(SheetID,GoodsCostID,GoodsID,PlaceID,Qty,StockQty, BadQty)        --���Ӽ��㻵����ӯ��(2003-06-27 Victor)
		select @NewSheetID,LotNo,a.GoodsID,@PlaceID,DifQty,0,0
		from interfaceWMSDB.dbo.FR_PDYK a,Goods b where a.GoodsID=b.GoodsID and Ceiling(b.DeptID/@LevelValue)=@ManageDeptID and a.SheetID=@SheetID and a.WasteType=0;

                --�̵�ӯ����������Ϣ��¼��
		INSERT INTO FreshWMS_SheetGoodsCostInfo
                  (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,qty,Cost)
                select distinct 2444,@NewSheetID,LotNo,a.GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,difqty,Cost
                from interfaceWMSDB.dbo.FR_PDYK a,Goods b where a.GoodsID=b.GoodsID and Ceiling(b.DeptID/@LevelValue)=@ManageDeptID and a.SheetID=@SheetID and a.WasteType=0;

		select @Err = @@error;
		if @Err != 0 goto ErrHandle;
		
		--�����Ȳ��Զ����	
		  	exec @Err=ST_PDYK @NewSheetID,'WMS';
	 	if @@error !=0 select @Err=@@error
	 	if (@Err is null) or (@Err <> 0) begin
			select @Msg='�̵�ӯ����˴���!'
			goto ErrHandle;
	 	END;  	                               
	END
	CLOSE Cur_PDYK
	DEALLOCATE Cur_PDYK


	--WMSֱ�ӷ�����....
	SELECT @GoodsID=NULL;
	select TOP 1 @Goodsid=a.GoodsID,@goodscostid=a.LotNO
                from interfaceWMSDB.dbo.FR_PDYK a JOIN goods b ON a.goodsid=b.goodsid where a.SheetID=@SheetID and a.WasteType=1 AND NOT EXISTS(SELECT 1 FROM dbo.GoodsCost gs
                WHERE gs.goodsid=a.GoodsID AND gs.GoodsCostID=a.LotNO) AND Ceiling(b.DeptID/@LevelValue) NOT IN (351,352);
    IF (@GoodsID IS NOT NULL) 
    BEGIN
       SELECT @msg='��Ʒ��'+CAST(@GoodsID AS VARCHAR(10))+'����Ӧ���Ρ�'+CAST(@Goodscostid AS VARCHAR(20))+'����ERP�����ڣ�';
       GOTO ErrHandle;
    END;  
              
	DECLARE Cur_PDYK cursor local for
		select Distinct Ceiling(b.DeptID/@LevelValue) as ManageDeptID from interfaceWMSDB.dbo.FR_PDYK a,goods b where SheetID=@SheetID and a.GoodsID=b.GoodsID
                and a.WasteType=1
	OPEN Cur_PDYK;
	select @Err = @@error;
	if @Err != 0 goto ErrHandle;
	WHILE (1=1)
	BEGIN
		if @@Error != 0 goto ErrHandle;
		FETCH Cur_PDYK into @ManageDeptID
		if @@fetch_status !=0 break;

		select @BreakPoint=352135;
		select @NewSheetID=null
		execute @Err=TL_GetNewSheetID 2413,@NewSheetID output;
		if @Err<>0 or @NewSheetID is null or @NewSheetID='' begin
			select @Err=0
			select @Msg='ȡ���ݺ������!';
			goto ErrHandle;
		END;

         	--����Ĭ�ϴ����
         	if @StockPlaceMode = 0
         	begin --��������
           		execute TL_Deptplace 0,@ManageDeptID,@PlaceID out;
           		IF @PlaceID IS NULL
             		SELECT @PlaceID = 0
         	END ELSE BEGIN
             		select @PlaceID = ID from place
             		where  type = 2 and clearflag = 0 and Flag = 0; --ȡ������
             		select @Err = @@error;
             		if @Err != 0 goto ErrHandle;

	             IF @PlaceID IS NULL
        	     BEGIN
	               select @Msg = '��������ô���!';
        	       goto ErrHandle;
	             END
        	 END;
		
		select @BreakPoint=352136;
		insert into Lost0(SheetID,ShopID,Flag,Editor,EditDate,Operator,ManageDeptID,PlaceID,note)
		values(@NewSheetID,@MyshopID,0,'WMS',getdate(),'WMS',@ManageDeptID,@PlaceID,'WMS������: '+@SheetID);
		select @Err = @@error;
		if @Err != 0 goto ErrHandle;


                 --lostitem0�������ȡ����ֵ��
		select @BreakPoint=352137;
		Insert into LostItem0(SheetID,serialid,GoodsID,DeptID,Price,AskQty,CheckQty,Qty,remask,cost)        
		select @NewSheetID,max(LotNo),a.GoodsID,b.DeptID,max(c.price),ABS(sum(DifQty)),ABS(sum(DifQty)),ABS(sum(DifQty)),'',max(d.cost)
		from interfaceWMSDB.dbo.FR_PDYK a,Goods b,Goodsshop c,cost d where a.GoodsID=b.GoodsID and Ceiling(b.DeptID/@LevelValue)=@ManageDeptID and a.SheetID=@SheetID
                and b.Goodsid=c.goodsid and b.goodsid=d.goodsid and d.flag=0 and c.shopid=d.shopid and c.shopid=@Myshopid and a.WasteType=1
                group by a.goodsid,b.deptid;

                --����������Ϣ��¼��
		INSERT INTO FreshWMS_SheetGoodsCostInfo
                  (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,qty,Cost)
                select distinct 2413,@NewSheetID,LotNo,a.GoodsID,case when ISNUMERIC(VenderID)=0 then -1 else VenderID end,ABS(DifQty),Cost
                from interfaceWMSDB.dbo.FR_PDYK a,Goods b where a.GoodsID=b.GoodsID and Ceiling(b.DeptID/@LevelValue)=@ManageDeptID and a.SheetID=@SheetID and a.WasteType=1;                        

		select @Err = @@error;
		if @Err != 0 goto ErrHandle;
		
		--�Զ����		
      	 	exec @Err=ST_Lost @NewSheetID,'WMS';
	 	if @@error !=0 select @Err=@@error
	 	if (@Err is null) or (@Err <> 0) begin
			select @Msg='������˴���!'
			goto ErrHandle;
	 	END;                                
	END
	CLOSE Cur_PDYK
	DEALLOCATE Cur_PDYK


  end else IF @SheetType=2445	--�������ο������ϴ�.....
  begin
        --У��һ�������Ƿ����,������������������...
        select @Count=count(*) from interfacewmsdb.dbo.FR_ChangeQty
        where sheetid=@sheetid;

        select @Count1=count(*) from interfacewmsdb.dbo.FR_ChangeQty a,goodscost b
        where sheetid=@sheetid and a.goodsid=b.goodsid and a.lotno=b.goodscostid;

        if @Count<>@Count1
        begin
        	select @Msg='���θ�����Ϣ�����ο�治��,��������......'
               	goto ErrHandle;            
        END;
         
        select @Notes=Notes,@ChanageType=ChanageType from interfacewmsdb.dbo.FR_ChangeQty where sheetid=@sheetid;    

        if @ChanageType=-1 select @VenderPayableFlag=1;		--�޸�����,������������
        if @ChanageType=0  select @VenderPayableFlag=0;		--�޸�����,��������������
        if @ChanageType=1  select @VenderPayableFlag=1;		--���յ�,��Ҫ������������
        if @ChanageType=2  select @VenderPayableFlag=0;		--���͵�,��������������
        if @ChanageType=3  select @VenderPayableFlag=0;		--���䵥,��������������
        if @ChanageType=4  select @VenderPayableFlag=1;		--�˻���,��Ҫ������������

	select @Err = @@error;
	if @Err != 0 goto ErrHandle;        

	DECLARE Cur_PCGZ cursor local for
		select Distinct Ceiling(b.DeptID/@LevelValue) as ManageDeptID from interfacewmsdb.dbo.FR_ChangeQty a,goods b 
                where SheetID=@SheetID and a.GoodsID=b.GoodsID
	OPEN Cur_PCGZ;
	select @Err = @@error;
	if @Err != 0 goto ErrHandle;
	WHILE (1=1)
	BEGIN
		if @@Error != 0 goto ErrHandle;
		FETCH Cur_PCGZ into @ManageDeptID
		if @@fetch_status !=0 break;

        	execute @Err=TL_GetNewSheetID 2445,@NewSheetID output;
        	if @Err <> 0 or @Err is null begin
        		select @Msg='���θ������Ų���ʧ��!'
               		goto ErrHandle;
        	END;
  
        	--ȷ��һ�²����������Ĺ���......
       	 	insert into UpdGoodsCost0
       		  (SheetID,VenderPayableFlag,ManageDeptID,Flag,Editor,EditDate,Operator,Notes)
     		Values(@NewSheetID,@VenderPayableFlag,@ManageDeptID,0,'WMS',getdate(),'WMS',substring(@Notes,1,64));

		select @Err = @@error;
		if @Err != 0 goto ErrHandle;

                insert into UpdGoodsCostItem0
                  (SheetID,GoodsCostID,ShopID,GoodsID,VenderID,PayTypeID,Cost,Taxrate,OldQty,AdjustQty,PlaceID,gzid)
                select @Newsheetid,a.LotNo,@Myshopid,a.goodsid,b.venderid,b.paytypeid,b.cost,b.taxrate,b.qty,a.ChangeQty,0,0
                from interfacewmsdb.dbo.FR_ChangeQty a,goodscost b,goods c
                where a.Lotno=b.goodscostid and b.goodsid=c.goodsid and a.sheetid=@sheetid and Ceiling(c.DeptID/@LevelValue)=@ManageDeptID;                                
                
		select @Err = @@error;
		if @Err != 0 goto ErrHandle;
                
      	exec @Err=ST_UpdGoodsCost @NewSheetID,'WMS';
	 	if @@error !=0 select @Err=@@error
	 	if (@Err is null) or (@Err <> 0) begin
			select @Msg='���θ��������˴���!'
			goto ErrHandle;
	 	END; 
	END
	CLOSE Cur_PCGZ;
	DEALLOCATE Cur_PCGZ;
     
  END ELSE IF @SheetType=2522	--�ӹ��ֽ�   
  BEGIN
    select @MachineFlag=MachineFlag from Interfacewmsdb.dbo.FR_jg where Sheetid=@sheetid;
        
    IF @MachineFlag=0  --�ӹ� 0
    begin
      select @Count=count(*) from Interfacewmsdb.dbo.FR_jg where Sheetid=@sheetid and MateFlag=0;
      if @Count<>1
      begin
       	select @Msg='�ӹ�ֻ��������1����Ʒ!'
       	goto ErrHandle;
      END;

      --��ȡ�ӹ�����Ʒ
      select @goodsid=goodsid,@Qty=Realqty,@Cost=Cost from Interfacewmsdb.dbo.FR_jg where Sheetid=@sheetid and MateFlag=0;

      execute @Err=TL_GetNewSheetID 2527,@NewSheetID output;
      if @Err <> 0 or @Err is null begin
       	select @Msg='�ӹ��ֽⵥ�Ų���ʧ��!'
       	goto ErrHandle;
      END;
       
      select @Deptid=deptid from goods where goodsid=@goodsid
      select @TaxRate=CostTaxRate from Cost where goodsid=@goodsid and flag=0;        

      Insert into Machinein0
        (sheetid,flag,shopid,editor,editdate,operator,GoodsID,DeptID,Cost,TaxRate,Qty,lostqty,machineflag,note,OutPlaceID,InPlaceID)
      Values(@NewSheetid,0,@MyshopID,'WMS',getdate(),'WMS',@GoodsID,@DeptID,@Cost,@TaxRate,@qty,0,@MachineFlag,'WMS�ϴ��ӹ���',0,0);
      select @Err = @@error; if @Err != 0 goto ErrHandle;
        
      Insert into Machineinitem0
      (Sheetid,GoodsID,DeptID,Qty,Cost,TaxRate)
      select @NewSheetid,a.GoodsID,b.DeptID,ABS(a.Realqty),c.cost,c.costtaxrate
      from (select sheetid,goodsid,mateflag,sum(Realqty) as realqty from Interfacewmsdb.dbo.FR_jg where sheetid=@Sheetid group by sheetid,goodsid,MateFlag) a,goods b,cost c
      where a.goodsid=b.goodsid and a.sheetid=@Sheetid and a.MateFlag=1 and a.goodsid=c.goodsid and c.shopid=@myshopid and c.flag=0;
      select @Err=@@Error; if @Err!=0 goto ErrHandle;
    END ELSE BEGIN	   --�ֽ� 1
      select @Count=count(*) from Interfacewmsdb.dbo.FR_jg where Sheetid=@sheetid and MateFlag=1;
      if @Count<>1
      begin
      	select @Msg='�ֽ�ֻ����ֽ�1��ԭ��!'
       	goto ErrHandle;
      END;

      --��ȡ�ֽ����Ʒ
      select @goodsid=goodsid,@Qty=Realqty from Interfacewmsdb.dbo.FR_jg where Sheetid=@sheetid and MateFlag=1;

      execute @Err=TL_GetNewSheetID 2527,@NewSheetID output;
      if @Err <> 0 or @Err is null begin
       	select @Msg='�ӹ��ֽⵥ�Ų���ʧ��!'
       	goto ErrHandle;
      END;
       
      SELECT @Deptid=deptid FROM goods WHERE goodsid=@goodsid
      SELECT @TaxRate=CostTaxRate,@Cost=Cost FROM Cost WHERE goodsid=@goodsid AND flag=0;        

      INSERT INTO Machinein0
        (sheetid,flag,shopid,editor,editdate,operator,GoodsID,DeptID,Cost,TaxRate,Qty,lostqty,machineflag,note,OutPlaceID,InPlaceID)
      VALUES(@NewSheetid,0,@MyshopID,'WMS',GETDATE(),'WMS',@GoodsID,@DeptID,0,@TaxRate,@qty,0,@MachineFlag,'WMS�ϴ��ֽⵥ',0,0)
      SELECT @Err = @@error;
	  IF @Err != 0 GOTO ErrHandle;            

      INSERT INTO Machineinitem0
        (Sheetid,GoodsID,DeptID,Qty,Cost,TaxRate)
      SELECT @NewSheetid,a.GoodsID,b.DeptID,ABS(a.Realqty),A.cost,ISNULL(c.costtaxrate,0)
      FROM (SELECT sheetid,goodsid,mateflag,SUM(Realqty) AS realqty,COST FROM Interfacewmsdb.dbo.FR_jg WHERE sheetid=@Sheetid GROUP BY sheetid,goodsid,MateFlag,COST) a,goods b,cost c
      WHERE a.goodsid=b.goodsid AND a.sheetid=@Sheetid AND a.MateFlag=0 AND a.goodsid=c.goodsid AND c.shopid=@myshopid AND c.flag=0;
    END;
    SELECT @Err = @@error;
 	IF @Err != 0 GOTO ErrHandle;            
 
    INSERT INTO FreshWMS_SheetGoodsCostInfo
      (SheetType,SheetID,GoodsCostID,a.GoodsID,VenderID,Cost,Qty)
    SELECT DISTINCT 2527,@NewsheetID,LotNo,GoodsID,CASE WHEN ISNUMERIC(VenderID)=0 THEN -1 ELSE VenderID END,Cost,Realqty
    FROM interfaceWMSDB.dbo.FR_JG WHERE SheetID=@SheetID AND LotNo<>-1;   

     SELECT @Err = @@error;
     IF @Err != 0 GOTO ErrHandle;            

   	EXEC @Err=ST_Machinein @NewSheetID,'WMS';
	IF @@error !=0 SELECT @Err=@@error
	IF (@Err IS NULL) OR (@Err <> 0) BEGIN
		SELECT @Msg='�ӹ��ֽⵥ���˴���!'
		GOTO ErrHandle;
	 END;         
  END;

  RETURN 0;

ErrHandle:
  RAISERROR('%s,�ϵ�=%d,Err=%d',16,1,@Msg,@BreakPoint,@Err);
  RETURN -1;
END



GO
