package com.wy.test.bean.omni;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class BodyBean {
	
	@XStreamAlias("Business")
	private BusinessBean business;
	@XStreamAsAttribute//将type标识为Business的属性
	@XStreamAlias("type")
	private String type;
	@XStreamAlias("ReturnCode")
	private String ReturnCode;
	@XStreamAlias("Message")
	private String Message;
	
	public BusinessBean getBusiness() {
		return business;
	}
	public void setBusiness(BusinessBean business) {
		this.business = business;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReturnCode() {
		return ReturnCode;
	}
	public void setReturnCode(String returnCode) {
		ReturnCode = returnCode;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
}
