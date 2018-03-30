package com.main.Practice2018;

import org.springframework.context.annotation.ComponentScan;

import com.base.Tree;
import com.base.impl.TreeBasic;

public class Application {

	static TreeBasic tree = new TreeBasic();

	public static void main(String[] args) {
		//ApplicationContext ctx = SpringApplication.run(Application.class, args);

		Tree root = tree.insert(null, 10);
		root = tree.insert(root, 15);
		root = tree.insert(root, 25);
		root = tree.insert(root, 20);
		root = tree.insert(root, 8);
		root = tree.insert(root, 5);
		root = tree.insert(root, 30);

		/*
		 * Choice for ordering
		 * 1- PreOrder
		 * 2- PostOrder
		 * 3- Inorder
		*/
		//tree.display(root,1);
		System.out.println("*************************");
		/*tree.display(root,2);
		System.out.println("*************************");
		tree.display(root,3);*/
		
		
		//height of the tree
		System.out.println("Height " + tree.height(root));
		
		System.out.println("#############");
		tree.levelOrder(root);
		
		System.out.println("****K distance from root**");
		tree.kDistancefromRoot(root, 2);
		
		System.out.println("****Get Level of given node*");
		int num = 30;
		int l = tree.getLevelOfNode(root, num, 0);
		System.out.println((l == 0 && root.num != num) ? "Not found" : l);

		System.out.println("******print ancestor of node****");
		tree.printAncestor(root, num);
	}
}