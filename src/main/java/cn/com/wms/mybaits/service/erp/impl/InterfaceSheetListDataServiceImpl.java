
package cn.com.wms.mybaits.service.erp.impl;


import cn.com.wms.model.erp.InterfaceSheetList;
 import cn.com.wms.mybaits.dao.erp.IInterfaceSheetListDao;
import cn.com.wms.mybaits.service.erp.IInterfaceSheetListDataService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import com.baomidou.mybatisplus.core.metadata.IPage;
 import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import java.util.Arrays;
import java.util.List;
 import java.util.stream.Collectors;
 import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;



@Component
@Slf4j
public class InterfaceSheetListDataServiceImpl extends ServiceImpl<IInterfaceSheetListDao, InterfaceSheetList>
        implements IInterfaceSheetListDataService {

    @Override
    public List<InterfaceSheetList> listByExecuteFlag(Integer executeFlag) {
        /* 21 */
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        /* 22 */
        qw.eq("executeFlag", executeFlag);
        /* 23 */
        return list(qw);

    }


    @Override
    public List<InterfaceSheetList> listBySheetTypeAndExecuteFlag(Integer sheetType, Integer executeFlag) {
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        qw.eq("sheetType", sheetType).eq("executeFlag", executeFlag);
        Page<InterfaceSheetList> page = new Page(1L, 500L);
        IPage<InterfaceSheetList> iPage = page((IPage) page, (Wrapper) qw);
        return iPage.getRecords();
    }

    public List<InterfaceSheetList> listGoods() {
        return listBySheetTypeAndExecuteFlag(Integer.valueOf(1001), Integer.valueOf(1));
    }

    public List<String> listSheetRationNoteJob() {
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        qw.select("distinct sheetid").eq("executeFlag", 1)
                .in("sheetType", Arrays.asList(2330, 2331, 2342));
        return list(qw).stream().map(InterfaceSheetList::getSheetid).collect(Collectors.toList());
    }




    public List<InterfaceSheetList> listRetRationJob() {
        /* 50 */
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        /* 51 */
        ((QueryWrapper) qw.eq("executeFlag", Integer.valueOf(1))).in("sheetType", new Object[]{Integer.valueOf(2332), Integer.valueOf(2344)});
        /* 52 */
        return list((Wrapper) qw);

    }




    public List<InterfaceSheetList> listRetJob() {
        /* 57 */
        return listBySheetTypeAndExecuteFlag(Integer.valueOf(2323), Integer.valueOf(1));

    }




    public List<InterfaceSheetList> listPurchaseJob() {
        /* 62 */
        return listBySheetTypeAndExecuteFlag(Integer.valueOf(2301), Integer.valueOf(1));

    }




    public List<String> listSheetBySheetTypeAndExecuteFlag(Integer sheetType, Integer executeFlag) {
        /* 67 */
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        /* 68 */
        qw.select("distinct sheetid").eq("executeFlag", 1).eq("sheetType", sheetType);
        /* 69 */
        List<String> result = list(qw).stream().map(InterfaceSheetList::getSheetid).collect(Collectors.toList());
        /* 70 */
        return result;

    }


    public List<InterfaceSheetList> listRationNoteJob() {
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        qw.eq("executeFlag", 1).in("sheetType", new Object[]{2330, 2331, 2342});
        return list(qw);
    }

    public void updateExecuteFlag(String sheetId, Integer sheetType, Integer executeFlag) {
        /* 82 */
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        /* 83 */
        qw.eq("sheetType", sheetType).eq("sheetId", sheetId);
        /* 84 */
        InterfaceSheetList entity = new InterfaceSheetList();
        /* 85 */
        entity.setExecuteFlag(executeFlag);
        /* 86 */
        update(entity, qw);
    }




    public void updateExecuteFlag(List<String> sheetIds, Integer sheetType, Integer executeFlag) {
        /* 91 */
        QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
        /* 92 */
        qw.eq("sheetType", sheetType).in("sheetId", sheetIds);
        /* 93 */
        InterfaceSheetList entity = new InterfaceSheetList();
        /* 94 */
        entity.setExecuteFlag(executeFlag);
        /* 95 */
        update(entity, qw);
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\erp\impl\InterfaceSheetListDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */