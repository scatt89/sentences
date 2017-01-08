package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class SentencesApplication {
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}

	public static void main(String[] args) {
		SpringApplication.run(SentencesApplication.class, args);
	}
}
