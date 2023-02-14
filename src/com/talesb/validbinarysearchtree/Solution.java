package com.talesb.validbinarysearchtree;

import com.talesb.TreeNode;

public class Solution {

	public boolean isValidBST(TreeNode root) {

		long minValue = Long.MIN_VALUE;
		long maxValue = Long.MAX_VALUE;

		return recursiveValidation(root, minValue, maxValue);

	}

	private static boolean recursiveValidation(TreeNode root, long minValue, long maxValue) {

		if(root==null) {
			return true;
		}
		if(root.val>maxValue||root.val<minValue) {
			return false;
		}
		 return recursiveValidation(root.left, minValue,root.val)&& recursiveValidation(root.right, root.val, maxValue);
	}

}
