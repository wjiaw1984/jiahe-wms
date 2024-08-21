 package cn.com.wms.mybaits.service.sdwms.impl;

 import cn.com.wms.model.wms.sdwms.SdwmsGoods;
 import cn.com.wms.mybaits.dao.wms.sdwms.ISdwmsGoodsDao;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsGoodsDataService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import com.baomidou.mybatisplus.core.metadata.IPage;
 import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import java.util.List;
 import java.util.stream.Collectors;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;
 import org.springframework.util.CollectionUtils;

 @Component
 public class SdwmsGoodsDataServiceImpl
   extends ServiceImpl<ISdwmsGoodsDao, SdwmsGoods>
   implements ISdwmsGoodsDataService {
/* 22 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.sdwms.impl.SdwmsGoodsDataServiceImpl.class);


   public SdwmsGoods getGoodsInfo(String goodsId) {
/* 26 */     QueryWrapper<SdwmsGoods> qw = new QueryWrapper();
/* 27 */     qw.eq("goodsid", goodsId);
/* 28 */     return (SdwmsGoods)getOne((Wrapper)qw);
   }


   public List<SdwmsGoods> listByGoodsIds(List<String> goodsIds) {
/* 33 */     QueryWrapper<SdwmsGoods> qw = new QueryWrapper();
/* 34 */     qw.in("goodsid", goodsIds);
/* 35 */     Page page = new Page(1L, 1000L);
/* 36 */     return page((IPage)page, (Wrapper)qw).getRecords();
   }


   public void toBak(List<SdwmsGoods> list) {
/* 41 */     if (CollectionUtils.isEmpty(list)) {
       return;
     }

/* 45 */     List<String> sheetIds = (List<String>)list.stream().map(SdwmsGoods::getSheetid).collect(Collectors.toList());
/* 46 */     QueryWrapper<SdwmsGoods> qw = new QueryWrapper();
/* 47 */     qw.in("sheetid", sheetIds);
/* 48 */     ((ISdwmsGoodsDao)this.baseMapper).insertBak((Wrapper)qw);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\impl\SdwmsGoodsDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */