/*
* In this program, we need to calculate the difference between the sum of nodes present at odd levels and sum of nodes present at even levels.
* Suppose, if a tree contains 5 levels, then
* Difference = (L1 + L 3 + L5) - (L2 + L4)  
*       1
*    /       \
*    2       3
*    /       /\
*    4     5    6
* OddLevelSum = 1 + 4 + 5 + 6 = 16   
* EvenLevelSum = 2 + 3 = 5  
* Difference = |16 - 5| = 11  
*/
import java.util.LinkedList;
import java.util.Queue;

public class DiffOddEven{
    // Represent a node of binary tree
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            // Assign datda to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // root of the binary tree
    public Node root;

    public DiffOddEven(){
        root = null;
    }

    // difference() will calculate the differenc ebetween sum of odd and even levels of binary tree
    public int difference(){
        int oddLevel=0, evenLevel = 0, diffOddEven=0;

        // Variable nodeslnLevel keep tracks of number of nodes in each level
        int nodeslnLevel = 0;

        
    }
}