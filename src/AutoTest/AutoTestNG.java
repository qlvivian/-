package AutoTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.Socket;
import java.util.Arrays;
import java.util.UUID;
import java.util.Date;
import java.text.*;

import swing.TestSendByExcel;




public class AutoTestNG {
//	String Ip = Selection.Ip;
	String Ip = "188.101.21.186";
	private static int Port = 5023;
	private static String strPath = System.getProperty("user.dir");
	public static String get25uddi() {
		UUID uuid = UUID.randomUUID(); 
		Date date = new Date();
    	SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");
    	String testdate = df.format(date);
		String ss = uuid.toString().replaceAll("-", "").substring(0,13);
		ss="CS"+testdate+ss.toUpperCase();
		return ss;
	}
	

	public void print(){
	String[] strarr = Selection.casename;
	System.out.println("测试案例："+Arrays.toString(strarr));
	}



@Test
	public void test1111() {
//拼报文发送到服务器
	   	String str ="{\r\n" + 
    			"	\"Body\":{\r\n" + 
    			"		\"Input\":{\r\n" + 
    			"			\"kahao\":\"0000000000\",\r\n" +
    			"			\"mima\":\"\r\n" +
    			"		}\r\n" + 
    			"	},\r\n" + 
    			"	\"SysHead\":{\r\n" + 
    			"		\"SvcCd\":\"000000\",\r\n" + 
    			"		\"TxnChnlTp\":\"200\",\r\n" + 
    			"		\"TxnDt\":\"000000\",\r\n" + 
    			"		\"TxnTm\":\"16:14:49\",\r\n" + 
    			"		\"OrigIttAplNo\":\"111\",\r\n" + 
    			"		\"SvcScn\":\"6\"\r\n" + 
    			"	},\r\n" + 
    			"	\"AppHead\":{\r\n" + 
    			"		\"AplTimestamp\":\"2019-05-2416:14:49.000020\",\r\n" + 
    			"	\"LocalHead\":{\r\n" + 
    			"		\"TxnTlrId\":\"9aa90001\",\r\n" + 
    			"		\"OrgId\":\"087190002\",\r\n" + 
    			"	}\r\n" + 
    			"}";

		System.out.println("请求报文:\n" + str);
		str = SocketClient.sendJsonStr(str, Ip, Port);
		System.out.println("响应报文:\n" + str);

		//assertEquals(str, "服务异常");

	}

	
@Test
	public void test2222() {
	/**
	 * 发送json String报文
	 * @param jsonStr
	 */
	public static String sendJsonStr(String jsonStr,String ip,int port){
		
		String str = null;
		
		try{
			
			str = run(jsonStr,ip,port);
		}catch(Throwable t){
			
			t.printStackTrace();
		}
		
		return str;
	}
	
@Test
	public void test3333() {
		TestSendByExcel ts = new TestSendByExcel("20200422", "testcase/",Ip,"22200");
		ts.sendRequestbyPath("testcase/3333.xlsx");
		AssertJUnit.assertTrue(true);
}
}
