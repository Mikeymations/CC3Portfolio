 
package intarray1;

import java.util.*;
public class IntArray1 {
public static int numbers;

    public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);
      int numbers[]= new int[5];
     int value=0;
     for (int i = 0; i < numbers.length; i++)
    {
        System.out.print("Please enter number: ");
        numbers[i] = sc.nextInt();
        
        
    }
         System.out.println("First to Last: "
                 + "\n"+Arrays.toString (numbers));
          System.out.println("Last to First: ");
         for(int counter=numbers.length - 1; counter >= 0;counter--){
             
            System.out.print((numbers[counter])+", ");
         } 
         System.out.println();
     }
    
  
}
     
        
        
        
        
        
    
    

