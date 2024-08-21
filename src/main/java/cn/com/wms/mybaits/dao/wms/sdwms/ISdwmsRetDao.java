package cn.com.wms.mybaits.dao.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsRet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface ISdwmsRetDao extends BaseMapper<SdwmsRet> {
  @Insert({"insert into sdwms_ret_bak select * from sdwms_ret where sheetid = #{sheetId}"})
  void toBak(String paramString);
  
  @Delete({"delete from sdwms_ret where sheetid = #{sheetId}"})
  void deleteBySheetId(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\dao\wms\sdwms\ISdwmsRetDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */