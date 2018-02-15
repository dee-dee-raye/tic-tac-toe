package HI;

import javax.swing.JFrame;

import HI.Frame;

public class UserInterface{
  
  public static void main(String args[])
  {
      JFrame frame = new Frame();
      frame.pack();                  //set the size of the frame based on content
      frame.setVisible(true);        //allows us to see the frame
      frame.setSize(475, 475);
  }
}

