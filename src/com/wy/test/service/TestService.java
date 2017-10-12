package com.wy.test.service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.wy.test.bean.omni.BodyBean;
import com.wy.test.bean.omni.BusinessBean;
import com.wy.test.bean.omni.BusinessCheckBean;
import com.wy.test.bean.omni.TreatyrootBean;

public class TestService {

	public String getInfo(String name){
		if(name.equals("wenyi")){
			return name + " is good girl!";
		}else{
			return name + "not good!";
		}
		
	}
	
	public String managePreIndent(String requestXml){
		BusinessCheckBean businessCheckBean = new BusinessCheckBean();
		BodyBean body = new BodyBean();
		body.setReturnCode("1");
		body.setMessage("Index: 0, Size: 0");
		businessCheckBean.setBody(body);
		XStream responseXmlStream = new XStream(new DomDriver());
		responseXmlStream.alias("BusinessCheck", BusinessCheckBean.class);
		String responseXml = responseXmlStream.toXML(businessCheckBean);
		System.out.println(responseXml);
		return responseXml;
	}
	
	public String orderync(String requestXml){
		TreatyrootBean bean = new TreatyrootBean();
		bean.setReturncode("0000");
		bean.setMessage("success");
		XStream responseXmlStream = new XStream(new DomDriver());
		responseXmlStream.alias("TreatyrootBean", TreatyrootBean.class);
		String responseXml = responseXmlStream.toXML(bean);
		return responseXml;
	}
	
	public String orderupdate(String requestXml){
		TreatyrootBean bean = new TreatyrootBean();
		bean.setReturncode("0000");
		bean.setMessage("success");
		XStream responseXmlStream = new XStream(new DomDriver());
		responseXmlStream.alias("TreatyrootBean", TreatyrootBean.class);
		String responseXml = responseXmlStream.toXML(bean);
		return responseXml;
	}
	
	
}
