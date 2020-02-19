package com.caltech.solutions.learning.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
@SpringBootApplication
@EnableResourceServer
@EnableFeignClients
public class PrometheusManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusManagementApplication.class, args);
	}

}
