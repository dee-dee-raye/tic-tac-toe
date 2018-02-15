package PD;

import java.util.ArrayList;


public class BoardPosition {
  
  private int[][] board;
  private int score;
  private Coordinates move;
  
  private static class Move {
    int x;
    int y;
    int score;
    
    public Move()
    {
      
    }
    
    public Move(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    
    public Move(int s)
    {
      this.score=s;
    }
    
  
    
    public void setScore(int s)
    {
      this.score=s;
    }
    
  }
  
  /**
   * BoardPosition() creates a BoardPosition with a blank (zeroed out) board
   * 
   */
  public BoardPosition()
  {
    
    
    board=new int[3][3];            //initilize new board
    
    //set the board as blank by setting all spots to zero
    for(int x = 0; x < 3; x++)
    {
      for(int y = 0; y < 3; y++)
      {
        board[x][y]=0;
      }
    }
    
    this.score=0;                   //set score to zero this game has only started
    
    
  }
  
  /**
   * isComplete() checks if the board is full
   * @return complete - boolean true if all spots are taken, false if at least one is not
   */
  public boolean isComplete()
  {
    //true if board is full
    boolean complete = true;
    
    //go through board and look for nonempty (nonzero) squares
    for(int x = 0; x < 3 && complete; x++)
    {
      for(int y = 0; y < 3; y++)
      {
        if(board[x][y] == 0)
        {
          complete=false;
        }
      }
    }
    
    return complete;
    
  }
  
  /**
   * isEmpty() checks if the board is empty
   * @return empty - boolean true if all spots are empty, false if at least one is not
   */
  public boolean isEmpty()
  {
    //true if board is full
    boolean empty = true;
    
    //go through board and look for nonempty (nonzero) squares
    for(int x = 0; x < 3 && empty; x++)
    {
      for(int y = 0; y < 3; y++)
      {
        if(board[x][y] != 0)
        {
          empty=false;
        }
      }
    }
    
    return empty;
    
  }
  
  /**
   * checkForWinner() checks for winner of board
   * @return winner - int 1 if 1's have won, -1 if -1's have won, 0 if draw
   */
  public int checkForWinner()
  {
    int tempResult=10;
    
    //horizontal checking
    tempResult=this.board[0][0] + this.board[0][1] + this.board[0][2];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    
    tempResult=this.board[1][0] + this.board[1][1] + this.board[1][2];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    
    tempResult=this.board[2][0] + this.board[2][1] + this.board[2][2];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    //-----------------------------------------------------------------------
    //vertical checking
    
    tempResult=this.board[0][0] + this.board[1][0] + this.board[2][0];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    
    tempResult=this.board[0][1] + this.board[1][1] + this.board[2][1];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    
    tempResult=this.board[0][2] + this.board[1][2] + this.board[2][2];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
  //-----------------------------------------------------------------------
  //diagonal checking
    tempResult=this.board[0][0] + this.board[1][1] + this.board[2][2];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
    
    tempResult=this.board[0][2] + this.board[1][1] + this.board[2][0];
    if(tempResult == 3)
    {
      return 1;
    }
    else if(tempResult == -3)
    {
      return -1;
    }
  //-----------------------------------------------------------------------
  //board is full checking
    if(this.isComplete())
    {
      return 0;
    }
    else
    {
      return 10;
    }
    
  }
  
  /**
   * isPosOpen() checks if position is already taken
   * * @param pos Coordinates - coordinates to check 
   * @return isOpen - boolean true if position is open, false if position is taken
   */
  public boolean isPosOpen(Coordinates pos)
  {
    boolean isOpen = true;
    
    if(board[pos.getX()][pos.getY()] != 0)
    {
      isOpen = false;
    }
    
    return isOpen;
  }
  
  /**
   * isPosOpen() checks if position is already taken
   * @param int x, int y - int values to check 
   * @return isOpen - boolean true if position is open, false if position is taken
   */
  public boolean isPosOpen(int x,int y)
  {
    boolean isOpen = true;
    
    if(board[x][y] != 0)
    {
      isOpen = false;
    }
    
    return isOpen;
  }
  
  /**
   * placeInPosition() put player num in given position
   * @param Coordinates - move postion to place num in, int - playerNum num of player to go in position
   * playerNum (1 or -1)
   */
  public void placeInPosition(Coordinates move, int playerNum)
  {
    this.board[move.getX()][move.getY()]=playerNum;
  }
  
  /**
   * getBoard() return board array
   * @return board - array repersentation of board
   */
  public int[][] getBoard() {
    return board;
  }
  
  /**
   * setBoard() set the array that repersents the board
   * @param int[][] -board to be used to repersent the board
   */
  public void setBoard(int[][] board) {
    this.board = board;
  }
  
  /**
   * getScore() returns the score
   * @return score - int value of score
   */
  public int getScore() {
    return score;
  }
  
  /**
   * setScore() sets the score of the game
   * @param int score - value to set as score
   */
  public void setScore(int score) {
    this.score = score;
  }
  
  /**
   * getMove() return current move
   * @return move - current move (position)
   */
  public Coordinates getMove() {
    return move;
  }
  
