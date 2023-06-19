package com.sam.employee;

import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.cors.CorsConfiguration;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

		@Bean
		public CorsFilter corsFilter(){
			CorsConfiguration corsConfiguration=new CorsConfiguration();
			corsConfiguration.setAllowCredentials(true);
			corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
			corsConfiguration.setAllowedHeaders("*");
		}
	}

}
