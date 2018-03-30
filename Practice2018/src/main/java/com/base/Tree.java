package com.base;

import org.springframework.stereotype.Component;

@Component
public class Tree {

	public int num;
	public Tree left,right;
	
	public Tree() {
		
	}
	
	public Tree(int num) {
		this.num = num;
	}
	
}
