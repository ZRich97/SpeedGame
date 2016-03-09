import java.util.*;
public class Player{
   List<Card> myHand;
   Deck personalDeck;

   public Player(Deck my20){
      myHand = new ArrayList<Card>();
      personalDeck = my20;
      for(int i = 0; i < 5; i++){
         myHand.add(personalDeck.draw());
      }
   }

   public Card playCard(Card chosen, Card center){
      if(chosen.isValidPlacement(center)){
         myHand.remove(chosen);
         if(personalDeck.size()!=0){
            myHand.add(personalDeck.draw());
         }
      }
      return null;
   }
}