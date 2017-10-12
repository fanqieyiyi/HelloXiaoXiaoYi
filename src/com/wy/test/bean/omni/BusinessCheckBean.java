package com.wy.test.bean.omni;


import com.thoughtworks.xstream.annotations.XStreamAlias;

public class BusinessCheckBean {

	@XStreamAlias("Head")
	private HeadBean head;
	@XStreamAlias("Body")
	private BodyBean Body;

	public HeadBean getHead() {
		return head;
	}
	public void setHead(HeadBean head) {
		this.head = head;
	}
	public BodyBean getBody() {
		return Body;
	}
	public void setBody(BodyBean body) {
		Body = body;
	}
	
}
