
package cn.com.wms.common.context.impl;



import cn.com.wms.common.context.SessionContext;
import cn.com.wms.common.context.SessionResource;
import lombok.Data;
 import java.util.ArrayList;
import java.util.List;

@Data
public class SessionContextImpl implements SessionContext {
    protected String entId;
    protected String entCode;
    protected String entName;
    protected String userId;
    protected String userCode;


    public void setEntId(String entId) {
        this.entId = entId;
    }

    protected String userName;
    protected String locale;
    protected String session;
    protected String token;
    protected Object extend;
    protected List<SessionResource> resources;

    public void setEntCode(String entCode) {
        this.entCode = entCode;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExtend(Object extend) {
        this.extend = extend;
    }

    public void setResources(List<SessionResource> resources) {
        this.resources = resources;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.context.impl.SessionContextImpl;
    }


    public String toString() {
        return "SessionContextImpl(entId=" + getEntId() + ", entCode=" + getEntCode() + ", entName=" + getEntName() + ", userId=" + getUserId() + ", userCode=" + getUserCode() + ", userName=" + getUserName() + ", locale=" + getLocale() + ", session=" + getSession() + ", token=" + getToken() + ", extend=" + getExtend() + ", resources=" + getResources() + ")";
    }

    
    /* 15 */
    public String getEntId() {
        return this.entId;
    }

    /* 16 */
    public String getEntCode() {
        return this.entCode;
    }

    /* 17 */
    public String getEntName() {
        return this.entName;
    }

    /* 18 */
    public String getUserId() {
        return this.userId;
    }

    /* 19 */
    public String getUserCode() {
        return this.userCode;
    }

    /* 20 */
    public String getUserName() {
        return this.userName;
    }

    /* 21 */
    public String getLocale() {
        return this.locale;
    }

    /* 22 */
    public String getSession() {
        return this.session;
    }

    /* 23 */
    public String getToken() {
        return this.token;
    }

    public Object getExtend() {
        /* 24 */
        return this.extend;
        
    }

    
    
    
    public List<SessionResource> getResources() {
        /* 29 */
        return this.resources;
        
    }

    
    public SessionContextImpl() {
        /* 32 */
        this.resources = new ArrayList<>();
        
    }

    
    
    public SessionContextImpl(String entId, String entCode, String entName, String userId, String userCode, String userName, String locale) {
        /* 36 */
        this.entId = entId;
        /* 37 */
        this.entCode = entCode;
        /* 38 */
        this.entName = entName;
        /* 39 */
        this.userId = userId;
        /* 40 */
        this.userCode = userCode;
        /* 41 */
        this.userName = userName;
        /* 42 */
        this.locale = locale;
        /* 43 */
        this.resources = new ArrayList<>();
        
    }

    
    
    public SessionContextImpl(String entId, String entCode, String entName, String userId, String userCode, String userName, String session, String token, String locale) {
        /* 47 */
        this.entId = entId;
        /* 48 */
        this.entCode = entCode;
        /* 49 */
        this.entName = entName;
        /* 50 */
        this.userId = userId;
        /* 51 */
        this.userCode = userCode;
        /* 52 */
        this.userName = userName;
        /* 53 */
        this.token = token;
        /* 54 */
        this.session = session;
        /* 55 */
        this.locale = locale;
        /* 56 */
        this.resources = new ArrayList<>();
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\impl\SessionContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */