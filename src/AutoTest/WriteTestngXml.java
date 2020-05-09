package AutoTest;
import java.io.File;
import java.io.FileOutputStream;


import java.io.IOException;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class WriteTestngXml {
	
	static String curpath =System.getProperty("user.dir");
	public void  CreateTestngXml() throws IOException{
		//创建Document实例
		Document document = DocumentHelper.createDocument();	
//记录test名称
		String xmltestname="Test";
		//记录class名称
		String xmlclassname="v7AutoTest.AutoTestNG";
		//记录要保存的xml文件位置
		String xmlfilepath=curpath+"/testng.xml";
		System.out.println("xmlfilepath"+xmlfilepath);
//System.out.println(filepath);

		//创建根节点suite，并设置name属性为xmlsuitename

		Element root = document.addElement("suite").addAttribute("name", "Suite");
		root.addAttribute("verbose", "1");
		root.addAttribute("preserve-order", "true");
		Element parameter = root.addElement("parameter");
		parameter.addAttribute("name", "report.config");
		parameter.addAttribute("value", "resources/config/report/extent-config.xml");
//创建节点test，并设置name、verbose属性
		Element test = root.addElement( "test" );		
//控制@Test标识的测试用例执行顺序，默认是false，在节点下面的所有方法的执行顺序是无序的
				//把它设为true以后就能保证在节点下的方法是按照顺序执行的。
		test.addAttribute("preserve-order", "true");
		test.addAttribute("name", "Test");

		
		//创建节点classes，无属性

		Element classes = test.addElement( "classes" );

		//创建节点classs，并设置name属性

		Element classs= classes.addElement( "class" );

		classs.addAttribute("name", "v7AutoTest.v7AutoTestNG");

		//创建节点methods，无属性

		Element methods = classs.addElement( "methods" );

		//创建节点classs，并设置name属性

		for(int i=0;i<Selection.casename.length;i++){

			@SuppressWarnings("unused")

			Element include= methods.addElement( "include" );

			include.addAttribute("name", Selection.casename[i]);

		}
		
		Element listeners = root.addElement( "listeners" );
		Element listener = listeners.addElement( "listener" );
		listener.addAttribute("class-name", "AutoTest.MyExtentTestNgFormatter");
	//设置DocType

			//第一个参数：名称
	
		//第二个参数：PUBLIC URI

			//第三个参数：SYSTEM URI

		document.addDocType("suite", null,"http://testng.org/testng-1.0.dtd");

	       
	//输出格式设置

	        OutputFormat format = OutputFormat.createPrettyPrint();
 
	        format = OutputFormat.createCompactFormat();

	        
//设置输出编码

	        format.setEncoding("UTF-8");

	        
 //创建XML文件

	        XMLWriter writer= new XMLWriter(new OutputStreamWriter(new FileOutputStream(xmlfilepath),format.getEncoding()),format);
 
	        writer.write( document );
 
	        writer.close();

	        document=null;
	        
//记录xml文件路径


	}


/*
public static void main(String[] args) {	
		WriteTestngXml writexmlfiles = new WriteTestngXml();
		try {
			writexmlfiles.CreateTestngXml();
		} catch (IOException e) {
			System.out.println("生成XML文件失败");
		}

		
System.out.println("生成的XML文件如下：");
private Writer=writer;
	if(Writer!= null) {

			System.out.println(createxmlfiles.getxmlpath());

		}

}
*/
}
