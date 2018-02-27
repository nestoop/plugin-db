package com.nest.sharding.jdbc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author botter
 */
@Configuration
@MapperScan(basePackages = {"com.nest.model"})
@ImportResource({"classpath*:*-application.xml"})
public class ShardingJdbcConfig {
}
