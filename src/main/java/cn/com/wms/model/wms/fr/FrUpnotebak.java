/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.fr;
/*     */ @TableName("FR_UpNoteBak")
/*     */ public class FrUpnotebak implements Serializable { private static final long serialVersionUID = -2038900693103920072L;
/*     */   private Integer id;
/*     */   private String sheetid;
/*     */   private Integer sheetType;
/*     */   
/*   8 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.fr.FrUpnotebak)) return false;  cn.com.wms.model.wms.fr.FrUpnotebak other = (cn.com.wms.model.wms.fr.FrUpnotebak)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType(); if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType)) return false;  Object this$sendShop = getSendShop(), other$sendShop = other.getSendShop(); if ((this$sendShop == null) ? (other$sendShop != null) : !this$sendShop.equals(other$sendShop)) return false;  Object this$receiveShop = getReceiveShop(), other$receiveShop = other.getReceiveShop(); if ((this$receiveShop == null) ? (other$receiveShop != null) : !this$receiveShop.equals(other$receiveShop)) return false;  Object this$noteTime = getNoteTime(), other$noteTime = other.getNoteTime(); if ((this$noteTime == null) ? (other$noteTime != null) : !this$noteTime.equals(other$noteTime)) return false;  Object this$handleTime = getHandleTime(), other$handleTime = other.getHandleTime(); if ((this$handleTime == null) ? (other$handleTime != null) : !this$handleTime.equals(other$handleTime)) return false;  Object this$flag = getFlag(), other$flag = other.getFlag(); return !((this$flag == null) ? (other$flag != null) : !this$flag.equals(other$flag)); } private String sendShop; private String receiveShop; private Date noteTime; private Date handleTime; private Integer flag; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.fr.FrUpnotebak; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $sheetType = getSheetType(); result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode()); Object $sendShop = getSendShop(); result = result * 59 + (($sendShop == null) ? 43 : $sendShop.hashCode()); Object $receiveShop = getReceiveShop(); result = result * 59 + (($receiveShop == null) ? 43 : $receiveShop.hashCode()); Object $noteTime = getNoteTime(); result = result * 59 + (($noteTime == null) ? 43 : $noteTime.hashCode()); Object $handleTime = getHandleTime(); result = result * 59 + (($handleTime == null) ? 43 : $handleTime.hashCode()); Object $flag = getFlag(); return result * 59 + (($flag == null) ? 43 : $flag.hashCode()); } public String toString() { return "FrUpnotebak(id=" + getId() + ", sheetid=" + getSheetid() + ", sheetType=" + getSheetType() + ", sendShop=" + getSendShop() + ", receiveShop=" + getReceiveShop() + ", noteTime=" + getNoteTime() + ", handleTime=" + getHandleTime() + ", flag=" + getFlag() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getId() {
/*  49 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(Integer id) {
/*  58 */     this.id = id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  67 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  76 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSheetType() {
/*  85 */     return this.sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetType(Integer sheetType) {
/*  94 */     this.sheetType = sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSendShop() {
/* 103 */     return this.sendShop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSendShop(String sendShop) {
/* 112 */     this.sendShop = sendShop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReceiveShop() {
/* 121 */     return this.receiveShop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReceiveShop(String receiveShop) {
/* 130 */     this.receiveShop = receiveShop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getNoteTime() {
/* 139 */     return this.noteTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNoteTime(Date noteTime) {
/* 148 */     this.noteTime = noteTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getHandleTime() {
/* 157 */     return this.handleTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHandleTime(Date handleTime) {
/* 166 */     this.handleTime = handleTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlag() {
/* 175 */     return this.flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlag(Integer flag) {
/* 184 */     this.flag = flag;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrUpnotebak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */