import java.util.*;
public class Deck{
   private List<Card> myDeck;

   public Deck(){
      myDeck = new ArrayList<Card>();
   }

   public void add52(){
      String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
      int[] rank = { 2,3,4,5,6,7,8,9,10,11,12,13,14 };
      for(int i = 0; i < suit.length; i++){
         for(int x = 0; x < rank.length; x++){
            myDeck.add(new Card(rank[x],suit[i]));
         }
      }
   }

   public void add(Card input){
      myDeck.add(input);
   }

   public void shuffle(){
      Collections.shuffle(myDeck);
   }

   public Card draw(){
      if(myDeck.size()!=0){
         return myDeck.remove(size()-1);
      }
      return null;
   }

   public int size(){
      return myDeck.size();
   }
}