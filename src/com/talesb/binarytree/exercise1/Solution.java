package com.talesb.binarytree.exercise1;

import com.talesb.TreeNode;


//https://www.ime.usp.br/~pf/mac0122-2002/aulas/trees.html

//PT-BR  Escreva uma função recursiva que receba uma árvore binária ab e um número x e remova da árvore todas as folhas que tenham item igual a x.
//EN-US  Write a recursive function that takes a binary tree ab and a number x and removes from the tree all leaves that have value equal to x.

public class Solution {

	public static void main(String[] args) {
	
		TreeNode node5 = new TreeNode(5);
		TreeNode node7 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6,node5,node7);
		TreeNode node9 = new TreeNode(9);
		TreeNode node11 = new TreeNode(11);
		TreeNode node10 = new TreeNode(10,node9,node11);
		
		TreeNode exampleNode = new TreeNode(8,node6,node10);

		removeNodeFromValue(exampleNode, 6);
		
		//Just added to debug purpose
		System.out.println(exampleNode);
		
		
	}
	
	
	public static void removeNodeFromValue(TreeNode node,int value) {
		if(node!= null) {
			if(node.left!= null && node.left.val == value) {
				node.left = null;
			}
			
			if(node.right!= null && node.right.val == value) {
				node.right = null;
			}
			removeNodeFromValue(node.left, value);
			removeNodeFromValue(node.right, value);
		}
	}
	
	
	
	
}
