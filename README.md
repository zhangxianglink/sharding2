**分库分表运行成功，但是LocalDateTime转换异常**
**方案1：根据issues，把mybatis版本降级，转换成功**
https://github.com/alibaba/druid/issues/3230
**方案2：自定义TypeHandler**
https://blog.csdn.net/weixin_41286148/article/details/106605943
https://blog.csdn.net/qq_37450508/article/details/113619913
https://blog.csdn.net/weixin_43356458/article/details/108101896