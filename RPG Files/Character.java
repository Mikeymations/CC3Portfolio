package rpg;
    
import rpg.TestCharacter;


public class Character {
    Dice dice = new Dice();
    private int strength;
    private int dexterity;
    private int intelligence;
    private String name;
    
    int maxLife;
    int currentLife;

    public Character(String n, int s, int d, int i) {
    name = n;
    strength = s;
    dexterity = d;
    intelligence = i;
    maxLife = dice.Roll()* 5;
    currentLife = maxLife;
}

   
    public int attack(){
    return dice.Roll()* this.strength;   
  
     /**
     *
     * @return attack
     */
    }
    public void wound(int damage) {
    this.currentLife -= damage;
    
    /**
     *
     * @param damage
     */
}

   
    public void heal(int heal) {
     this.currentLife += heal;
  
        
     ;
     /**
     *
     * @param heal
     */
    }
    

   
    public String getName() {
    return name;
     /**
     *
     * @return Name
     */
    }

    
    public int getStrength() {
    return strength;
    /**
     *
     * @return Strength
     */
    }

    /**
     *
     * @return Dexterity
     */
    public int getDexterity() {
    return dexterity;
    }

  
    public int getIntelligence() {
    return intelligence;
      /**
     *
     * @return Intelligence
     */
    }

    public int getCurrentLife() {
    return currentLife;
    /**
     *
     * @return CurrentLife
     */
    }

    
    public int getMaxLife() {
    return maxLife;
    /**
     *
     * @return MaxLife
     */
    }

   
    
}
