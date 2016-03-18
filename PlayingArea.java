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
   //JLabel result;
   private final int X_OFFSET = 400;
   
   public PlayingArea(Player player, Game game){
      this.player = player;
      setSize(1000, 200);
      addMouseListener(this);
      this.current = game;
      //this.result = new JLabel("End Message", )
      try {
         back = (Toolkit.getDefaultToolkit()).getImage(new URL("http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/Poker072-113-Xr.jpg"));
      } catch (MalformedURLException e) {
         
         e.printStackTrace();
      }
   }
   
   public void paint (Graphics playg) {
     
      playg.setColor(new Color(0,185,0));
      playg.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
      
         for (int i=0 ; i < player.getHand().size() ; i++){
            
            playg.drawImage(player.getHand().get(i).getCardImage(), (Driver.X_POSITION_1 + 100*i), player.getHand().get(i).getY() + this.getY(), this);
            
          
         }   
       
         playg.drawImage(back, 100,30+ this.getY(), this);
      
      if (current.gameOver() != 0){
         
      }
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
            current.ifOptions();
            
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
            current.ifOptions();

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
            current.ifOptions();

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
            current.ifOptions();

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
            current.ifOptions();

         }
      }
      current.ifOptions();
   }

   public void mouseEntered(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   public void mouseExited(MouseEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   public void mousePressed(MouseEvent e) {
      
      try{
         if(e.getX()> (Driver.X_POSITION_1 + 100*0) && e.getX()< (Driver.X_POSITION_1 + 100*0)+ 90){
            if(e.getY() > player.getHand().get(0).getY() + this.getY()&& e.getY() < player.getHand().get(0).getY() + this.getY()+ 90){
               Card chosen = player.getHand().get(0);
               Card temp = player.playCard(chosen, current.getActive()[0]);
               
               current.setActive(temp, 0);
               
               if (chosen != current.getActive()[0]){
                  temp = player.playCard(player.getHand().get(0), current.getActive()[1]);
                  current.setActive(temp, 1);
               }
               current.ifOptions();
               
            }
         }
         if(e.getX()> (Driver.X_POSITION_1 + 100*1) && e.getX()< (Driver.X_POSITION_1 + 100*1)+ 90){
            if(e.getY() > player.getHand().get(1).getY() + this.getY()&& e.getY() < player.getHand().get(1).getY() + this.getY()+ 90){
               Card chosen = player.getHand().get(1);
               Card temp = player.playCard(player.getHand().get(1), current.getActive()[0]);
               current.setActive(temp, 0);
               if (chosen != current.getActive()[0]){
                  temp = player.playCard(player.getHand().get(1), current.getActive()[1]);
                  current.setActive(temp, 1);
               }
               current.ifOptions();
   
            }
         }
         if(e.getX()> (Driver.X_POSITION_1 + 100*2) && e.getX()< (Driver.X_POSITION_1 + 100*2)+ 90){
            if(e.getY() > player.getHand().get(2).getY() + this.getY()&& e.getY() < player.getHand().get(2).getY() + this.getY()+ 90){
               Card chosen = player.getHand().get(2);
               Card temp = player.playCard(player.getHand().get(2), current.getActive()[0]);
               current.setActive(temp, 0);
               if (chosen != current.getActive()[0]){
                  temp = player.playCard(player.getHand().get(2), current.getActive()[1]);
                  current.setActive(temp, 1);
               }
               current.ifOptions();
   
            }
         }
         if(e.getX()> (Driver.X_POSITION_1 + 100*3) && e.getX()< (Driver.X_POSITION_1 + 100*3)+ 90){
            if(e.getY() > player.getHand().get(3).getY() + this.getY()&& e.getY() < player.getHand().get(3).getY() + this.getY()+ 90){
               Card chosen = player.getHand().get(3);
               Card temp = player.playCard(player.getHand().get(3), current.getActive()[0]);
               current.setActive(temp, 0);
               System.out.println("Done");
               if (chosen != current.getActive()[0]){
                  temp = player.playCard(player.getHand().get(3), current.getActive()[1]);
                  current.setActive(temp, 1);
               }
               current.ifOptions();
   
            }
         }
         if(e.getX()> (Driver.X_POSITION_1 + 100*4) && e.getX()< (Driver.X_POSITION_1 + 100*4)+ 90){
            if(e.getY() > player.getHand().get(4).getY() + this.getY()&& e.getY() < player.getHand().get(4).getY() + this.getY()+ 90){
               Card chosen = player.getHand().get(4);
               Card temp = player.playCard(player.getHand().get(4), current.getActive()[0]);
               current.setActive(temp, 0);
               if (chosen != current.getActive()[0]){
                  temp = player.playCard(player.getHand().get(4), current.getActive()[1]);
                  current.setActive(temp, 1);
               }
               current.ifOptions();
   
            }
         }
         if (player.getHand().size() != 5){
            player.draw();
         }
         if (current.gameOver() == 1){
            System.out.println("You Win!");
            System.exit(0);
         }
         else if(current.gameOver() == 2){
            System.out.println("You Lose :(");
            System.exit(0);
         }
         
         current.ifOptions();
      }catch (IndexOutOfBoundsException ex){
            
         
      }
      System.out.println("Click Registered :P");
   }

   public void mouseReleased(MouseEvent arg0) {
      System.out.println("Click Registered :P");
      
   }
   
}

