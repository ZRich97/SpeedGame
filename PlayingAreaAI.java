package SpeedGame;

import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.applet.*;
public class PlayingAreaAI extends Canvas implements ActionListener{
   AI computer;
   Image back;
   Game current;
   Timer timer;
   private final int X_OFFSET = 400;
   
   public PlayingAreaAI(AI computer, Game game){
      this.computer = computer;
      this.current = game;
      timer = new Timer(1000, new ActionListener(){
         public void actionPerformed(ActionEvent e){
            current.getComputer().playCard();
         }
      });
      setSize(1000, 200);
      try {
         back = (Toolkit.getDefaultToolkit()).getImage(new URL("http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/Poker072-113-Xr.jpg"));
      } catch (MalformedURLException e) {
         
         e.printStackTrace();
      }
   }
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub
      
   }

}
