public class Card extends Object{
   private int value;
   private String suit; 

   public Card(int val, String su){
      suit = su;
      // 2-10 are 2-10
      // Joker == 11
      // Queen == 12
      // King == 13
      // ACE == 14 OR 1 
      value = val;
   } 

   public int value(){
      return value;
   }

   public String suit(){
      return suit;
   }

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