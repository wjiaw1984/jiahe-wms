
package cn.com.wms.common.context;



import lombok.Data;

import java.util.Set;

@Data
public class SessionResource {
    private String type;
    private Set<String> codes;


    public void setType(String type) {
        /* 10 */
        this.type = type;
    }

    public void setCodes(Set<String> codes) {
        this.codes = codes;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.context.SessionResource;
    }


    public String toString() {
        return "SessionResource(type=" + getType() + ", codes=" + getCodes() + ")";
    }

    public String getType() {
        /* 15 */
        return this.type;

    }



    public Set<String> getCodes() {
        /* 19 */
        return this.codes;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\SessionResource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */