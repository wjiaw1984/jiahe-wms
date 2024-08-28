package com.best.javaSdk.twSoNotify.request;

import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
import cn.com.wms.model.wms.sdwms.SdwmsRet;
import com.best.javaSdk.twSoNotify.request.Item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;


public class ItemList {
    private List<Item> item;

    public List<Item> getItem() {
        /* 23 */
        return this.item;
    }


    public void setItem(List<Item> value) {
        /* 28 */
        this.item = value;
    }


    public static com.best.javaSdk.twSoNotify.request.ItemList buildForRet(List<SdwmsRet> retList) {
        /* 39 */
        com.best.javaSdk.twSoNotify.request.ItemList result = new com.best.javaSdk.twSoNotify.request.ItemList();

        /* 41 */
        if (CollectionUtils.isEmpty(retList)) {
            /* 42 */
            return result;
        }

        /* 45 */
        if (CollectionUtils.isEmpty(result.getItem())) {
            /* 46 */
            result.setItem(new ArrayList<>());
        }

        /* 49 */
        Integer lineNo = Integer.valueOf(1);

        /* 51 */
        for (SdwmsRet ret : retList) {

            /* 53 */
            Item item = Item.buildForRet(ret, lineNo);

            /* 55 */
            result.getItem().add(item);

            /* 57 */
            Integer integer1 = lineNo, integer2 = lineNo = Integer.valueOf(lineNo.intValue() + 1);
        }


        /* 61 */
        return result;
    }


    public static com.best.javaSdk.twSoNotify.request.ItemList buildForRationNote(List<SdwmsRationnote> list) {
        com.best.javaSdk.twSoNotify.request.ItemList result = new com.best.javaSdk.twSoNotify.request.ItemList();

        if (CollectionUtils.isEmpty(list)) {
            return result;
        }

        if (CollectionUtils.isEmpty(result.getItem())) {
            result.setItem(new ArrayList<>());
        }


        /* 83 */
        Integer lineNo = Integer.valueOf(1);

        /* 85 */
        for (SdwmsRationnote listItem : list) {
            /* 86 */
            Item item = Item.buildForRationNote(listItem, lineNo);

            /* 88 */
            result.getItem().add(item);

            /* 90 */
            Integer integer1 = lineNo, integer2 = lineNo = Integer.valueOf(lineNo.intValue() + 1);
        }


        /* 94 */
        return result;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\ItemList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */