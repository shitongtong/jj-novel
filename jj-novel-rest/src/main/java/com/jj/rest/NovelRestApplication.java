package com.jj.rest;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shitt7 on 2018/6/29.
 */
@SpringBootApplication
@MapperScan("com.jj.mapper")
public class NovelRestApplication extends WebMvcConfigurerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(NovelRestApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(NovelRestApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        Map<String, Object> defaultMap = new HashMap<>();
        defaultMap.put("spring.profiles.active", "dev");
        app.setDefaultProperties(defaultMap);
        app.run(args);
        LOGGER.debug("容器启动成功!");
    }

    /**
     * 解决跨域问题
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
    }
}
