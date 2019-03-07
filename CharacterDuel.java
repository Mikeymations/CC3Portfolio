package rpg;
import java.util.Scanner;
public class CharacterDuel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Character Player1 = new Character("Kagume ", 5, 7, 9) {};
        Wizard Player2 = new Wizard("Inuyasha ", 5, 7, 9);
       
        int round = 1;
        int damage;
        int lightningBolt;
         
        System.out.println("Character Duel: Kagume vs. Kikyo ");
        System.out.println(" ");
        
        while (Player1.getCurrentLife() >= 0 && Player2.getCurrentLife() >= 0){

            System.out.println("Round " +round);
            System.out.println(Player1.getName() + ":" + Player1.getCurrentLife());
            System.out.println(Player2.getName() + ":" + Player2.getCurrentLife());
            if(Player1.getCurrentLife() >0 && Player2.getCurrentLife() >0 ){
            damage= Player1.attack();
            System.out.println(Player1.getName() + " attacked the one she loved " + Player2.getName() +" " + damage);
            Player2.wound(damage);
            }
            if(Player2.getCurrentLife()>0 && Player1.getCurrentLife() >0){
            lightningBolt= Player2.castLightningBolt();
            System.out.println(Player2.getName() + " cast lightningbolt to " + Player1.getName() + " " + lightningBolt);
            Player1.wound(lightningBolt);
  
            }       
         round++; 
        }
            System.out.println("Final Life ");
            System.out.println(Player1.getName()+":" + Player1.getCurrentLife());
            System.out.println(Player2.getName()+":" + Player2.getCurrentLife());
  
           if(Player1.getCurrentLife() < Player2.getCurrentLife()){
            System.out.println(Player2.getName() + " WINS!");
           }else if(Player2.getCurrentLife() < Player1.getCurrentLife()){
            System.out.println(Player1.getName() + " WINS! ");
           }else if(Player1.getCurrentLife() <= 0 && Player2.getCurrentLife() <= 0){
            System.out.println("DRAW! ");}       
          //}else if(Player1.getCurrentLife() < Player1getCurrentLife()){
          //     System.out.println(Player1.getName() + " WINS! ");
        }
}




