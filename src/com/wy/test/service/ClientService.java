package com.wy.test.service;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class ClientService {

	public static void main(String[] args) {
		
		//String endpoint = "http://localhost:8077/WYSCService/services/wysc?wsdl";  
		String endpoint = "http://wysc.hb.189.cn/WYSCService/services/wysc?wsdl";  
		String operationName = "orderfeedback";
		Service service = new Service();//创建一个Service实例
		Call call = null;
		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(endpoint));//为Call设置服务的位置
			call.setOperationName(operationName);//要调用的方法名
			String requestXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><treatyroot><syscont><appkey>2302636501</appkey><method>orderfeedback</method><sysid>10001</sysid><subchannelcode>9000521410001534</subchannelcode><transactionid>100012017062933388</transactionid><reqtime>20170629113525</reqtime><sign>43A16EA87FC5BF2C95D86AEE860A51C53BED8B520D32740C8010D30D6779D4F48E57E8921AA50CCFAA31D807DDF213BEF5454E38E7A522BC2EE3EC2110C17F9363A224C6495909B746E19810A091C8BF</sign><version>2.0</version></syscont><ordercont><weborder>sjyt_20170628160843534</weborder><orderstatus>R1001</orderstatus></ordercont></treatyroot>";
			String ret = (String) call.invoke(new Object[] { requestXml });  
	        System.out.println(ret);  
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
