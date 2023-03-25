package com.rx.scq.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    //不限制每页最多
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //分页单页最大条数，默认500    -1不限制     10000  限制1万
        paginationInterceptor.setLimit(-1);
        return paginationInterceptor;
    }

//    //限制每页最多500
//    @Bean
//    public PaginationInterceptor paginationInterceptor(){
//        return new PaginationInterceptor();
//    }
    
}