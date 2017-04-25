package com.yym.test.tree;

/**
 * Created by StickT on 2017/4/18.
 */
public class TreeNode {

    private TreeNode left;

    private TreeNode right;

    private Integer value;

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public TreeNode setValue(Integer value) {
        this.value = value;
        return this;
    }
}
