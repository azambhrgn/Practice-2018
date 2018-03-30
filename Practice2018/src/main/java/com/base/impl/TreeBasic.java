package com.base.impl;

import com.base.Tree;

public class TreeBasic{

	Tree root;

	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}

	public void createTree() {
		// TODO Auto-generated method stub
		if (root == null) {
		}
	}

	public Tree insert(Tree root, int num) {
		// TODO Auto-generated method stub

		if (root == null) {
			Tree temp = new Tree(num);
			return temp;
		} else if (root.num > num) {
			root.left = insert(root.left, num);
		} else {
			root.right = insert(root.right, num);
		}

		return root;
	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public void display(Tree temp) {
		// TODO Auto-generated method stub
		if (temp != null) {
			display(temp.left);
			System.out.println(temp.num);
			display(temp.right);
		}
	}

	public void constructiveMethod() {
		// New message

	}

}
