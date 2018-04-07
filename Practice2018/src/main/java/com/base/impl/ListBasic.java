package com.base.impl;

import com.base.SList;

public class ListBasic {

	// Inserting at end
	public SList insert(SList head, int num) {
		SList node = new SList(num);

		if (head == null) {
			head = node;
			return head;
		} else {
			SList temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		return head;
	}

	public SList reverseList(SList head) {

		if (head == null) {
			return head;
		}

		SList temp = null, nextNode;


		while (head != null) {
			nextNode = head.next;
			head.next = temp;
			temp = head;
			head = nextNode;

		}

		return temp;
	}

	public void displayList(SList node) {

		if (node == null) {
			System.out.println("List is empty");
			return;
		}

		while (node != null) {
			System.out.print(node.num + "  ");
			node = node.next;
		}

		System.out.println();
	}

}
