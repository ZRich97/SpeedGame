package SpeedGame;

import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.applet.*;


   public class PlayingArea extends Canvas implements MouseListener{
      Player player;
      Image back;
      Game current;
      private final int X_OFFSET = 400;
      
      public PlayingArea(Player player, Game game){
         this.player = player;
         setSize(1000, 200);
         addMouseListener(this);
         this.current = game;
         try {
            back = (Toolkit.getDefaultToolkit()).getImage(new URL("http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/Poker072-113-Xr.jpg"));
         } catch (MalformedURLException e) {
            
            e.printStackTrace();
         }
      }
      
      public void paint (Graphics playg) {
          
         
         playg.setColor(new Color(0,185,0));
         playg.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
         try {
            for (int i=0 ; i < player.getHand().size() ; i++){
               
                  playg.drawImage(player.getHand().get(i).getCardImage(),(Driver.X_POSITION_1 + 100*i), player.getHand().get(i).getY() + this.getY(), this);
                  
                  playg.drawImage(back, 100, player.getHand().get(i).getY()+ this.getY(), this);
            }   
         
         }catch (Exception e) { }
         
      }
      
   
   public void mouseClicked(MouseEvent e) {
       
      if(e.getX()> (Driver.X_POSITION_1 + 100*0) && e.getX()< (Driver.X_POSITION_1 + 100*0)+ 90){
         if(e.getY() > player.getHand().get(0).getY() + this.getY()&& e.getY() < player.getHand().get(0).getY() + this.getY()+ 90){
            Card temp = player.playCard(player.getHand().get(0), current.getActive()[0]);
            current.setActive(temp, 0);
            if (temp == current.getActive()[0]){
               temp = player.playCard(player.getHand().get(0), current.getActive()[1]);
               current.setActive(temp, 1);
            }
            
         }
      }
      if(e.getX()> (Driver.X_POSITION_1 + 100*1) && e.getX()< (Driver.X_POSITION_1 + 100*1)+ 90){
         if(e.getY() > player.getHand().get(1).getY() + this.getY()&& e.getY() < player.getHand().get(1).getY() + this.getY()+ 90){
            Card temp = player.playCard(player.getHand().get(1), current.getActive()[0]);
            current.setActive(temp, 0);
            if (temp == current.getActive()[0]){
            temp = player.playCard(player.getHand().get(1), current.getActive()[1]);
            current.setActive(temp, 1);
            }
         }
      }
      if(e.getX()> (Driver.X_POSITION_1 + 100*2) && e.getX()< (Driver.X_POSITION_1 + 100*2)+ 90){
         if(e.getY() > player.getHand().get(2).getY() + this.getY()&& e.getY() < player.getHand().get(2).getY() + this.getY()+ 90){
            Card temp = player.playCard(player.getHand().get(2), current.getActive()[0]);
            current.setActive(temp, 0);
            if (temp == current.getActive()[0]){
               temp = player.playCard(player.getHand().get(2), current.getActive()[1]);
               current.setActive(temp, 1);
            }
         }
      }
      if(e.getX()> (Driver.X_POSITION_1 + 100*3) && e.getX()< (Driver.X_POSITION_1 + 100*3)+ 90){
         if(e.getY() > player.getHand().get(3).getY() + this.getY()&& e.getY() < player.getHand().get(3).getY() + this.getY()+ 90){
            Card temp = player.playCard(player.getHand().get(3), current.getActive()[0]);
            current.setActive(temp, 0);
            System.out.println("Done");
            if (temp == current.getActive()[0]){
               temp = player.playCard(player.getHand().get(3), current.getActive()[1]);
               current.setActive(temp, 1);
            }
         }
      }
      if(e.getX()> (Driver.X_POSITION_1 + 100*4) && e.getX()< (Driver.X_POSITION_1 + 100*4)+ 90){
         if(e.getY() > player.getHand().get(4).getY() + this.getY()&& e.getY() < player.getHand().get(4).getY() + this.getY()+ 90){
            Card temp = player.playCard(player.getHand().get(4), current.getActive()[0]);
            current.setActive(temp, 0);
            if (temp == current.getActive()[0]){
               temp = player.playCard(player.getHand().get(4), current.getActive()[1]);
               current.setActive(temp, 1);
            }
         }
      }
      
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

  