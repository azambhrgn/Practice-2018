package com.base.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.base.Tree;

public class TreeBasic {

	private static int count;

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

	public void display(Tree root, int ch) {
		switch (ch) {
		case 1:
			preOrderRecur(root);
			break;
		case 2:
			postOrderRecur(root);
			break;
		case 3:
			inOrderRecur(root);
			break;
		default:
			System.out.println("Nothing to print");

		}

	}

	public void levelOrder(Tree root) {
		int h = height(root);

		for (int i = 1; i <= h; i++) {
			displayLevelOrder(root, i);
		}
	}

	public void displayLevelOrder(Tree root, int i) {

		if (root == null) {
			return;
		}

		if (i == 1) {
			System.out.print(root.num + " ");
		} else if (i > 1) {
			displayLevelOrder(root.left, i - 1);
			displayLevelOrder(root.right, i - 1);
			// System.out.println("");
		}
	}

	public int height(Tree root) {

		if (root == null) {
			return 0;
		}

		int l = height(root.left) + 1;
		int r = height(root.right) + 1;

		if (l > r)
			return l;
		else
			return r;
	}

	public void kDistancefromRoot(Tree root, int k) {
		if (root == null) {
			return;
		}

		if (k == 0) {
			System.out.println("At k distance " + root.num);
			return;
		} else {
			kDistancefromRoot(root.left, k - 1);
			kDistancefromRoot(root.right, k - 1);
		}

	}

	public int getLevelOfNode(Tree root, int num, int level) {
		if (root == null) {
			return 0;
		}

		if (num == root.num) {
			return level;
		} else if (root.num > num) {
			return getLevelOfNode(root.left, num, level + 1);
		} else {
			return getLevelOfNode(root.right, num, level + 1);
		}

	}

	private void inOrderRecur(Tree root) {
		if (root != null) {
			inOrderRecur(root.left);
			System.out.println(root.num);
			inOrderRecur(root.right);
		}
	}

	private void postOrderRecur(Tree root) {
		if (root != null) {
			postOrderRecur(root.left);
			postOrderRecur(root.right);
			System.out.println(root.num);
		}

	}

	public void preOrderRecur(Tree root) {

		if (root != null) {
			System.out.println(root.num);
			preOrderRecur(root.left);
			preOrderRecur(root.right);
		}

	}

	/**
	 * @param root
	 * @param num
	 * @return 1 for true , 0 for false
	 */
	public int printAncestor(Tree root, int num ) {
		if(root == null) {
			return 0;
		}
		
		if(root.num == num) {
			return 1;
		}
		
		if(printAncestor(root.left, num) == 1 || printAncestor(root.right, num) == 1) {
			System.out.println(" " + root.num);
			return 1;
		}
		
		return 0;
	}

	public boolean sumTree(Tree root) {
		
		if(root == null || (root.left == null && root.right == null)) {
			return true;
		}
		
		
		
		if(sumTree(root.left) && sumTree(root.right) ) {
			
			int l = (root.left != null) ? root.left.num : 0;
			int r = (root.right != null) ? root.right.num : 0;
			return (root.num == l + r) ? true : false;
		}
		
		return false;
	}
	
	
	public void rootToLeafPath(Tree root,int[] ar,int i) {
		
		if(root == null) {
			return ;
		}
		ar[i++] = root.num;
		if(root.left == null && root.right == null) {
			List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
			list.forEach((k) -> System.out.print(k + " "));
			System.out.println();
			return ;
		}
		
		
		rootToLeafPath(root.left, ar, i);
		rootToLeafPath(root.right, ar, i);
	}
}
