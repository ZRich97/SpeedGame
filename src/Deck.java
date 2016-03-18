
import java.awt.Image;
import java.util.*;

public class Deck{
   private List<Card> myDeck;
   
   /**
   Constructor for Deck class.
   */
   public Deck(){
      myDeck = new ArrayList<Card>();
   }

   /**
   Adds the base 52 Cards to the Deck.
   @param images The 2d array of Images.
   */
   public void add52(Image[][] images){
      
      String[] suit = { "Spades", "Diamonds", "Clubs", "Hearts" };
      int[] rank = { 14,2,3,4,5,6,7,8,9,10,11,12,13 };
      for(int i = 0; i < suit.length; i++){
         for(int x = 0; x < rank.length; x++){
            myDeck.add(new Card(rank[x],suit[i], images[i][x]));
         }
      }
   }
   /**
   Checks if this Deck is empty.
   @return True if empty, False if full.
   */
   public boolean isEmpty(){
      return (myDeck.isEmpty());
   }

   /**
   Adds the desired Card to the Deck.
   @param input The Card to add to the Deck.
   */
   public void add(Card input){
      myDeck.add(input);
   }

   /**
   Shuffles this Deck.
   */
   public void shuffle(){
      Collections.shuffle(myDeck);
   }

   /**
   Draws a card from the Deck if possible.
   @return The Card that was drawn, or null if no Cards are left.
   */
   public Card draw(){
      if(myDeck.size()!=0){
         return myDeck.remove(size()-1);
      }
      return null;
   }

   /**
   Returns the size of the Deck.
   @return The size of the Deck.
   */
   public int size(){
      return myDeck.size();
   }
}