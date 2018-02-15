package HI;

import javax.swing.JPanel;

import PD.BoardPosition;
import PD.Coordinates;
import PD.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class HumanPanel extends JPanel {

  
  public HumanPanel(JFrame currentFrame, Game game) {
    setBackground(Color.CYAN);
    
    setLayout(null);
    ArrayList<Coordinates> locations = new ArrayList<Coordinates>();
    JButton[][] spots =new JButton[3][3];
    
    JLabel label = new JLabel("");
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setBounds(23, 6, 432, 45);
    add(label);
    
    
    JLabel lblNewLabel = new JLabel(game.getPlayer1().getName());
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(6, 77, 82, 16);
    add(lblNewLabel);
    lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
    
    JLabel lblNewLabel_1 = new JLabel(game.getPlayer1().getBest()+"");
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setBounds(16, 106, 61, 16);
    add(lblNewLabel_1);
    lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
    
    JLabel lblNewLabel_2 = new JLabel(game.getPlayer2().getName());
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_2.setBounds(373, 76, 82, 16);
    add(lblNewLabel_2);
    lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    
    JLabel lblNewLabel_3 = new JLabel(game.getPlayer2().getBest()+"");
    lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3.setBounds(383, 105, 61, 16);
    add(lblNewLabel_3);
    lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    
    JPanel panel = new JPanel();
    panel.setBackground(UIManager.getColor("Menu.selectionBackground"));
    panel.setLayout(null);
    panel.setBounds(104, 53, 257, 288);
    add(panel);
    
    JButton btnNewButton = new JButton();
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          game.getBoardPosition().setMove(new Coordinates(0,0), 1);
          btnNewButton.setText(game.getPlayer1().getName());
          btnNewButton.setEnabled(false);
        
          
          computerTurn(spots,game,locations, label, lblNewLabel_1,lblNewLabel_3);
          
          
        }
      });
    btnNewButton.setBackground(Color.PINK);
    btnNewButton.setBounds(21, 18, 70, 70);
    panel.add(btnNewButton);
    
    spots[0][0]=btnNewButton;
    
    JButton button = new JButton();
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(1,0), 1);
        button.setText(game.getPlayer1().getName());
        button.setEnabled(false);
      
        
        computerTurn(spots,game,locations, label, lblNewLabel_1,lblNewLabel_3);
        
        
      }
    });
    button.setBounds(95, 18, 70, 70);
    button.setBackground(Color.PINK);
    panel.add(button);
    
    spots[1][0]=button;
    
    JButton button_1 = new JButton();
    button_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(2,0), 1);
        button_1.setText(game.getPlayer1().getName());
        button_1.setEnabled(false);
      
        
        computerTurn(spots,game,locations, label, lblNewLabel_1,lblNewLabel_3);
    
      }
    });
    button_1.setBounds(169, 18, 70, 70);
    button_1.setBackground(Color.PINK);
    panel.add(button_1);
    
    spots[2][0]=button_1;
    
    JButton button_2 = new JButton();
    button_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(0,1), 1);
        button_2.setText(game.getPlayer1().getName());
        button_2.setEnabled(false);
 
        
        computerTurn(spots,game,locations, label, lblNewLabel_1,lblNewLabel_3);
 
      }
    });
    button_2.setBounds(21, 104, 70, 70);
    button_2.setBackground(Color.PINK);
    panel.add(button_2);
    
    spots[0][1]=button_2;
    
    JButton button_3 = new JButton();
    button_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(1,1), 1);
        button_3.setText(game.getPlayer1().getName());
        button_3.setEnabled(false);
  
        
        computerTurn(spots,game,locations, label,lblNewLabel_1,lblNewLabel_3);

      }
    });
    button_3.setBounds(95, 104, 70, 70);
    button_3.setBackground(Color.PINK);
    panel.add(button_3);
    
    spots[1][1]=button_3;
    
    JButton button_4 = new JButton();
    button_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(2,1), 1);
        button_4.setText(game.getPlayer1().getName());
        button_4.setEnabled(false);

        
        computerTurn(spots,game,locations, label,lblNewLabel_1,lblNewLabel_3);
       
      }
    });
    button_4.setBounds(169, 104, 70, 70);
    button_4.setBackground(Color.PINK);
    panel.add(button_4);
    
    spots[2][1]=button_4;
    
    JButton button_5 = new JButton();
    button_5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(0,2), 1);
        button_5.setText(game.getPlayer1().getName());
        button_5.setEnabled(false);
       
        
        computerTurn(spots,game,locations, label,lblNewLabel_1,lblNewLabel_3);
      
      }
    });
    button_5.setBackground(Color.PINK);
    button_5.setBounds(21, 187, 70, 70);
    button_4.setBackground(new Color(0, 204, 204));
    panel.add(button_5);
    
    spots[0][2]=button_5;
    
    JButton button_6 = new JButton();
    button_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(1,2), 1);
        button_6.setText(game.getPlayer1().getName());
        button_6.setEnabled(false);
        
        
        computerTurn(spots,game,locations, label,lblNewLabel_1,lblNewLabel_3);
      }
    });
    button_6.setBounds(95, 187, 70, 70);
    button_6.setBackground(Color.PINK);
    panel.add(button_6);
    
    spots[1][2]=button_6;
    
    JButton button_7 = new JButton();
    button_7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        game.getBoardPosition().placeInPosition(new Coordinates(2,2), 1);
        button_7.setText(game.getPlayer1().getName());
        button_7.setEnabled(false);
       
        
        computerTurn(spots,game,locations, label,lblNewLabel_1,lblNewLabel_3);
      }
    });
    button_7.setBounds(169, 187, 70, 70);
    button_7.setBackground(Color.PINK);
    panel.add(button_7);
    
    spots[2][2]=button_7;
    
    JButton btnNewGame = new JButton("New Game");
    btnNewGame.setBackground(Color.WHITE);
    btnNewGame.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    btnNewGame.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        HumanPanel newPanel = new HumanPanel(currentFrame, game);
        currentFrame.getContentPane().removeAll();
        currentFrame.getContentPane().add(newPanel);
        currentFrame.revalidate();
      }
    });
    btnNewGame.setBounds(6, 271, 87, 70);
    add(btnNewGame);
    
   
    
    
 
    }
  
  public void computerTurn(JButton[][] spotsOnScreen, Game game,  ArrayList<Coordinates> locations, JLabel label
      ,JLabel humanScore, JLabel computerScore)
  {
    //CLEAN UP BOARD AND CHECK FOR WINNER OR DRAW------------------------------------------------------------------
    //clear out board based on what screen displays
    BoardPosition newBoard= new BoardPosition();
    for(int x =0; x<spotsOnScreen.length; x++)
    {
      for(int y=0; y<spotsOnScreen.length; y++)
      {
        if(spotsOnScreen[x][y].isEnabled())                 //if spot is open for selection
        {
          newBoard.setMove(new Coordinates(x,y), 0);        //set as empty
        }
        else if(spotsOnScreen[x][y].getText().equals(game.getPlayer2().getName()))  //if spot is taken by computer
        {   
          newBoard.setMove(new Coordinates(x,y), -1);       //set as computer
        }
        else            
        {
          newBoard.setMove(new Coordinates(x,y), 1);       //set as human
        }
      }
    }
    
    game.setBoardPosition(newBoard);                        //save new board
    
    
    if(game.getBoardPosition().checkForWinner()==1)         //if human won
    {   
      System.out.println("You won.");
      label.setText(game.getPlayer1().getName() + " Won");          //set big label
      game.getPlayer1().setBest(game.getPlayer1().getBest()+10);    //calculate and store new score
      humanScore.setText(game.getPlayer1().getBest()+"");           //display score
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
      
    }
    else if(game.getBoardPosition().checkForWinner()==-1)   //if computer won
    {
      System.out.println("Computer won.");
      label.setText(game.getPlayer2().getName() + " Won");          //set big label
      game.getPlayer2().setBest(game.getPlayer2().getBest()+10);    //calculate and store new score
      computerScore.setText(game.getPlayer2().getBest()+"");        //display score
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
    }
    else if(game.getBoardPosition().isComplete())                //if board is full
    {
      System.out.println("Draw.");                          
      label.setText("The Cat Won");                         //set big label
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
    }
  //---------------------------------------------------------------------------------------------------------------
  
    
  //GET COMPUTER'S MOVE--------------------------------------------------------------------------------------------
    Coordinates spot = game.getBoardPosition().computerMove();              //get coordinates of move
    
    //verify spot is valid based on what is displayed to user before setting
    if(spotsOnScreen[spot.getX()][spot.getY()].isEnabled())
    {
      spotsOnScreen[spot.getX()][spot.getY()].setText(game.getPlayer2().getName());
      spotsOnScreen[spot.getX()][spot.getY()].setEnabled(false);
      
    }
  //----------------------------------------------------------------------------------------------------------------
    
  //CLEAN UP BOARD AND CHECK FOR WINNER OR DRAW------------------------------------------------------------------
  //clear out board based on what screen displays
    newBoard= new BoardPosition();
    for(int x =0; x<spotsOnScreen.length; x++)
    {
      for(int y=0; y<spotsOnScreen.length; y++)
      {
        if(spotsOnScreen[x][y].isEnabled())                 //if spot is open for selection
        {
          newBoard.setMove(new Coordinates(x,y), 0);        //set as empty
        }
        else if(spotsOnScreen[x][y].getText().equals(game.getPlayer2().getName()))  //if spot is taken by computer
        {   
          newBoard.setMove(new Coordinates(x,y), -1);       //set as computer
        }
        else            
        {
          newBoard.setMove(new Coordinates(x,y), 1);       //set as human
        }
      }
    }
    
    game.setBoardPosition(newBoard);                        //save new board
    
    
    if(game.getBoardPosition().checkForWinner()==1)         //if human won
    {   
      System.out.println("You won.");
      label.setText(game.getPlayer1().getName() + " Won");          //set big label
      game.getPlayer1().setBest(game.getPlayer1().getBest()+10);    //calculate and store new score
      humanScore.setText(game.getPlayer1().getBest()+"");           //display score
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
      
    }
    else if(game.getBoardPosition().checkForWinner()==-1)   //if computer won
    {
      System.out.println("Computer won.");
      label.setText(game.getPlayer2().getName() + " Won");          //set big label
      game.getPlayer2().setBest(game.getPlayer2().getBest()+10);    //calculate and store new score
      computerScore.setText(game.getPlayer2().getBest()+"");        //display score
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
    }
    else if(game.getBoardPosition().isComplete())                //if board is full
    {
      System.out.println("Draw.");                          
      label.setText("The Cat Won");                         //set big label
      
      //go through all buttons and disable them
      for(int x =0; x<spotsOnScreen.length; x++)
      {
        for(int y=0; y<spotsOnScreen.length; y++)
        {
          spotsOnScreen[x][y].setEnabled(false);
        }
      }
    }
  //---------------------------------------------------------------------------------------------------------------
    
    
  }
  
}
