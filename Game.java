public class Game{
   private boolean won;
   private Player me;
   private Player other;
   private Deck mainDeck;
   private Card[] active;   
   private Deck meSideDeck;
   private Deck otherSideDeck;

   public Game(Player pl1, Player pl2, Deck main){
      me = pl1;
      other = pl2;
      mainDeck = main;
      active = new Card[2];
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
      meSideDeck = new Deck();
      otherSideDeck = new Deck();
      for(int i = 0; i < 6; i++){
         meSideDeck.add(mainDeck.draw());
         otherSideDeck.add(mainDeck.draw());
      }
      System.out.println(mainDeck.size());
   }

   public void resetCenter(){
      // Draws from both side decks when no present options 
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
   }

   public int gameOver(){
      // Returns 0 if game not over
      // Returns 1 if I win
      // Returns 2 if other wins
      if(meSideDeck.size()!=0&&otherSideDeck.size()!=0){
         return 0;
      }
      else if(meSideDeck.size()==0){
         return 1;
      }
      else if(otherSideDeck.size()==0){
         return 1;
      }
      return 0;
   }

}