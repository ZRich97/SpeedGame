
import java.util.*;
public class AI extends Player{
   

   /**
   Constructor for AI class.
   @param my20 The AI's Deck of 20 Cards.
   */
   public AI(Deck my20){
      super(my20);
   }
   /**
   Access Deck.
   @return The AI's Deck of 20 Cards.
   */
   public Deck getDeck(){
      return super.getDeck();
   }
   /**
   Access Hand.
   @return The AI's Hand.
   */
   public List<Card> getHand(){
      return super.getHand();
   }
   /**
   Is called when the AI attempts to play a card.
   @param center The Card that is currently in the field.
   @return the Card that results.
   */
   public Card playCard(Card center){
      try{
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
      }
      catch(IndexOutOfBoundsException e){};
      return center;
      
   }
}