/*
File name: BinaryTree.java
Implementation of a Binary Tree
 */
//*********PROPERTY OF ALICIA RODRIGUEZ**********
package cop3530_a3_3;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class BinaryTree {

    //Instance variable
    BinaryNode root;

    //Constructor
    public BinaryTree() {
        root = null;
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Insert comparable input in the binary tree.
     * @param input
     *///*********PROPERTY OF ALICIA RODRIGUEZ**********
    public void insert(Comparable input) {
        root = insert(input, root);
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Recursively insert a BinaryNode in it's corresponding place. If the node
     * is less than the root, or parent node, then it goes to the left. If the
     * node is greater than the root, or parent node, then it goes to the right.
     * @param input any type of input
     * @param tree binary tree
     * @return the inserted node in it's corresponding place
     */
    private BinaryNode<Comparable> insert(Comparable input,
            BinaryNode<Comparable> tree) {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        if (tree == null) {
            return new BinaryNode<>(input, null, null);
        }
        int compare = input.compareTo(tree.data);
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        if (compare < 0) {
            tree.left = insert(input, tree.left);
        } else if (compare > 0) {
            tree.right = insert(input, tree.right);
        }//*********PROPERTY OF ALICIA RODRIGUEZ**********

        return tree;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Prints the binary tree.
     */
    public void printTree() {
        if (root == null) {
            System.out.println("Empty tree.");
        } else {
            printTree(root);
        }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Recursively print the binary tree.
     * @param tree binary tree
     */
    private void printTree(BinaryNode<Comparable> tree) {
        if (tree != null) {
            printTree(tree.left);
            System.out.println(" " + tree.data);
            printTree(tree.right);
        }
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
//*********PROPERTY OF ALICIA RODRIGUEZ**********
} //end of BinaryTree class definition
//*********PROPERTY OF ALICIA RODRIGUEZ**********
/**
 * BinaryNode class which implements a binary node with left and right pointers.
 * @author Alicia Rodriguez
 * @param <AnyType> AnyType of elements allowed
 */
class BinaryNode<AnyType extends Comparable> {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    //Instance variables
    Comparable data;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    //Constructors   
    BinaryNode(Comparable data, BinaryNode<AnyType> left,
            BinaryNode<AnyType> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    BinaryNode(Comparable data) {
        this(data, null, null);
    }
} //end of BinaryNode class definition
