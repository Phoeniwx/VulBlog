## 原项目简介
V部落是一个多用户博客管理平台，采用Vue+SpringBoot开发。  

[项目地址](https://github.com/lenve/VBlog)  

## 运行方法

1.进入blogserver项目，mvn编译

```
mvn clean && mvn compile
```  

2.启动tomcat
```
tomstart
```


**OK，至此，服务端就启动成功了，此时我们直接在地址栏输入```http://localhost:8081/index.html```即可访问我们的项目。**  

## 部署细节
1. 在65机器新建sw用户部署
2. 使用docker部署mysql，端口55777，数据库vblogdb，用户vblog
3. 使用tomcat部署web，通过alias（tomstart, tomstop）控制

## 项目依赖  

1.[vue-echarts](https://github.com/Justineo/vue-echarts)  
2.[mavonEditor](https://github.com/hinesboy/mavonEditor)  