  /**
   * setMove() tryToMove to spot
   * @param Coordinates - move space to try to move to, int - playerNum value of player
   * @return aMove - current move (position) is possible
   */
  public boolean setMove(Coordinates move, int playerNum) {
    boolean aMove = false;
    
    if(isPosOpen(move))
    {
      this.move = move;
      placeInPosition(move, playerNum);
      aMove = true;
    }
    
    return aMove;
       
  }
  
  /**
   * setMove() tryToMove to spot
   * @param int - x & y space to try to move to, int - playerNum value of player
   * @return aMove - current move (position) is possible
   */
  public boolean setMove(int x, int y, int playerNum) {
    boolean aMove = false;
    
    if(isPosOpen(move))
    {
      Coordinates tempCor = new Coordinates(x,y);
      this.move = tempCor;
      placeInPosition(tempCor, playerNum);
      aMove = true;
    }
    
    return aMove;
  }
  
  /**
   * printOutBoard() prints out the board
   */
  public void printOutBoard()
  {
    for(int y = 0; y < 3; y++)
    {
      for(int x = 0; x < 3; x++)
      {
        System.out.print(board[x][y]);
        System.out.print("\t");
      }
      System.out.println("");
    }
  }
  
  /**
   * getAvailableSpots get all open spots on board
   * @return spots - ArrayList of empty spots to move too
   */
  public ArrayList<Coordinates> getAvailableSpots()
  {
    ArrayList<Coordinates> spots= new ArrayList<Coordinates>();
    for(int y =0; y<3; y++)
    {
      for(int x=0; x<3; x++)
      {
        if(this.isPosOpen(x, y))
        {
            spots.add(new Coordinates(x,y));
        }
      }
    }
    return spots;
  }
  
  /**
   * computerMove() get coordinate for computer to move to
   * @return coordinates - spot for computer to move to
   */
  public Coordinates computerMove()
  {
    Move move = minMaxStuff(-1);
    
    this.setMove(new Coordinates(move.x, move.y), -1);
    
    return new Coordinates(move.x, move.y);
  }
  
  /**
   * minMaxStuff creates tree and then decides which branch to go down in order for computer to win
   * @return move - position to move to along with score for decision making
   */
  public Move minMaxStuff(int player)
  {
    
   //CASES TO STOP RECURSSION---------------------------------------------------------------------------------------
    int winnerStatus = this.checkForWinner();           //get winner num (1-human, -1-computer, 0-draw)
    
    if(winnerStatus==1)                                 //human won
    {
      Move tempMove = new Move();                       //create new move to use with score
      tempMove.setScore(-10);                           //set the score of new move (-10 since perspective of computer)
      return(tempMove);                                 //return the move
    }
    if(winnerStatus==-1)                                //computer won
    {
      Move tempMove = new Move();                       //create new move to use with score
      tempMove.setScore(10);                            //set the score of new move (10 since perspective of computer)
      return(tempMove);                                 //return the move
    }
    if(winnerStatus==0)                                 //draw
    {
      Move tempMove = new Move();                       //create new move to use with score
      tempMove.setScore(0);                             //set the score of new move
      return(tempMove);                                 //return the move
    }
  
    //GENERATE TREE OF MOVES----------------------------------------------------------------------------------------
    //create new list of moves (the tree with its branches)
   ArrayList<Move> moves = new ArrayList<Move>();
   
   //create list of avialable spots for selections
   ArrayList<Coordinates> openSpots = this.getAvailableSpots();
    
   //go through all the available spots
    for(Coordinates s : openSpots)
    {
         Move move = new Move(s.x, s.y);                            //create new move at this location
         
         
         this.setMove(new Coordinates(move.x,move.y), player);      //put a move on board based on newly created move
         
         if(player==-1)                                             //if player is computer
         {
           move.setScore(minMaxStuff(1).score);                     //get score based on human's next move (create a branch)
     
         }
         else                                                       //if player is human
         {
           move.setScore(minMaxStuff(-1).score);                    //get score based on computer's next move (create a branch)
       
         }
         
         moves.add(move);                                           //store result to later check with min max
        
         this.board[s.x][s.y]=0;                                    //reset board to previous state
         
        }
      
    
    //MIN MAX PART---------------------------------------------------------------------------------------------------
    int currentBestMove = 0;                                        //set currentBestMove to zero for now
    if(player==-1)                                                  //if player is computer
    {
     
      int currentBestScore=-500;                                    //set best score to basically negative infinity
      
      for(int i =0; i<moves.size(); i++)                            //go through all the moves found (start going through the branches)
      {
        if(moves.get(i).score > currentBestScore)                   //see if move's score is better than the best score
        {
          currentBestMove=i;                                        //save move location in list 
          currentBestScore=moves.get(i).score;                      //update best score based on move's score
          
        }
      }
    }
    else                                                            //if player is human
    {
      int currentBestScore=500;                                     //set best score to basically positive infinity
      
      for(int i =0; i < moves.size(); i++)                          //go through all the moves found (start going through the branches)
      {
        if(moves.get(i).score < currentBestScore)                   //see if move's score is less than the best score
        {
          currentBestMove=i;                                        //save move location in list
          currentBestScore=moves.get(i).score;                      //update best score based on move's score
          
        }
      } 
    }
    
    return moves.get(currentBestMove);                              //return the best overall move 
  }
}

  


