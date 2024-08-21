package BOOT-INF.classes.cn.com.wms.model.bset;

import cn.com.wms.model.bset.ItemVo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RetStatusVo implements Serializable {
  private String customerCode;
  
  private String warehouseCode;
  
  private String orderCode;
  
  private String rmaStatus;
  
  private String extOrderType;
  
  private String logisticsProviderCode;
  
  private String shippingOrderNo;
  
  private String note;
  
  private String receiveTime;
  
  private Date checkStartTime;
  
  private Date checkEndTime;
  
  private String udf1;
  
  private String udf2;
  
  private String udf3;
  
  private String udf4;
  
  private String udf5;
  
  private String udf6;
  
  private String udf7;
  
  private String udf8;
  
  private List<ItemVo> products;
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\RetStatusVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */