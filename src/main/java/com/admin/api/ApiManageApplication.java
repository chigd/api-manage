package com.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


@SpringBootApplication
@Configuration
public class ApiManageApplication {
	@Bean
	public ServletRegistrationBean apiV1ServletBean(WebApplicationContext wac) {
		DispatcherServlet ds = new DispatcherServlet(wac);
		ServletRegistrationBean bean = new ServletRegistrationBean(ds, "/api/v1/*");
		bean.setName("api-v1");
		return bean;
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiManageApplication.class, args);
	}

}
