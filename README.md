# 自助式自动化测试平台
Jenkins+TestNg+ExtentReport实现自助式接口测试一条龙
前提：搭建好eclipse、jenkins环境，jdk1.8+jenkins2+testng6.9.10+extentreport3.0.6。extentreport报告展示用的插件较多，可以通过Maven工程下载。

一、Jenkins集成自助式自动化测试平台
这部分主要是web前端的构建，包含权限控制、任务请求和执行的定制化、历史记录查询、email提醒等。
实现过程参照https://www.ibm.com/developerworks/cn/opensource/os-autotesting-jenkins-testing/

二、TestNg自动化测试框架
eclipse下testng框架搭建和它的使用方法网上有大量资料，自己写了几个@test案例：

