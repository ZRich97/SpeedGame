package SpeedGame;

import java.util.*;
public class AI extends Player{

   /**
   Constructor for AI class.
   @param my20 The AI's Deck of 20 Cards.
   */
   public Player(Deck my20){
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
   public Card playCard(Card[] center){
      Card chosen = myHand.get(0);
      for(int i = 0; i < 4; i++){
         for(int x = 0; x < 2; x ++){
            if(chosen.isValidPlacement(center[x])){
               myHand.remove(chosen);
               if(personalDeck.size()!=0){
                  Card c = personalDeck.draw();
                  myHand.add(c);
                  c.setX(chosen.getX());
                  return chosen;
               }
            }
         }
         return center;
      }  
   }
}