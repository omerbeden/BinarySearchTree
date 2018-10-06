package bst;

public class BST {

	private Node root;

	public BST() {
		root = null;
	}

	public void insert(int data) {
		root = insertR(root, data);
	}

	public void search(int data) {
		Node node = searchR(root, data);
		if (node == null) {
			System.out.println("Aranan ("+data+") bulunamadi");
			return;
		}
		System.out.println(node.getData());
	}

	public void inOrder() {
		inOrderR(root);
	}

	public void preOrder() {
		preOrderR(root);
	}

	public void postOrder() {
		postOrderR(root);
	}

	public void minValue() {
		 min(root);
	}

	public void maxValue() {
		 max(root);
	}

	private Node insertR(Node node, int data) {

		if (node == null) {
			node = new Node(data);
			return node;
		}

		if (data < node.getData())
			node.setLeft(insertR(node.getLeft(), data));

		else if (data > node.getData())
			node.setRight(insertR(node.getRight(), data));

		return node;
	}

	private Node searchR(Node node, int data) {

		if (node == null) {
			return null;
		}
		if (node.getData() == data)
			return node;

		if (data < node.getData())
			return searchR(node.getLeft(), data);

		return searchR(node.getRight(), data);
	}

	private void inOrderR(Node node) {
		if (node == null) {
			return;
		}

		inOrderR(node.getLeft());
		System.out.println(node.getData());
		inOrderR(node.getRight());

	}

	private void postOrderR(Node node) {

		if (node == null) {
			return;
		}

		postOrderR(node.getLeft());
		postOrderR(node.getRight());
		System.out.println(node.getData());
	}

	private void preOrderR(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.getData());
		preOrderR(node.getLeft());
		preOrderR(node.getRight());
	}

	private void min(Node node) {

		if (node.getLeft() == null) {
			System.out.println("min value: "+node.getData());
			return;
		}
		min(node.getLeft());
	}

	private void max(Node node) {

		if (node.getRight() == null) {
			System.out.println("max value: "+node.getData());
			return;
		}
		max(node.getRight());

	}
}
