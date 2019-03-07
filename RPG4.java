package rpg4;
import java.util.Scanner;
public class RPG4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Dice dicc = new Dice();
     
    Character p1 = new Character("Al Ryan", 5,15,20);
    Character p2 = new Character("Jervin", 5,15,20);

  
    for(int i = 1; p1.getCurrentLife() >= 0 && p2.getCurrentLife() >= 0; i++){
        
        System.out.println();
        System.out.println("Round: " + i);
        System.out.println(p1.getName() + ":" + p1.getCurrentLife());
        System.out.println(p2.getName() + ":" + p2.getCurrentLife());  
        
        System.out.println("Heal[0]/Attack[1]");
        int decide = sc.nextInt();
        int heal = 0;
        int damage = 0;
        if(decide == 0){
            heal = dicc.Roll()*p1.getIntelligence();
            p1.heal(heal);
        }
        else if(decide ==1){
        
        int a = p1.attack();
        p2.wound(a);
        int b = p2.attack();
        p1.wound(b);
    
        System.out.println(p1.getName() + " attacks " + p2.getName() + " for " + a);
        System.out.println(p2.getName() + " attacks " + p1.getName() + " for " + b);
    
        }
        if(p1.getCurrentLife() <= 0 && p2.getCurrentLife() <= 0){
            
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println("");
            System.out.println("Draw");
            break;
            
        }
        
        else if(p1.getCurrentLife() <= 0){
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println("");
            System.out.println(p2.getName() + " Wins");
            break;
        }
        
        else if(p2.getCurrentLife() <= 0){
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife()); 
            System.out.println("");
            System.out.println(p1.getName() + " Wins");
            break;
        }
        
        
    }
    
    }
}