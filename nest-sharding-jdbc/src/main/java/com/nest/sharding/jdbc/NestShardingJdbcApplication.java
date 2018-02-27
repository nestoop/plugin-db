package com.nest.sharding.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 数据库分库组件-shardingjdbc
 * @author botter
 */
@SpringBootApplication
public class NestShardingJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NestShardingJdbcApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("ShardingJdbc Application started....");
	}
}
