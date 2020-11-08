package com.example.demo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 每次应用的时候，记得修改扫描的包即可
 * 相当于写了spring-beans.xml 每次记得修改扫描的包
 * <context:component-scan base-package=“com.bawei.usersys.mapper" />
 * <bean id="paginationInterceptor" class="com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor"></bean>
 */
@EnableTransactionManagement //开启事务
@Configuration
@MapperScan("com.example.demo.dao")
public class PerSysBatisPlusConfig {

    /**
     * 加入bean注解即可
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
}
