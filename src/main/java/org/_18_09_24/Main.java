package org._18_09_24;

public class Main {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        System.out.println(isMirror(node));

    }
    public static boolean isMirror(TreeNode root) {
        if (root == null) return false;

        if (root.left.value == root.right.value) {
            return isNodesMirror(root.left, root.right);
        }
        else return false;
    }
        public static boolean isNodesMirror(TreeNode rightNode,TreeNode leftNode){
        if (rightNode == null && leftNode == null) return true;
        if (rightNode == null || leftNode == null) return false;

        if(rightNode.value == leftNode.value)
        {
            return isNodesMirror(rightNode.left,leftNode.right) && isNodesMirror(rightNode.right,leftNode.left);
        }
        else return false;
    }
}
