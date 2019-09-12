/* I will be rolling a dice for 100 times based on that, i will count frequency for each face for example
 at the first attemps let's say the face(1-6) is 2, and after rolling it again 2 pops up again then this program
 will print the frequency for face 2 = 2. lets go */
 
 

import java.util.Random;
public class Dice{
   public static void main(String[] args){
      Random rand = new Random();
      int[] freq = new int[7]; // 0-6 = 7
      
      for(int roll = 1; roll<100; roll++){
       ++freq[1+rand.nextInt(6)]; // [generages random no from 1-6], ++freq = each time a no is hit, it will be pre-incremented
      }
      
      System.out.println("FACE\tFREQUENCY"); // header for table
      
      // loop for the face from 1-6
      
      for(int face = 1; face<freq.length; face++){
         System.out.println(face + "\t" + freq[face]);
      }
      
      
   }
}
