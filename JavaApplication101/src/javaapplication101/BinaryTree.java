/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication101;

/**
 *
 * @author hp
 */
public class BinaryTree {
    
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    // Method to insert a new node in the binary tree
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in the binary tree
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        // Return the unchanged node pointer
        return root;
    }

    // Method to print the inorder traversal of the binary tree
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of the binary tree
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    

    }