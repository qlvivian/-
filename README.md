# 自助式自动化测试平台
Jenkins+TestNg+ExtentReport实现自助式接口测试一条龙
前提：搭建好eclipse、jenkins环境，jdk1.8+jenkins2+testng6.9.10+extentreport3.0.6。extentreport报告展示用的插件较多，可以通过Maven工程下载。

一、Jenkins集成自助式自动化测试平台
这部分主要是web前端的构建，包含权限控制、任务请求和执行的定制化、历史记录查询、email提醒等。
实现过程参照https://www.ibm.com/developerworks/cn/opensource/os-autotesting-jenkins-testing/

二、TestNg自动化测试框架
eclipse下testng框架搭建和它的使用方法网上有大量资料，自己写了几个@test案例：
一、项目管理
点击页面左上角的下拉框可自由切换项目。进入项目中，【数据信息】统计显示项目当前已有的模块数量和接口数量。
 
项目成员可以编辑项目基本信息。在【环境信息】中，点击“+增加”按钮可增加多个环境，每个环境可增加应用并配置不同的应用URL。【头域信息】中可输入接口的公共头域信息
