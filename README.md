Spring Boot 应用集成Nacos的示例， 主要实现：
- 将数据源的配置移至nacos中进行预加载配置
- 将服务注册进nacos


### 添加依赖

```
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>nacos-config-spring-boot-starter</artifactId>
    <version>0.2.12</version>
</dependency>
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>nacos-discovery-spring-boot-starter</artifactId>
    <version>0.2.12</version>
</dependency>
```

### 配置
配置信息都在application.properties中

参考配置说明: https://github.com/nacos-group/nacos-spring-boot-project/wiki/用户使用文档#配置参数设置


### nacos 配置使用规范

使用规范可以参考： https://blog.csdn.net/czpandy/article/details/120514268
