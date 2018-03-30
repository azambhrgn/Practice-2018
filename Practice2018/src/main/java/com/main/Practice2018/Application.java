package com.main.Practice2018;

import org.springframework.context.annotation.ComponentScan;

import com.base.Tree;
import com.base.impl.TreeBasic;

public class Application {

	static TreeBasic tree = new TreeBasic();

	public static void main(String[] args) {
		//ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("Hello");
		Tree root = tree.insert(null, 10);
		root = tree.insert(root, 5);
		root = tree.insert(root, 15);
		root = tree.insert(root, 20);

		tree.display(root);
	}
}
