package rpg.pkg1j.Character;

/**
 *
 * @author m304user
 */
import rpg.pkg1j.Item.Armor;
import rpg.pkg1j.Item.Dice;
import rpg.pkg1j.Item.Weapon;

/**
* The Wizard class extends Character, adding two new instance
* variables: maxmagic, and currentmagic, as well as the
* castLightningBolt() and castHeal() methods, which represent
* casting magic spells.
*/
public class Wizard extends Character implements Weapon, Armor{
    
    /** instance variables */
    Dice dice = new Dice();    
    private int maxMagic = 25 + intelligence;
    private int currentMagic = maxMagic;
    
     /**
    * The Wizard(String,int,int,int) constructor overrides the
    * constructor with the same signature in Character. It first
    * calls that constructor using the super keyword, then
    * initializes maxmagic to a value, and sets currentmagic to
    * the same value, similar to lifepoints.
     * @param name passes the Name of the character 
     * @param str passes strength attribute 
     * @param intel passes intelligence attribute
     * @param dex   passes dexterity attribute
    */
    public Wizard(String name, int str, int dex, int intel){
        super(name, str, dex, intel);
    
    }
    
    /**
    * castLightningBolt() represents casting a magic spell. The
    * method first checks that currentmagic is greater than/equal
    * to 5. If it is, currentmagic is reduced by 5 and a random
    * number is returned using the dice inherited from Character,
    * modified by the character's intelligence.
    * Otherwise, returns 0.
     * @param roll
     * @return 
    */
    
    public int castLightningBolt(int roll) {
        if(currentMagic >= 5){
            currentMagic = currentMagic - 5;
            return roll + super.intelligence;
        }
        else 
            return 0;
    }
    
    /**
    * castHeal() represents casting a magic spell. The method first
    * checks that currentmagic is greater than/equal to 8. If it
    * is, currentmagic is reduced by 8 and the character's heal()
    * method is called with a random number, modified by the
    * character's intelligence score. The amount healed is also
    * returned by the method.
     * @param roll
     * @return 
    */
    
     public int castHeal(int roll){
         if(currentMagic >= 8 && currentLife < maxLife){
             currentMagic -= 8;
            return useArmor(roll) + intelligence;
         }else if(currentMagic < 8){
             System.out.println("\t---no Mana---");
             return 0;
         }else {
             currentMagic -= 8;
            return 0;}
     }
     
     
     /**
     * Returns maxmagic
     * @return 
     */
     public int getCurrentMagic(){
         return currentMagic;
     }
     
     
     /**
      * 
      * @return maxmagic
      */
     public int getMaxmagic(){
         return maxMagic;
     }
     
     /**
      * 
      * @param roll pass a random number
      * @return the roll parameter modified by strength
      */
    @Override
    public int useWeapon(int roll) {
        return roll + strength;
    }
    
    /**
     * 
     * @param roll pass a random number
     * @return roll parameter modified by strength
     */
    @Override
    public int useArmor(int roll) {
        
       return roll + strength;
    }
    
    /**
     * 
     * @param attack 
     * @return useWeapon method that passes attack parameter
     */
    @Override
    public int attack(int attack) {
       return useWeapon(attack);
    }
     
     
    }
    
