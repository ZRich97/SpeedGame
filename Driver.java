package SpeedGame;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.EventListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Driver extends Applet implements MouseListener{
   private JPanel playArea;
   private PlayingArea player1Area, player2Area;
   private NeutralPlayingArea mid;
   private Player player1;
   private Player player2;
   public static final int X_POSITION_1 = 430;
   public static final int X_POSITION_2 = 530;
   public static final int X_POSITION_3 = 630;
   public static final int X_POSITION_4 = 730;
   public static final int X_POSITION_5 = 830;
   public static final int X_POSITION_MID1 = 420;
   public static final int X_POSIITON_MID2 = 520;
   
   
   
   public void init(){
      //Draw Cards
      Image[][] images = new Image[4][13];
      String host = "http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/";
      String url = host+"86px-Poker-sm-211-As.jpg";
      try{
         images[0][0] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-21D-2s.jpg";
         images[0][1] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-21C-3s.jpg";
         images[0][2] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-21B-4s.jpg";
         images[0][3] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-21A-5s.jpg";
         images[0][4] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-219-6s.jpg";
         images[0][5] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-218-7s.jpg";
         images[0][6] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-217-8s.jpg";
         images[0][7] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-216-9s.jpg";
         images[0][8] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-215-Ts.jpg";
         images[0][9] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-214-Js.jpg";
         images[0][10] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-213-Qs.jpg";
         images[0][11] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-212-Ks.jpg";
         images[0][12] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
   
         url = host+"86px-Poker-sm-231-Ad.jpg";
         images[1][0] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-23D-2d.jpg";
         images[1][1] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-23C-3d.jpg";
         images[1][2] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-23B-4d.jpg";
         images[1][3] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-23A-5d.jpg";
         images[1][4] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-239-6d.jpg";
         images[1][5] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-238-7d.jpg";
         images[1][6] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-237-8d.jpg";
         images[1][7] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-236-9d.jpg";
         images[1][8] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-235-Td.jpg";
         images[1][9] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-234-Jd.jpg";
         images[1][10] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-233-Qd.jpg";
         images[1][11] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-232-Kd.jpg";
         images[1][12] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
   
         url = host+"86px-Poker-sm-241-Ac.jpg";
         images[2][0] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-24D-2c.jpg";
         images[2][1] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-24C-3c.jpg";
         images[2][2] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-24B-4c.jpg";
         images[2][3] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-24A-5c.jpg";
         images[2][4] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-249-6c.jpg";
         images[2][5] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-248-7c.jpg";
         images[2][6] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-247-8c.jpg";
         images[2][7] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-246-9c.jpg";
         images[2][8] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-245-Tc.jpg";
         images[2][9] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-244-Jc.jpg";
         images[2][10] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-243-Qc.jpg";
         images[2][11] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-242-Kc.jpg";
         images[2][12] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
   
         url = host+"86px-Poker-sm-221-Ah.jpg";
         images[3][0] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-22D-2h.jpg";
         images[3][1] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-22C-3h.jpg";
         images[3][2] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-22B-4h.jpg";
         images[3][3] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-22A-5h.jpg";
         images[3][4] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-229-6h.jpg";
         images[3][5] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-228-7h.jpg";
         images[3][6] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-227-8h.jpg";
         images[3][7] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-226-9h.jpg";
         images[3][8] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-225-Th.jpg";
         images[3][9] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-224-Jh.jpg";
         images[3][10] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-223-Qh.jpg";
         images[3][11] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
         url = host+"86px-Poker-sm-222-Kh.jpg";
         images[3][12] = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
   
         url = host+"Poker072-113-Xr.jpg";
         Image back = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
      }catch (Exception e) { e.printStackTrace();}
      // Setting up the main deck with 52 cards
      Deck m = new Deck();
      m.add52(images);
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
      player1 = new Player(p1Side);
      player2 = new Player(p2Side);
      Game myGame = new Game(player1, player2, m);

      player1Area = new PlayingArea(player1, myGame);
      player2Area = new PlayingArea(player2, myGame);
      mid = new NeutralPlayingArea(myGame);
      playArea = new JPanel();
      mid.setLocation(mid.getX(), player1Area.getHeight());
      player2Area.setLocation(player2Area.getX(), player1Area.getHeight() + mid.getHeight());
      playArea.add(player1Area);
      playArea.add(player2Area);
      playArea.setLayout(new BoxLayout(playArea, BoxLayout.Y_AXIS));
      
       
      addMouseListener(this);
      
   }
   
   public void paint(Graphics g){
      super.paint(g);
      
      player2Area.paint(g);
      player1Area.paint(g);
      mid.paint(g);
   }

   
   public void mouseClicked(MouseEvent e) {
      player1Area.mouseClicked(e);
      player2Area.mouseClicked(e);
      this.paint(this.getGraphics());
      mid.paint(this.getGraphics());
   }

   public void mouseEntered(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   public void mouseExited(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   public void mousePressed(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   public void mouseReleased(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   } 

   
}