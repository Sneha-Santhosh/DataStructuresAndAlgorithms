package exercise1;
import java.util.*;
import java.lang.Object;



public class LinkedBinaryTreeDemo
{
   // start main method
   public static void main(String[] args)
   {
       // create an object for LinkedBinaryTree class
       LinkedBinaryTree<Integer> T = new LinkedBinaryTree<Integer>();
      
       // add several elements to the binary tree T
       Position<Integer> p1 = T.addRoot(45);
       Position<Integer> p2 = T.addLeft(p1, 35);
       Position<Integer> p3 = T.addLeft(p2, 25);      
       Position<Integer> p4 = T.addRight(p1, 55);
       Position<Integer> p5 = T.addRight(p2, 40);      
       Position<Integer> p6 = T.addLeft(p4, 50);
       Position<Integer> p7 = T.addLeft(p5, 38);
       Position<Integer> p8 = T.addRight(p7, 39);
       Position<Integer> p9 = T.addRight(p5, 42);
       Position<Integer> p10 = T.addRight(p9, 44);
       Position<Integer> p11 = T.addRight(p4, 60);
       Position<Integer> p12 = T.addRight(p11, 63);
              
       
       System.out.println("Element of node p4: " + p4.getElement());
       System.out.println("\nHeight of node p4: " + T.height(p4));
             
   
       System.out.print("Inorder traversal of T: ");
       Iterable<Position<Integer>> itr2 = T.preorder();  
       // display the position visited after each element in a preorder traversal of T
       for(Position<Integer> p : itr2)
       {
           Position<Integer> result = T.preorderNext(p);
           if(result == null)
               System.out.println("preorderNext(" + p.getElement() + "): null");
           else
               System.out.println("preorderNext(" + p.getElement() + "): " + result.getElement());
       }
       System.out.println();
      
       // display the inorder traversal of T
       System.out.print("Inorder traversal of T: ");
       Iterable<Position<Integer>> itr1 = T.inorder();      
       for(Position<Integer> p : itr1)
           System.out.print(p.getElement() + " ");
       System.out.println();
      
       // display the position visited after each element in a inorder traversal of T
       for(Position<Integer> p : itr1)
       {  
           Position<Integer> result = T.inorderNext(p);
           if(result == null)
               System.out.println("inorderNext(" + p.getElement() + "): null");
           else
               System.out.println("inorderNext(" + p.getElement() + "): " + result.getElement());
       }
       System.out.println();      
      
       // display the postorder traversal of T
       System.out.print("Postorder traversal of T: ");
       Iterable<Position<Integer>> itr3 = T.postorder();  
       for(Position<Integer> p : itr3)
           System.out.print(p.getElement() + " ");
       System.out.println();
      
       // display the position visited after each element in a postorder traversal of T
       for(Position<Integer> p : itr3)
       {
           Position<Integer> result = T.postorderNext(p);
           if(result == null)
               System.out.println("postorderNext(" + p.getElement() + "): null");
           else
               System.out.println("postorderNext(" + p.getElement() + "): " + result.getElement());
       }
       System.out.println();
   } // end of main method
} 
