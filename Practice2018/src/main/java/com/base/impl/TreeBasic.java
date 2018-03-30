package com.base.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.base.Tree;
import com.base.TreeMain;


@Service
public class TreeBasic implements TreeMain {

	@Autowired
	Tree root;
	
	@Override
	public void createTree() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(root.num);
	}

	
	public void constructiveMethod() {
		//New message
		
	}
	
}
