
import java.awt.Image;

public class Card{
   private int value;
   private String suit;
   private Image image;
   int x;
   int y;
   
   /**
   Default constructor for Card class.
   */
   public Card(){
      suit = "";
      value = 0;
      image = null;
      x = 30;
      y = 30;
      
   }
   /**
   In-depth constructor for Card class.
   @param val The integer value of the card (2-14).
   @param su The "suit" of the card.
   @param image The .jpg of the card.
   */
   public Card(int val, String su, Image image){
      suit = su;
      // 2-10 are 2-10
      // Joker == 11
      // Queen == 12
      // King == 13
      // ACE == 14 OR 1 
      value = val;
      this.image = image;
      x = 30;
      y = 30;
      
   } 
   /**
   Checks if the current Card is a valid Card.
   @return True if valid, False if not.
   */
   public boolean isValid(){
      if(image != null && suit != "" && value != 0)
         return true;
      return false;
   }
   /**
   Sets the x offset of Card.
   @param n New X.
   */
   public void setX(int n){
      x = n;
   }
   /**
   Sets the y offset of Card.
   @param n New Y.
   */
   public void setY(int n){
      y = n;
   }
   /**
   Returns the x offset of Card.
   @return the X offset.
   */
   public int getX(){
      return x;
   }
   /**
   Returns the y offset of Card.
   @return the y offset.
   */
   public int getY(){
      return y;
   }
   /**
   Returns the .jpg of Card.
   @return the .jpg.
   */
   public Image getCardImage(){
      
      return image;
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
   Returns a String representation of a Card.
   @return Card's details.
   */
   public String toString(){
      return "Suit="+suit+" Val=" + value;
   }
   /**
   Compares this Card to another Card, and decides whether or not 
   it is a valid placement by Speed rules.
   @param other The Card that this Card will be placed onto.
   @return Whether or not the placement is valid.
   */
   public boolean isValidPlacement(Card other){
      if(other==null){
         return false;
      }
      if((this.value==(other.value-1))||(this.value==(other.value+1))){
         return true;
      }
      if(this.value==2){
          if(other.value==14){
              return true;
           } 
      }
      if(this.value==14){
         if((1==(other.value-1))||(14==(other.value+1))){
            return true;
         }      
      }
      return false; 
   }
}