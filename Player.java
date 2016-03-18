package SpeedGame;

import java.util.*;
public class Player{
   private List<Card> myHand;
   private Deck personalDeck;

   /**
   Constructor for Player class.
   @param my20 The Player's Deck of 20 Cards.
   */
   public Player(Deck my20){
      myHand = new ArrayList<Card>();
      personalDeck = my20;
      for(int i = 0; i < 5; i++){
         Card c = personalDeck.draw();
         myHand.add(c);
         c.setX(c.getX() + i*90);
         
      }
   }
   /**
   Draws a Card if possible.
   */
   public void draw(){
      if(personalDeck.size()!=0){
         Card c = personalDeck.draw();
         myHand.add(c);
         //c.setX(chosen.getX());
      }
   }
   /**
   Returns the Player's deck.
   @return The Player's deck.
   */
   public Deck getDeck(){
      return personalDeck;
   }
   /**
   Returns the Player's hand.
   @return The Player's hand.
   */
   public List<Card> getHand(){
      return myHand;
   }
   /**
   Is called when the Player attempts to play a card.
   @param chosen The Card that is played.
   @param center The Card that is currently in the field.
   */
   public Card playCard(Card chosen, Card center){
      if(chosen.isValidPlacement(center)){
         myHand.remove(chosen);
         
            return chosen;
         
      }
      return center;
      
   }
}