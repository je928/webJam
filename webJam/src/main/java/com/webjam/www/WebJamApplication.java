package com.webjam.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.webjam.www.framework.filter.SiteMeshFilter;


@SpringBootApplication
public class WebJamApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebJamApplication.class, args);
	}
	
	@Bean
    public FilterRegistrationBean siteMeshFilter() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new SiteMeshFilter());
        filter.addUrlPatterns("/*");
        return filter;
    }
	
}
