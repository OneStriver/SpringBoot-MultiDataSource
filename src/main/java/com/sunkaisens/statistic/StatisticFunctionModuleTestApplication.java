package com.sunkaisens.statistic;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import com.sunkaisens.statistic.configuration.DynamicDataSourceRegister;

@ServletComponentScan
@SpringBootApplication
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class StatisticFunctionModuleTestApplication implements CommandLineRunner {

	@Autowired
    DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(StatisticFunctionModuleTestApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		System.out.println("DATASOURCE = " + dataSource);
	}
}
