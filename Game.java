public class Game{
   private boolean won;
   private Player p1;
   private Player p2;
   private Deck mainDeck;
   private Card[] active;   
   private Deck p1SideDeck;
   private Deck p2SideDeck;

   public Game(Player pl1, Player pl2, Deck main){
      p1 = pl1;
      p2 = pl2;
      mainDeck = main;
      active = new Card[2];
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
      p1SideDeck = new Deck();
      p2SideDeck = new Deck();
      for(int i = 0; i < 6; i++){
         p1SideDeck.add(mainDeck.draw());
         p2SideDeck.add(mainDeck.draw());
      }
   }

   public void resetCenter(){
      // Draws from both side decks when no present options 
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
   }

   public static void main(String[] args){
      // Setting up the main deck with 52 cards
      Deck mDeck = new Deck();
      mDeck.add52();
      mDeck.shuffle();

      // Making both player decks with 20 cards
      // Makes main deck 12 cards
      Deck p1Side = new Deck();
      Deck p2Side = new Deck();

      for(int i = 0; i < 20; i++){
         p1Side.add(mDeck.draw());
         p2Side.add(mDeck.draw());
      }

      // Initializing two players and main deck
      Player player1 = new Player(p1Side);
      Player player2 = new Player(p2Side);
      Game myGame = new Game(player1, player2, mDeck);
   }

}