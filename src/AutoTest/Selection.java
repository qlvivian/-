package AutoTest;
import static org.junit.Assert.*;

import java.util.UUID;
import java.util.Date;
import java.text.*;

import org.junit.Test;

import swing.TestSendByExcel;

import java.nio.charset.Charset;

public class Selection{

	static String Ip = System.getenv("ENVIRONMENT");
	int port = 5023;
	int i = 0;
	static String Testcase = System.getenv("TEST CASE");
//	static String Testcase = "test1111,test2222";
	static String [] casename = Testcase.split(",");
}