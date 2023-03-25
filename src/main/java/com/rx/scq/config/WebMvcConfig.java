package com.rx.scq.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;


@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
//    @Value("${uploadPath}")
//    private String uploadPath;
//
//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//            "classpath:/META-INF/resources/", "classpath:/resources/",
//            "classpath:/static/", "classpath:/public/" };
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("doc.html").addResourceLocations(
////                "classpath:/META-INF/resources/");
////        registry.addResourceHandler("/webjars/**").addResourceLocations(
////                "classpath:/META-INF/resources/webjars/");
//
//        if (!registry.hasMappingForPattern("/webjars/**")) {
//            registry.addResourceHandler("/webjars/**").addResourceLocations(
//                    "classpath:/META-INF/resources/webjars/");
//        }
//        if (!registry.hasMappingForPattern("/**")) {
//            registry.addResourceHandler("/**").addResourceLocations(
//                    CLASSPATH_RESOURCE_LOCATIONS);
//        }
//        ApplicationHome h = new ApplicationHome(getClass());
//        File jarF = h.getSource();
//        //在jar包所在目录下生成一个upload文件夹用来存储上传的图片
//        String savePath = jarF.getParentFile().toString() + "/" + uploadPath + "/";
//        String htmlPath = jarF.getParentFile().toString() + "/html/";
//        registry.addResourceHandler("/" + uploadPath + "/**")
//                .addResourceLocations("file:/" + savePath);
//        registry.addResourceHandler("/html/**")
//                .addResourceLocations("file:/" + htmlPath);
//        super.addResourceHandlers(registry);
//        //配置server虚拟路径，handler为页面中访问的目录，locations为files相对应的本地路径
//    }


    /**
     * 解决跨域问题
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }
}