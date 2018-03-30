package com.main.Practice2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.base.impl.Test;
import com.base.impl.TreeBasic;

@SpringBootApplication
@ComponentScan({"com.base.*"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Test test = ctx.getBean(Test.class);
		
		TreeBasic tree = ctx.getBean(TreeBasic.class);
		tree.display();
	
	}
}
