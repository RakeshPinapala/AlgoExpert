package com.learning.algoExpert.trees.easy;

public class ClosestValueInBST {

	public static void main(String[] args) {

	}
	
	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	}
	    
    public static int findClosestValueInBst(BST tree, int target) {
    	return traverseInOrder(tree,target,Math.abs(target-tree.value),tree);
      }
    
    private static int traverseInOrder(BST tree, int target,int minDiff, BST minNode) {
    	int currDiff = minDiff;
    	if(Math.abs(target-tree.value) < minDiff) {
    		currDiff = Math.abs(target-tree.value);
    		minNode = tree;
    	}
    	if(tree.value == target)
    		return target;
    	else if(tree.right != null && tree.value < target) {
    		return traverseInOrder(tree.right,target,currDiff,minNode);
    	} else if(tree.left != null && tree.value > target){
    		return traverseInOrder(tree.left,target,currDiff,minNode);
    	}
    	return minNode.value;
    }

}
