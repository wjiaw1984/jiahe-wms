
package com.best.javaSdk.wmsAsnStatusPush.request;



import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Batch {
    private String fixStatusCode;
    private Date productionDate;
    private List<String> packCode;
    private String uomCode;
    private String quantity;
    private String decimalQuantity;


    public void setFixStatusCode(String fixStatusCode) {
        this.fixStatusCode = fixStatusCode;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void setPackCode(List<String> packCode) {
        this.packCode = packCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDecimalQuantity(String decimalQuantity) {
        this.decimalQuantity = decimalQuantity;
    }

    public String toString() {
        return "Batch(fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", packCode=" + getPackCode() + ", uomCode=" + getUomCode() + ", quantity=" + getQuantity() + ", decimalQuantity=" + getDecimalQuantity() + ")";
    }

    
    public String getFixStatusCode() {
        /* 15 */
        return this.fixStatusCode;
        
    }

    public Date getProductionDate() {
        /* 17 */
        return this.productionDate;
        
    }

    public List<String> getPackCode() {
        /* 19 */
        return this.packCode;
        
    }

    public String getUomCode() {
        /* 21 */
        return this.uomCode;
        
    }

    public String getQuantity() {
        /* 23 */
        return this.quantity;
        
    }

    public String getDecimalQuantity() {
        /* 25 */
        return this.decimalQuantity;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\request\Batch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */