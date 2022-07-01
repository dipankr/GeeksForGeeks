package com.graph.tree;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class MaxDepthNaryTree {
    public static int maxDepth(Node root){
        int maxD = 0;

        return maxD;
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14};
        Node root = new Node();
        root.val = input[0];
        Node currParent = new Node();
        for(int i=1; i<input.length; i++){
            if(input[i]==null){
                continue;
            }

        }

        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);
    }
}
