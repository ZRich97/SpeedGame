public class Driver{
   public static void main(String[] args){
      // Setting up the main deck with 52 cards
      Deck m = new Deck();
      m.add52();
      m.shuffle();

      // Making both player decks with 20 cards
      // Makes main deck 12 cards
      Deck p1Side = new Deck();
      Deck p2Side = new Deck();

      for(int i = 0; i < 20; i++){
         p1Side.add(m.draw());
         p2Side.add(m.draw());
      }

      // Initializing two players and main deck
      Player player1 = new Player(p1Side);
      Player player2 = new Player(p2Side);
      Game myGame = new Game(player1, player2, m);
   }
}