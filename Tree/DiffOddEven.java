package Tree;
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