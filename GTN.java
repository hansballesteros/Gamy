import java.util.Scanner;
import java.util.Random; 

public class GTN {

    public GTN () { 

    }

    public GTN (Player p) { 
        launchGame(p);
    }

    public static Player launchGame(Player p) {

        Scanner sc = new Scanner(System.in);  

        int num;
        int guess; 

        String name = p.getName(); 
        int score = p.getScore(); 

        System.out.print("\n\nWelcome " + name + 
                            " to Guess the Number!"); 

        num = new Random().nextInt(100);

        do { 

            System.out.print("\n\nGuess: "); 
            guess = sc.nextInt(); 

            if (guess > num) { 
                System.out.print("\n\tLower.."); 
            }   
            
            if (guess < num) { 
                System.out.print("\n\tHigher.."); 
            }   

        } while (guess != num);  //end while 

        System.out.print("\n\n========================"); 
        System.out.print("\nCongrats " + name + "!"); 
        System.out.print("\n\nThe number was: " + num); 
        System.out.print("\n========================"); 

        score++;
        p.setScore(score);

        return p;

     } // end launchGame() 

 }