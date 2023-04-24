package com.greatlearning.bst;

import java.util.HashMap;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {

		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree {

	Node root = null;
	static int val1 = Integer.MIN_VALUE, val2 = Integer.MIN_VALUE;
	HashMap<Integer, Integer> map = new HashMap<>();

	private void findSumPair(Node root, int sum) {

		if (root == null)
			return;

		//Check if the map already contains the value
		if (map.containsKey(root.data)) {
			val1 = map.get(root.data);
			val2 = root.data;
			return;

		} else {
			//Add sum-value and value pair to map
			map.put(sum - root.data, root.data);
		}

		findSumPair(root.left, sum);
		findSumPair(root.right, sum);

	}

	private void insert(int val) {
		root = insert(root, val);
	}

	private Node insert(Node node, int val) {
		if (node == null) {
			// root node
			return new Node(val);
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		}
		if (val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);

		int sum = 130;
		tree.findSumPair(tree.root, sum);

		if (val1 != Integer.MIN_VALUE && val2 != Integer.MIN_VALUE)
			System.out.println("Pair is (" + val1 + "," + val2 + ")");
		else
			System.out.println("Nodes are not found.");
	}
}
