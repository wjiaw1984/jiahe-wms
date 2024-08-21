package cn.com.wms.service.erp.impl;

import cn.com.wms.mybaits.service.erp.IInterfaceSheetListDataService;
import cn.com.wms.service.erp.IJobService;
import cn.com.wms.service.wms.sdwms.ISdwmsGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JobServiceImpl implements IJobService {
    @Autowired
    ISdwmsGoodsService goodsService;
    @Autowired
    IInterfaceSheetListDataService interfaceSheetListDataService;

    public void setGoodsService(ISdwmsGoodsService goodsService) {
        /* 18 */
        this.goodsService = goodsService;
    }

    public void setInterfaceSheetListDataService(IInterfaceSheetListDataService interfaceSheetListDataService) {
        this.interfaceSheetListDataService = interfaceSheetListDataService;
    }


    public String toString() {
        return "JobServiceImpl(goodsService=" + getGoodsService() + ", interfaceSheetListDataService=" + getInterfaceSheetListDataService() + ")";
    }

    public ISdwmsGoodsService getGoodsService() {
        /* 21 */
        return this.goodsService;
    }

    public IInterfaceSheetListDataService getInterfaceSheetListDataService() {
        /* 24 */
        return this.interfaceSheetListDataService;
    }


    public void doGoodsJob() {
    }


    public void doRationNoteJob() {
    }


    public void doRetJob() {
    }


    public void doRetRetrationJob() {
    }


    public void doPurchaseJob() {
    }


    public void doAllJob() {
        /* 53 */
        doGoodsJob();
        /* 54 */
        doRationNoteJob();
        /* 55 */
        doRetJob();
        /* 56 */
        doRetRetrationJob();
        /* 57 */
        doPurchaseJob();

        /* 59 */
        log.info("执行所有任务完成");
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\impl\JobServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */