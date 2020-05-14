package com.sxy.ibf.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisMapperConfig
 * @Description:
 * @author sxyzla
 * @date 2020年02月17日 15:00:06
 *
 */
@Configuration
@MapperScan(basePackages = { "com.sxy.ibf.repository.mapper" })
public class MyBatisConfiguration {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
