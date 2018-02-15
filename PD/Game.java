package PD;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
  
  private Player player1;
  private Player player2;
  private BoardPosition currentBoardPosition;
  private enum PlayerName {player1, player2};
  private PlayerName currentPlayer;
  private enum Status {READY, IN_PROGRESS, COMPLETED};
  private Status statusOfGame;
  private PlayerName winner;
  
  
  /**
   * startGame() set up and start the game and play the game
   * @param player1 & player2 - String name of players
   */
  public Game(String player1Name, String player2Name)
  {
    //set up and start the game
    currentBoardPosition =new BoardPosition();
    setPlayer1(new Player(player1Name, true));
    setPlayer2(new Player(player2Name, false));
    
    int rand = (int) (Math.random()*2);
    if(rand == 1)
    {
      setCurrentPlayer(PlayerName.player1);
      
    }
    else
    {
      setCurrentPlayer(PlayerName.player2);
    }
    
    setStatusOfGame(Status.READY);
    
    
  }
  
  /**
   * isComplete() see if game is over
   * @return true if game is over, false if game is not
   */
  public boolean isComplete()
  {
    return this.currentBoardPosition.isComplete();
  }

  /**
   * getPlayer1() return the player1 (human)
   * @return player1 - the human player
   */
  public Player getPlayer1() {
    return player1;
  }

  /**
   * setPlayer1() change player1 (human)
   * @param player1 - player to be new player1
   */
  public void setPlayer1(Player player1) {
    this.player1 = player1;
  }

  /**
   * getPlayer2() return the player2 (computer)
   * @return player2 - the computer player
   */
  public Player getPlayer2() {
    return player2;
  }

  /**
   * setPlayer2() change player2 (computer)
   * @param player2 - player to be new player2
   */
  public void setPlayer2(Player player2) {
    this.player2 = player2;
  }

  /**
   * getCurrentPlayer() return the name of the player
   * @return currentPlayer - PlayerName type of player (player1 or player2)
   */
  public PlayerName getCurrentPlayer() {
    return currentPlayer;
  }

  /**
   * setCurrentPlayer() change PlayerName (player1 or player2)
   * @param PlayerName - currentPlayer to set name of player
   */
  public void setCurrentPlayer(PlayerName currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  /**
   * getStatusOfGame() return the status of the game
   * @return statusOfGame - Status status of game
   */
  public Status getStatusOfGame() {
    return statusOfGame;
  }

  /**
   * setStatusOfGame() change status 
   * @param statusOfGame - Status to be new 
   */
  public void setStatusOfGame(Status statusOfGame) {
    this.statusOfGame = statusOfGame;
  }

  /**
   * getWinner() return the winner of the game
   * @return winner - PlayerName name of player
   */
  public PlayerName getWinner() {
    return winner;
  }

  /**
   * setWinner() change winner 
   * @param winner - PlayerName who is winner
   */
  public void setWinner(PlayerName winner) {
    this.winner = winner;
  }
 
  /**
   * getBoardPosition() return the current board position in use
   * @return currentBoardPosition - board layout
   */
  public BoardPosition getBoardPosition()
  {
    return this.currentBoardPosition;
    
  }
  
  /**
   * setBoardPosition() change boardposition for game
   * @param newOne - new board layout to use
   */
  public void setBoardPosition(BoardPosition newOne)
  {
    this.currentBoardPosition=newOne;
    
  }
 

}
