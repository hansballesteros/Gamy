import java.util.Scanner; 
import java.util.Random; 

public class GTW { 

    public GTW () { 

    } 

    public GTW (Player p) { 
        launchGame(p);
    }

    public static Player launchGame(Player p) { 

        Scanner sc = new Scanner(System.in); 

        String name = p.getName(); 
        int score = p.getScore(); 

        String[] words = {"Hamburger", "Lettuce", "Pizza", "Computer", "Laptop",
                            "Apple", "Mango", "Fan", "Formula", "Phone"}; 

        String word = words[new Random().nextInt(words.length) ]; 

        String jumbled = "";
        String guess; 
        String temp = word.toLowerCase(); 

        for (int ctr = 0; ctr < word.length(); ctr++) { 

            int randomIndex = new Random().nextInt(temp.length() ); 

            jumbled += temp.charAt(randomIndex); 

            temp = ( temp.substring(0, randomIndex) +
                        temp.substring(randomIndex+1) ); 

        }

        do { 

            System.out.print("\n\nWord: " + jumbled);
            System.out.print("\nGuess: "); 
            guess = sc.next(); 

        } while (!guess.equalsIgnoreCase(word) ); // end do while  

        System.out.print("\n\n========================"); 
        System.out.print("\nCongrats " + name + "!"); 
        System.out.print("\n\nThe word was: " + word); 
        System.out.print("\n========================"); 

        score++;
        p.setScore(score);

        return p; 

    } // end launchGame() 

}