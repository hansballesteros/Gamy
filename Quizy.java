import java.util.Scanner; 

public class Quizy { 

    public Quizy () { 

    } 

    public Quizy (Player p) { 
        launchGame(p);
    }

    public static Player launchGame(Player p) { 

        Scanner sc = new Scanner(System.in); 

        String name = p.getName(); 
        int score = p.getScore(); 

        String[] q = { "What is the First Letter \n\tof the English Alphabet?" +
                        "\n\ta) A \tb) B",
                                "a) A", 
                                "b) B",
                                "a" };

        String question = q[0];
        String ans = q[3]; 

        String answer = "";

        System.out.print("\n\nQuestion: "); 
        System.out.print("\n\t" + question); 

        while (!answer.equalsIgnoreCase(ans) ) { 
            
            System.out.print("\n\nAnswer: " ); 
            answer = sc.next(); 

        }

        System.out.print("\n\n========================"); 
        System.out.print("\nCongrats " + name + "!"); 
        System.out.print("\n\nThe first letter of" +
                            "\nthe English Alphabet is A.");
        System.out.print("\n========================"); 

        score++;
        p.setScore(score);

        return p; 

    } // end psvm 

} 
