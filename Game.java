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
      System.out.println(mainDeck.size());
   }

   public void resetCenter(){
      // Draws from both side decks when no present options 
      active[0]=mainDeck.draw();
      active[1]=mainDeck.draw();
   }

}