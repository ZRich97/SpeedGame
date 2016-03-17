package SpeedGame;

import java.awt.Image;

public class Card{
   private int value;
   private String suit;
   private Image image;
   int x;
   int y;
   
   /**
   Constructor for Card class.
   @param val The integer value of the card (2-14).
   @param su The "suit" of the card.
   */
   public Card(){
      suit = "";
      value = 0;
      image = null;
      x = 30;
      y = 30;
      
   }
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

   public boolean isValid(){
      if(image != null && suit != "" && value != 0)
         return true;
      return false;
   }
   public void setX(int n){
      x = n;
   }
   public void setY(int n){
      y = n;
   }
   public int getX(){
      return x;
   }
   public int getY(){
      return y;
   }
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
         if((1==(other.value-1))||(14==(other.value+1))){
            return true;
         }      
      }
      return false; 
   }
}