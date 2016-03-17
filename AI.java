package SpeedGame;

import java.util.*;
public class AI extends Player{
   

   /**
   Constructor for AI class.
   @param my20 The AI's Deck of 20 Cards.
   */
   public AI(Deck my20){
      super(my20);
   }

   public Deck getDeck(){
      return super.getDeck();
   }

   public List<Card> getHand(){
      return super.getHand();
   }
   /**
   Is called when the AI attempts to play a card.
   @param chosen The Card that is played.
   @param center The Card that is currently in the field.
   */
   public Card playCard(Card center){
      
      for(int i = 0; i < 5; i++){
            Card chosen = super.getHand().get(i);
            if(chosen.isValidPlacement(center)){
               super.getHand().remove(chosen);
               if(super.getDeck().size()!=0){
                  Card c = super.getDeck().draw();
                  super.getHand().add(c);
                  c.setX(chosen.getX());
                  return chosen;
               }
            }
         }
         return center;
      
   }
}