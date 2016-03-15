public class Game{
   private boolean won;
   private Player me;
   private Player other;
   private Deck mainDeck;
   private Card[] active;   
   private Deck meSideDeck;
   private Deck otherSideDeck;

   /**
   Constructor for Game class.
   @param pl1 The current player.
   @param pl2 The current player's opponent.
   @param main The main Deck of Cards.
   */
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

   /**
   Draws from both side decks when no present options.
   */
   public void resetCenter(){
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
   }

   /**
   Determines if the game is over.
   @return 0 if game not over, 1 if pl1 wins, 2 if pl2 wins.
   */
   public int gameOver(){
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