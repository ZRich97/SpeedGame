public class Game{
   private boolean won;
   Player p1;
   Player p2;
   Deck mainDeck;
   Card[] active;

   public Game(Player pl1, Player pl2, Deck main){
      p1 = pl1;
      p2 = pl2;
      mainDeck = main;
      active = new Card[2];
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
   }

   public Card[] center(){
      
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

      Player player1 = new Player(p1Side);
      Player player2 = new Player(p2Side);

      Game myGame = new Game(player1, player2, mDeck);

   }




}