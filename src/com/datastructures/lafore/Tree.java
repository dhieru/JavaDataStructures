package com.datastructures.lafore;

public class Tree {
	private Node root;
	
	public Node find(int key){
		Node current = root;
		while(current.iData != key){
			if(key <current.iData){
				current = current.leftChild;
			}else {
				current = current.rightChild;
			}
			if (current == null)
				return null;
		}
		return current;
	}
	
	public void insert( int id, double dd){
		Node newNode = new Node();
		newNode.iData = id;
		newNode.fData = dd;
		if(root == null)
			root = newNode;
		else{
			Node current = root;
			
		}
	}
	
	public void delete(int id){
		
	}
}
