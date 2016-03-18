package SpeedGame;

public class Game{
   private boolean won;
   private Player me;
   private AI other;
   private Deck mainDeck;
   private Card[] active;   
   private Deck meSideDeck;
   private Deck otherSideDeck;
   private Deck junk;

   /**
   Constructor for Game class.
   @param pl1 The current player.
   @param pl2 The current player's opponent.
   @param main The main Deck of Cards.
   */
   public Game(Player pl1, AI pl2, Deck main){
      me = pl1;
      other = pl2;
      mainDeck = main;
      active = new Card[2];
      active[0]=mainDeck.draw();
      System.out.println("BUILT"+active[0].toString());
      active[1]=mainDeck.draw();
      System.out.println("BUILT"+active[1].toString());
    
      meSideDeck = new Deck();
      junk = new Deck();
      otherSideDeck = new Deck();
      for(int i = 0; i < 5; i++){
         meSideDeck.add(mainDeck.draw());
         otherSideDeck.add(mainDeck.draw());
      }
      System.out.println(mainDeck.size());
   }
   /**
   Determines whether either Player has options.
   @return True if options are left, False if not.
   */
   public boolean ifOptions(){
      for(int i = 0; i < 4; i++){
         if(me.getHand().get(i).isValidPlacement(active[0]) || me.getHand().get(i).isValidPlacement(active[1])){
            return true;
         }
         if(other.getHand().get(i).isValidPlacement(active[0]) || other.getHand().get(i).isValidPlacement(active[1])){
            return true;
         }
      }
      resetCenter();
      System.out.println("DRAW FROM SIDE DECK");
      return false;
   }

   /**
   Returns the Player.
   @return the Player.
   */
   public Player getPlayer(){
      return me;
   }
   /**
   Returns the AI.
   @return the AI.
   */
   public AI getComputer(){
      return other;
   }
   /**
   Returns the Junk pile.
   @return the Junk pile.
   */
   public Deck getJunk(){
      return junk;
   }
   /**
   Returns the Player's side Deck.
   @return the Player's side Deck.
   */
   public Deck getMeSideDeck(){
      return meSideDeck;
   }
   /**
   Returns the AI's side Deck.
   @return the AI's side Deck.
   */
   public Deck getOtherSideDeck(){
      return otherSideDeck;
   }
   /**
   Returns the active Cards.
   @return the active Cards.
   */
   public Card[] getActive(){
      return active;
   }
   /**
   Sets the indicated center Card to a new Card.
   @return the old Card.
   @param newC the new Card.   
   @param x Center Card's index.   
   */
   public Card setActive(Card newC, int x){
      //junk.add(active[x]);
      Card temp = active[x];
      System.out.println(newC.toString());
      //System.out.println(active[0].toString());
      //System.out.println(active[1].toString());
      //System.out.println(x);
      System.out.println(active[x].toString());
      active[x] = newC;
      System.out.println(active[x].toString());
      
      return temp;
   } 
   
   /**
   Draws from both side decks when no present options.
   */
   public void resetCenter(){
      junk.add(active[0]);
      junk.add(active[1]);
      active[0]= meSideDeck.draw();
      active[1]= otherSideDeck.draw();

   }
   

   /**
   Determines if the game is over.
   @return 0 if game not over, 1 if pl1 wins, 2 if pl2 wins.
   */
   public int gameOver(){
      if(me.getDeck().size()!=0&&other.getDeck().size()!=0){
         return 0;
      }
      else if(me.getDeck().size()==0){
         return 1;
      }
      else if(other.getDeck().size()==0){
         return 2;
      }
      return 0;
   }

}