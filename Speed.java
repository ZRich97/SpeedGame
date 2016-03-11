package components;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

class CardImages {
   Image images[][] = new Image[4][13];
   Image back;
   String host;

   public CardImages () {
      host = "http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/";
      try {
         String url = host+"86px-Poker-sm-211-As.jpg";
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
         back = (Toolkit.getDefaultToolkit()).getImage(new URL(url));
      } catch (Exception e) { e.printStackTrace(); }
   }
}

class Card {
   Image image, back;       // Face and card back images
   int suit;                // 0=spades, 1=diamonds, 2=clubs, 3=hearts
   int denomination;        // 2-10 (normal) 1=Ace, 11=Jack, 12=Queen, 13=King
   boolean faceup = false;  // true=face up, false=face down
   int left, top;           // Position of the card in the playing area
   
   public Card (int i, int j, Image image, Image back) { 
      suit = i; 
      denomination = j; 
      this.image = image;
      this.back = back;
      left = 30;
      top = 30;
   }
}

class Deck {
   Card deck[];
   CardImages images;
   
   public Deck () {
      // We must get a set of images for the cards we will make below
      images = new CardImages();
      deck = new Card[52];

      // Make a complete deck of cards - all suits and denominations
      int k=0;
      for (int i=0 ; i < 4 ; i++) {
         for (int j=1 ; j <= 13 ; j++) {
            deck[k++] = new Card(i,j,images.images[i][j-1],images.back);
         }
      }
   }

   // Simple random shuffle - a random permutation of the existing cards
   // Fill a temporary array of cards then set hand it to the deck array.
   public void shuffle () {
      Card d[] = new Card[52];
      for (int i=0 ; i < 52 ; i++) d[i] = null;
      int k=0;
      while (k < 52) {
         int rn = (int)(Math.floor(52.0*Math.random()));
         if (d[rn] == null) {
            d[rn] = deck[k++]; 
            d[rn].faceup = false;
         }
      }
      deck = d;
   }
}

class PlayingArea extends JPanel {
   Image playarea;
   Graphics playg;
   int width=0, height=0;
   Card hand[];
   int number;
   boolean special;  // true=card is drawn face down, false=drawn face up

   public void setHand (Card hand[], int n) {  
      this.hand = hand; 
      // If the number n is negative it means the card is face down.
      if (n < 0) special = true; else special = false;
      number = (int)Math.abs(n);  
   }

   public void paint (Graphics g) {
      Dimension d = getSize();
      if (width != d.width || height != d.height) {
         playarea = createImage(d.width, d.height);
         playg = playarea.getGraphics();
         width = d.width;
         height = d.height;
      }
      playg.setColor(new Color(0,185,0));
      playg.fillRect(0,0,width,height);
      try {
         for (int i=0 ; i < number ; i++) 
            if (hand[i].faceup)
               playg.drawImage(hand[i].image, hand[i].left, hand[i].top, this);
            else
               playg.drawImage(hand[i].back, hand[i].left, hand[i].top, this);
         if (special) 
               playg.drawImage(hand[0].image, hand[0].left, hand[0].top, this);
      } catch (Exception e) { }
      g.drawImage(playarea,0,0,this);
   }
}

public class Speed extends Applet implements ActionListener  {
   JPanel panel[] = new JPanel[7];
   JLabel player[] = new JLabel[2];
   PlayingArea playarea[] = new PlayingArea[2];
   JTextField pts[] = new JTextField[2];
   JButton hit[] = new JButton[2], 
      hld[] = new JButton[2], 
      addten[] = new JButton[2],
      sfl, ngm;
   Deck deck;
   Card hand[][] = new Card[2][];
   int card, hndcnt[] = new int[2];

