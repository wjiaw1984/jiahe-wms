if not exists(select 1 from module where moduleid = 882201)
  insert into module(ModuleID,LanguageID,SystemID,EnabledRightBit,DLLName,Name,Caption,HINT,ResourceIndex,Enabled) 
  values(882201,936,55,63,'zb','MJH2201','�ջ�����ϵ��ʽά��','�ջ�����ϵ��ʽά��',-1,1);
go
