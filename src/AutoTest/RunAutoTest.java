package AutoTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.Date;
import java.io.IOException;
import java.text.*;

import swing.TestSendByExcel;


public class RunAutoTest {
	public static void main(String[] args) {
		WriteTestngXml writexmlfiles = new WriteTestngXml();
		try {
			writexmlfiles.CreateTestngXml();
		} catch (IOException e) {
			System.out.println("生成XML文件失败");
		}
		System.out.println("Create testng.xml......");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("./testng.xml");

        //suites.add(".\\test-output\\testng-failed.xml");

        testNG.setTestSuites(suites);
        testNG.run();
	}
}
