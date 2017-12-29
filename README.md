# dubbo-demo2
dubbo-demo2

```
以最简单的方式编写了 dubbo 的示例
并结合了 SSM 框架

api       项目：  包含api 和 model  ，方便起见结合到了一起，配置文件里包含初始化sql
provider  项目：  以tomcat 的方式暴露服务
provider2 项目：  以jar包 的方式暴露服务
consumer  项目：  服务消费方

数据库初始化完毕之后，修改对应的配置文件   
jdbc.properties
各种xml
启动好了之后 访问接口   localhost:8080/dubbo/test?name=a
```