   public void init () {
      card = 0;
      setLayout(new BorderLayout());

      JPanel p = new JPanel();
      p.setLayout(new GridLayout(2,1));
      p.add(playarea[0] = new PlayingArea());
      p.add(playarea[1] = new PlayingArea());
      add("Center", p);

      panel[3] = new JPanel();
      panel[3].setLayout(new GridLayout(1,2));

      panel[2] = new JPanel();
      panel[2].setLayout(new GridLayout(3,1));
      panel[2].setBackground(new Color(255,255,223));
      panel[2].add(player[0] = new JLabel("Top Player", JLabel.CENTER));

      panel[0] = new JPanel();
      panel[0].setLayout(new FlowLayout());
      panel[0].setBackground(new Color(255,255,223));
      panel[0].add(hit[0] = new JButton("Hit"));
      panel[0].add(pts[0] = new JTextField(4));
      panel[0].add(hld[0] = new JButton("Hold"));
      panel[2].add(panel[0]);

      panel[1] = new JPanel();
      panel[1].setLayout(new FlowLayout());
      panel[1].setBackground(new Color(255,255,223));
      panel[1].add(addten[0] = new JButton("Add 10"));
      panel[1].add(new JLabel("  "));
      panel[1].add(ngm = new JButton("New Game"));
      panel[2].add(panel[1]);
      panel[3].add(panel[2]);

      panel[4] = new JPanel();
      panel[4].setLayout(new GridLayout(3,1));
      panel[4].setBackground(new Color(255,255,223));
      panel[4].add(player[1] = new JLabel("Bottom Player", JLabel.CENTER));

      panel[5] = new JPanel();
      panel[5].setLayout(new FlowLayout());
      panel[5].setBackground(new Color(255,255,223));
      panel[5].add(hit[1] = new JButton("Hit"));
      panel[5].add(pts[1] = new JTextField(4));
      panel[5].add(hld[1] = new JButton("Hold"));
      panel[4].add(panel[5]);

      panel[6] = new JPanel();
      panel[6].setLayout(new FlowLayout());
      panel[6].setBackground(new Color(255,255,223));
      panel[6].add(sfl = new JButton("   Shuffle   "));
      panel[6].add(new JLabel("  "));
      panel[6].add(addten[1] = new JButton("Add 10"));
      panel[4].add(panel[6]);
      panel[3].add(panel[4]);

      add("South",panel[3]);
      
      for (int i=0 ; i < 2 ; i++) {
         pts[i].setText("0");
         pts[i].setFont(new Font("TimesRoman", Font.PLAIN, 18));
         player[i].setFont(new Font("TimesRoman", Font.BOLD, 14));
         hit[i].addActionListener(this);
         hld[i].addActionListener(this);
         addten[i].addActionListener(this);
         addten[i].setEnabled(false);
         hndcnt[i] = 0;
         hand[i] = null;
      }
      sfl.addActionListener(this);
      ngm.addActionListener(this);

      deck = new Deck();
      deck.shuffle();
   }
   
   public void paint (Graphics g) {  
      for (int i=0 ; i < 2 ; i++) playarea[i].paint(playarea[i].getGraphics());
      for (int i=0 ; i < 7 ; i++) panel[i].paint(panel[i].getGraphics());
   }

   public void processHit (int i) {
      addten[i].setEnabled(false);
      boolean enableAddTen = false;
      deck.deck[card].left = 30+90*hndcnt[i];
      hand[i][hndcnt[i]] = deck.deck[card++];
      hand[i][hndcnt[i]].faceup = true;
      if (hand[i][hndcnt[i]].denomination == 1) enableAddTen = true;
      int p = Math.min(10,hand[i][hndcnt[i]++].denomination);
      int points = Integer.parseInt(pts[i].getText());
      playarea[i].setHand(hand[i], hndcnt[i]);
      
      paint(this.getGraphics());
      
      pts[i].setText(String.valueOf(points+p));
      if (enableAddTen) addten[i].setEnabled(true);
      else checkForEnd();
   }

