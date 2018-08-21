

## ssm整合

一，先通过idea创建一个maven 的webapp项目，添加java，resources目录.
![](http://ww1.sinaimg.cn/large/a3d1c1c1ly1fuhbjjktb5j207p088q2w.jpg)

在pom.xml引入所需要的jar包,以及插件（见pom.xml）：复制后记得把mybatis-genereate插件第一次打开注释，使用一次后要注释掉

二，配置web.xml（见web.xml） 
  在resources 目录下建立spring文件夹，在spring文件夹下配置以下项（创建文件的同时填入内容） 
 1. applicationContext-dao.xml                                      建立resources/properties/db.properties, 
 建立resources/mybatis/sqlmapConfig.xml,
 建立reources/mybatis/xml  以后存放mybatis 的xml文件    
 建立com.xx.mapper包，以用来存放mapper接口
 2. applicationContext-service.xml   
     建立com.xx.service包
 3. applicationContext-tx.xml
 4. springmvc.xml，
     建立com.xx.controller包，在web-inf/下建立view文件夹



三，其他：

在resources/mybatis下建立 generatorConfig.xml设置 pom里面mybatis-generator插件的配置文件位置，
![](http://ww1.sinaimg.cn/large/a3d1c1c1ly1fuhbpba9o0j20ca08daao.jpg)
在idea的最右侧点开maven视图，点击mybatis-generator插件，生成内容，注释掉pom里面的这个插件的内容，reimport。

在resources/下建立log4j.properties。
使用maven的tomcat7插件run
 OK!!!


