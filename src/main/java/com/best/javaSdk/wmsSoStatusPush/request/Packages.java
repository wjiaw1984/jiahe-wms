
package com.best.javaSdk.wmsSoStatusPush.request;



import com.alibaba.fastjson2.annotation.JSONField;
 import com.best.javaSdk.wmsSoStatusPush.request.Package;
import lombok.Data;
 import java.util.List;

@Data
public class Packages {

    @JSONField(name = "package")
    private List<Package> items;


    public String toString() {
        /* 12 */
        return "Packages(items=" + getItems() + ")";
    }


    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Packages;
    }



    public void setItems(List<Package> items) {
        this.items = items;
    }



    public List<Package> getItems() {
        /* 15 */
        return this.items;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Packages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */