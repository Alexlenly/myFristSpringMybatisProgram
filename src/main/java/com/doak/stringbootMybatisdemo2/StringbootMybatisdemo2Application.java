package com.doak.stringbootMybatisdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.doak.stringbootMybatisdemo2.mapper")
public class StringbootMybatisdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(StringbootMybatisdemo2Application.class, args);
	}

}
