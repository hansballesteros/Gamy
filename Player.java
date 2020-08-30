public class Player {
    
    private String name; 
    private int score; 

    public Player() { 

    } 

    public Player(String name) { 
       
        this.name = name; 
        this.score = 0; 
        
    }
 
    public void viewPlayer() { 
        System.out.print("\n\n\t|Player: " + this.name + 
                            " |Score: " + this.score); 
    }

    public void setName(String name) {
        this.name = name; 
    } 

    public void setScore(int score) { 
        this.score = score; 
    } 

    public String getName() { 
        return name;
    } 

    public int getScore() { 
        return score;
    }

}   