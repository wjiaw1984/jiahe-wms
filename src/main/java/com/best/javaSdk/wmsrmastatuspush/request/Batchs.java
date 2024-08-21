package com.best.javaSdk.wmsrmastatuspush.request;

import lombok.Data;

import java.util.List;


@Data
public class Batchs {
    private List<Batch> batch;

    public String toString() {
        /* 12 */
        return "Batchs(batch=" + getBatch() + ")";
    }


    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsrmastatuspush.request.Batchs;
    }


    public void setBatch(List<Batch> batch) {
        this.batch = batch;
    }

    public List<Batch> getBatch() {
        /* 14 */
        return this.batch;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsrmastatuspush\request\Batchs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */