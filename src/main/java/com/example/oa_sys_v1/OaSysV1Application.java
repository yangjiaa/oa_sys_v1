package com.example.oa_sys_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class OaSysV1Application {

	public static void main(String[] args) {
		SpringApplication.run(OaSysV1Application.class, args);
	}

}
