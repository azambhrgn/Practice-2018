package com.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.base.Tree;

@Configuration
public class BeanConfiguration {

	@Bean
	public Tree registerTree() {
		return new Tree();
	}
	
}
