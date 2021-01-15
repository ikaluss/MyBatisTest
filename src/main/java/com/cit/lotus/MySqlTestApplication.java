package com.cit.lotus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cit.lotus.dao.mapper")
@SpringBootApplication
public class MySqlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlTestApplication.class, args);
	}

}
