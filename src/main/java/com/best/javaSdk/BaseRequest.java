package BOOT-INF.classes.com.best.javaSdk;

import com.best.javaSdk.BaseResponse;

public interface BaseRequest {
  String obtainServiceType();
  
  BaseResponse makeResponse(String paramString1, String paramString2);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\BaseRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */