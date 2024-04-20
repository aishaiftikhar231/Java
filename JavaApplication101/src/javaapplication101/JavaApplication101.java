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
public class JavaApplication101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinaryTree tree = new BinaryTree();

        // Inserting elements into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Printing the inorder traversal of the binary tree
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();
    }
    
}
