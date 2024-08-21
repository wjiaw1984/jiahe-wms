package cn.com.wms.mybaits.dao.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsGoods;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface ISdwmsGoodsDao extends BaseMapper<SdwmsGoods> {
  @Insert({"insert into SDWMS_Goods_Bak select * from SDWMS_Goods ${ew.customSqlSegment}"})
  void insertBak(@Param("ew") Wrapper<SdwmsGoods> paramWrapper);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\dao\wms\sdwms\ISdwmsGoodsDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */