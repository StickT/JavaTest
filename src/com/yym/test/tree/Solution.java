package com.yym.test.tree;

import java.util.ArrayList;

/**
 * Created by StickT on 2017/4/18.
 */
public class Solution {


    public static void main(String[] args){
        TreeNode node = new TreeNode();
        TreeNode node1 = new TreeNode();
        TreeNode node2 = new TreeNode();
        TreeNode node3 = new TreeNode();
        TreeNode node4 = new TreeNode();
        TreeNode node5 = new TreeNode();
        TreeNode node6 = new TreeNode();
        node.setLeft(node1);
        node.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);
        node.setValue(8);
        node1.setValue(10);
        node2.setValue(5);
        node3.setValue(7);
        node4.setValue(9);
        node5.setValue(4);
        node6.setValue(2);
        ArrayList<Integer> result = printFromTopToBottom(node);
        result.stream().forEach(x-> System.out.print(x.toString()+"  "));
    }

    /**
     * 从上到下，从左到右依次遍历二叉树的每个节点
     * @param root
     * @return
     */
    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<TreeNode> treeList = new ArrayList<>();
        if(root == null){
            return intList;
        }
        treeList.add(root);
        for(int i = 0;i < treeList.size();i++){
            TreeNode node =  treeList.get(i);
            if(node.getLeft() != null){
                treeList.add(node.getLeft());
            }
            if(node.getRight() != null){
                treeList.add(node.getRight());
            }
            intList.add(node.getValue());
        }
        return intList;
    }
}
