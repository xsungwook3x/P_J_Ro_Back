package com.ugi.PJRO;

import com.ugi.PJRO.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class PjroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjroApplication.class, args);
	}

}
