package cn.com.wms.mybaits.service.sdwms.impl;

import cn.com.wms.model.wms.sdwms.SdwmsRetration;
import cn.com.wms.mybaits.dao.wms.sdwms.ISdwmsRetrationDao;
import cn.com.wms.mybaits.service.sdwms.ISdwmsRetrationDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class SdwmsRetrationDataServiceImpl extends ServiceImpl<ISdwmsRetrationDao, SdwmsRetration> implements ISdwmsRetrationDataService {

    public void toBak(String sheetId) {
        /* 16 */
        ((ISdwmsRetrationDao) this.baseMapper).toBak(sheetId);
        /* 17 */
        ((ISdwmsRetrationDao) this.baseMapper).deleteBySheetId(sheetId);
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\impl\SdwmsRetrationDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */