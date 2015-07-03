/*
File name: BinaryTreeTester.java
Test class for BinaryTree and similar method.
 */

package binarytreetester;

public class BinaryTreeTester {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Two binary trees are similar if they are both empty or both nonempty and
     * have similar left and right subtrees. Write a method in Java to decide
     * whether two binary trees are similar.
     *
     * @param tree1
     * @param tree2
     * @return true if the trees are similar, otherwise false
     */
    public static boolean similar(BinaryNode tree1, BinaryNode tree2) {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        if (tree1 == null && tree2 == null) {
            return true;//*********PROPERTY OF ALICIA RODRIGUEZ**********
        } else if (tree1 == null && tree2 != null
                || tree1 != null && tree2 == null) {
            return false;
        } else if (tree1.data.equals(tree2.data)) {//*********PROPERTY OF ALICIA RODRIGUEZ**********
            return similar(tree1.left, tree2.left)
                    && similar(tree1.right, tree2.right);
        } else {
            return false;
        }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Tester of the BinaryTree class.
     * @param args
     */
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        System.out.println("Tree1: ");
        tree1.insert(1);
        tree1.insert(2);
        tree1.insert(3);
        //tree1.insert(4);
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        tree1.printTree();
        System.out.println("Order which it was inserted: 1, 2, 3");

        System.out.println("Tree2: ");
        tree2.insert(1);
        tree2.insert(2);
        tree2.insert(3);
        tree2.insert(4);
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        tree2.printTree();
        System.out.println("Order which it was inserted: 1, 2, 3");
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        System.out.print("Are trees 1 and 2 similar? " + 
                similar(tree1.root, tree2.root) + "\n");
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of BinaryTreeTester class definition
//*********PROPERTY OF ALICIA RODRIGUEZ**********
