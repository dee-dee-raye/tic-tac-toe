package PD;

public class Player {
  
  private String name;
  private int wins;
  private int losses;
  private enum Type {HUMAN, COMPUTER};
  private Type typeOfPlayer;
  private int best;
  
  public Player(String name, boolean isHuman)
  {
    this.setName(name);
    
    if(isHuman)
    {
      this.typeOfPlayer =  Type.HUMAN;
    }
    else
    {
      this.typeOfPlayer = Type.COMPUTER;
    }
    
    this.wins=0;
    this.losses=0;
    setBest(0);
    
      
  }
  
  
 
 


  /**
   * getName() return the name of player
   * @return name - name of player
   */
  public String getName() {
    return name;
  }

  /**
   * setName() update name of player
   * @param name - new name of player
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * getBest() return the best score of player
   * @return best - best score of player
   */
  public int getBest() {
    return best;
  }

  /**
   * setBest() set best score of player
   * @param best - new best score of player
   */
  public void setBest(int best) {
    this.best = best;
  }
  

}