   public void processHold (int i) {
      addten[i].setEnabled(false);
      boolean enableAddTen = false;
      hld[i].setEnabled(false);
      hit[i].setEnabled(false);
      hand[i][0].faceup = true;
      if (hand[i][0].denomination == 1) enableAddTen = true;
      int p = Math.min(10,hand[i][0].denomination);
      int points = Integer.parseInt(pts[i].getText());
      playarea[i].setHand(hand[i], -hndcnt[i]);

      paint(this.getGraphics());

      pts[i].setText(String.valueOf(points+p));
      if (enableAddTen) addten[i].setEnabled(true);
      else checkForEnd();
   }

   public void processAddTen(int i) {
      addten[i].setEnabled(false);
      int points = Integer.parseInt(pts[i].getText());
      pts[i].setText(String.valueOf(points+10));
      checkForEnd();
   }

   public void checkForEnd () {
      int points[] = new int[2];
      points[0] = Integer.parseInt(pts[0].getText());
      points[1] = Integer.parseInt(pts[1].getText());

      // If someone has gone over 21, then get a red flag and they can
      // no longer provide input.
      for (int i=0 ; i < 2 ; i++) {
         if (points[i] > 21) {
            pts[i].setBackground(Color.red);
            hld[i].setEnabled(false);
            hit[i].setEnabled(false);
            addten[i].setEnabled(false);
         }
      }

      // Check whether red or yellow should be placed on points text 
      // fields.  Red means lose and yellow means win.
      // Don't do the rest of this if we are not yet done.
      // That is, at least one 'hold' button is enabled.
      if (hld[0].isEnabled() || hld[1].isEnabled()) return;

      if (points[1] <= 21 && points[0] <= 21) {
         if (points[1] < points[0]) {
            pts[0].setBackground(Color.yellow);
            pts[1].setBackground(Color.red);
         } else if (points[1] > points[0]) {
            pts[1].setBackground(Color.yellow);
            pts[0].setBackground(Color.red);
         } else {
            pts[0].setBackground(Color.yellow);
            pts[1].setBackground(Color.yellow);
         }
      } else if (points[0] <= 21) {
         pts[0].setBackground(Color.yellow);
      } else if (points[1] <= 21) {
         pts[1].setBackground(Color.yellow);
      }
   }

   public void deal (boolean shfl) {
      int p[] = new int[2];

      // Initialization
      if (card > 30 || shfl) { deck.shuffle(); card = 0; }
      for (int i=0 ; i < 2 ; i++) { 
         hand[i] = new Card[20]; 
         hndcnt[i] = 0; 
         addten[i].setEnabled(false);
      }
      for (int i=0 ; i < 20 ; i++) hand[0][i] = hand[1][i] = null;

      // Hidden cards first
      for (int i=0 ; i < 2 ; i++) {
         deck.deck[card].left = 30+90*hndcnt[i];
         hand[i][hndcnt[i]++] = deck.deck[card++];
      }
      
      // Next card face up
      for (int i=0 ; i < 2 ; i++) {
         deck.deck[card].left = 30+90*hndcnt[i];
         hand[i][hndcnt[i]] = deck.deck[card++];
         hand[i][hndcnt[i]].faceup = true;
         if (hand[i][hndcnt[i]].denomination == 1) addten[i].setEnabled(true);
         p[i] = Math.min(10,hand[i][hndcnt[i]++].denomination);
         playarea[i].setHand(hand[i], hndcnt[i]);
      }

      paint(this.getGraphics());

      for (int i=0 ; i < 2 ; i++) {
         pts[i].setText(String.valueOf(p[i]));
         pts[i].setBackground(Color.white);
         hld[i].setEnabled(true);
         hit[i].setEnabled(true);
      }
   }
   
   public void actionPerformed (ActionEvent evt) {
      if (evt.getSource() == ngm) deal(false);
      else if (evt.getSource() == sfl) deal(true);
      else if (evt.getSource() == hit[0]) processHit(0);
      else if (evt.getSource() == hld[0]) processHold(0);
      else if (evt.getSource() == addten[0]) processAddTen(0);
      else if (evt.getSource() == hit[1]) processHit(1);
      else if (evt.getSource() == hld[1]) processHold(1);
      else if (evt.getSource() == addten[1]) processAddTen(1);
   }
}