package cn.com.wms.mybaits.dao.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface ISdwmsRationnoteDao extends BaseMapper<SdwmsRationnote> {
  @Insert({"insert into sdwms_rationnote_bak select * from SDWMS_RationNote where sheetid = #{sheetId}"})
  void toBak(String paramString);
  
  @Delete({"delete from SDWMS_RationNote where sheetid = #{sheetId}"})
  void deleteBySheetId(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\dao\wms\sdwms\ISdwmsRationnoteDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */