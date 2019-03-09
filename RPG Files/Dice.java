package rpg;

import java.util.Random;

public class Dice {
private Random r;
  
//instantiate object for r
public Dice(){
     r = new Random();
  }
  
  public int Roll(){
  return r.nextInt(6)+1;
  }
}
