package HI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import PD.Game;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class HomePanel extends JPanel {
  private JTextField textField;
  private JTextField textField_1;
  public HomePanel(Frame currentFrame) {
    setBackground(Color.CYAN);
    setLayout(null);
    
    JLabel lblHome = new JLabel("Tic-Tac-Toe");
    lblHome.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
    lblHome.setHorizontalAlignment(SwingConstants.CENTER);
    lblHome.setBounds(16, 6, 428, 47);
    add(lblHome);
    
    JLabel lblYourName = new JLabel("Your Name:");
    lblYourName.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
    lblYourName.setBounds(38, 68, 108, 16);
    add(lblYourName);
    
    textField = new JTextField();
    textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    textField.setBounds(192, 65, 130, 26);
    add(textField);
    textField.setColumns(10);
    
    JLabel lblComputersName = new JLabel("Computer's Name:");
    lblComputersName.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
    lblComputersName.setBounds(38, 96, 161, 16);
    add(lblComputersName);
    
    textField_1 = new JTextField();
    textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    textField_1.setBounds(192, 93, 130, 26);
    add(textField_1);
    textField_1.setColumns(10);
    
    JButton btnStartGame = new JButton("Start Game");
    btnStartGame.setBackground(Color.WHITE);
    btnStartGame.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    btnStartGame.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        Game myGame = new Game(textField.getText(), textField_1.getText());
        
        HumanPanel newPanel = new HumanPanel(currentFrame, myGame);
        currentFrame.getContentPane().removeAll();
        currentFrame.getContentPane().add(newPanel);
        currentFrame.revalidate();
      }
    });
    btnStartGame.setBounds(165, 157, 102, 65);
    add(btnStartGame);
  }
}
