public class Card{
   private int value;
   private String suit; 

   /**
   Constructor for Card class.
   @param val The integer value of the card (2-14).
   @param su The "suit" of the card.
   */
   public Card(int val, String su){
      suit = su;
      // 2-10 are 2-10
      // Joker == 11
      // Queen == 12
      // King == 13
      // ACE == 14 OR 1 
      value = val;
   } 

   /**
   Returns the integer value of the Card.
   @return The integer value of the card (2-14).
   */
   public int value(){
      return value;
   }

   /**
   Returns the "suit" of the Card.
   @return su The "suit" of the card.
   */
   public String suit(){
      return suit;
   }

   /**
   Compares this Card to another Card, and decides whether or not 
   it is a valid placement by Speed rules.
   @param other The Card that this Card will be placed onto.
   @return su Whether or not the placement is valid.
   */
   public boolean isValidPlacement(Card other){
      if((this.value==(other.value-1))||(this.value==(other.value+1))){
         return true;
      }
      if(this.value==14){
         if((1==(other.value-1))||(1==(other.value+1))){
            return true;
         }      
      }
      return false; 
   }
}