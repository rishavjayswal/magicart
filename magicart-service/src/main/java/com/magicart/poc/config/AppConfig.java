package com.magicart.poc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.magicart.poc")
public class AppConfig {
	static {
		System.out.println("***AppConfig***");
	}
}
