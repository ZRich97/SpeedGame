package SpeedGame;

import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.applet.*;
public class PlayingAreaAI extends Canvas{
   AI computer;
   Image back;
   Game current;
   Timer timer;
   Graphics g;
   private final int X_OFFSET = 400;
   
   public PlayingAreaAI(AI computer, Game game, Graphics g){
      this.computer = computer;
      this.current = game;
      this.g = g;
      int count = 0;
      timer = new Timer(1000, new ActionListener(){
         public void actionPerformed(ActionEvent e){
            
            Card temp1 = current.getComputer().playCard(current.getActive()[0]);
            Card temp2 = current.getComputer().playCard(current.getActive()[1]);
            current.setActive(temp1, 0);
            current.setActive(temp2, 1);
            System.out.println("AI is r=woring");
            System.out.println(current.getComputer().getHand().toString());
         }
      });
      /*new java.util.Timer().schedule(
            
            new java.util.TimerTask(){
               public void run(){
                  current.getComputer().playCard(current.getActive()[0]);
                  current.getComputer().playCard(current.getActive()[1]);
                  System.out.println("AI is r=woring");
                  
                  runOnUiThread(new Runnable(){

                     public void run() {
                        // TODO Auto-generated method stub
                        
                     }
                  
                  })
               }
               
            }, 5000
            
            );*/
         
      
      setSize(1000, 200);
      timer.start();
      try {
         back = (Toolkit.getDefaultToolkit()).getImage(new URL("http://gauss.ececs.uc.edu/Camp/Contributions/Cards/images/Poker072-113-Xr.jpg"));
      } catch (MalformedURLException e) {
         
         e.printStackTrace();
      }
   }
   public void paint (Graphics playg) {
      
      playg.setColor(new Color(0,185,0));
      playg.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
      
         for (int i=0 ; i < computer.getHand().size() ; i++){
            
            playg.drawImage(computer.getHand().get(i).getCardImage(), (Driver.X_POSITION_1 + 100*i), computer.getHand().get(i).getY() + this.getY(), this);
            
          
         }   
       
         playg.drawImage(back, 100,30+ this.getY(), this);
      
      if (current.gameOver() != 0){
         
      }
   }
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub
      
   }

}
