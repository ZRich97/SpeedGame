package SpeedGame;

import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.applet.*;

public class NeutralPlayingArea extends Canvas{
   Game current;
   int width, height = 0;
   Image back;
   
   public NeutralPlayingArea(Game curr){
      current = curr;
      setSize(1000, 200);
      setBackground(Color.GREEN);
      try {
         back = (Toolkit.getDefaultToolkit()).getImage(new URL("http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/Poker072-113-Xr.jpg"));
      } catch (MalformedURLException e) {
         
         e.printStackTrace();
      }
   }
   public void paint(Graphics g){
      g.setColor(new Color(0,185,0));
      g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
      try{
         if(!(current.getMeSideDeck().isEmpty())){
            g.drawImage(back, 320, this.getY(), this);
         }
         if(!(current.getOtherSideDeck().isEmpty())){
            g.drawImage(back, 620, this.getY(), this);
         }
         if((current.getActive()[0].isValid())){
            g.drawImage(current.getActive()[0].getCardImage(), 420, this.getY(), this);
         }
         if((current.getActive()[1].isValid())){
            g.drawImage(current.getActive()[1].getCardImage(), 520, this.getY(), this);
         }
         
         
         
      }catch (Exception e) { }
   }

}
