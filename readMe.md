```url
//PUT方式，暂停服务
http://【eureka服务ip:port】/eureka/apps/【服务名】/【实例名】/status?value=OUT_OF_SERVICE
//DELETE请求，注销服务
http://【eureka服务ip:port】/eureka/apps/【服务名】/【实例名】
//PUT方式，恢复服务
http://【eureka服务ip:port】/eureka/apps/【服务名】/【实例名】/status?value=UP

```