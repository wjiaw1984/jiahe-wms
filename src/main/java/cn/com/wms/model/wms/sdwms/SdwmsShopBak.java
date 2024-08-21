
package cn.com.wms.model.wms.sdwms;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@TableName("SDWMS_Shop_BAK")
@Data
public class SdwmsShopBak implements Serializable {
    private static final long serialVersionUID = -3643014673347548805L;
    private String sheetid;
    private String shopid;
    private String customid;
    private String name;
    private Integer shopType;
    private String manager;
    private String linkMan;
    private String address;
    private String zipcode;
    private String tele;
    private String fax;
    private String eMail;
    private String notes;
    private Integer status;


}
