package com.wy.test.bean.omni;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class HeadBean {

	@XStreamAlias("ActionCode")
	private String actionCode;
	@XStreamAlias("TransactionID")
	private String transactionID;
	@XStreamAlias("SrcSysID")
	private String srcSysID;
	@XStreamAlias("SrcSysSign")
	private String srcSysSign;
	@XStreamAlias("ReqTime")
	private String reqTime;
	@XStreamAlias("RegionId")
	private String regionId;
	@XStreamAlias("StaffId")
	private String staffId;
	
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getSrcSysID() {
		return srcSysID;
	}
	public void setSrcSysID(String srcSysID) {
		this.srcSysID = srcSysID;
	}
	public String getSrcSysSign() {
		return srcSysSign;
	}
	public void setSrcSysSign(String srcSysSign) {
		this.srcSysSign = srcSysSign;
	}
	public String getReqTime() {
		return reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	
	
}
