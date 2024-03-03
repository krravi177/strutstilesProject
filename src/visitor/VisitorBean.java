package visitor;

import org.apache.struts.action.ActionForm;

public class VisitorBean extends ActionForm{
 String stCode;
 String distCode;
 String vName;
 String vAdd;
 String vEmail;
 String vPhone;
 int rid;
 
public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public String getvAdd() {
	return vAdd;
}
public void setvAdd(String vAdd) {
	this.vAdd = vAdd;
}
public String getvEmail() {
	return vEmail;
}
public void setvEmail(String vEmail) {
	this.vEmail = vEmail;
}
public String getvPhone() {
	return vPhone;
}
public void setvPhone(String vPhone) {
	this.vPhone = vPhone;
}
 
 
}
