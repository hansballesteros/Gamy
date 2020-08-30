import java.util.InputMismatchException;
import java.util.Scanner; 

public class Gamy { 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); 

        // Greet Player 
        // Enter Player Name 
        System.out.print("\nHello there!"); 
        System.out.print("\nEnter Name: "); 
        String name = sc.next(); 

        Player p = new Player(name); 

        int choice = -99;

        // Choose a Game   
        while (choice != 0) { 
            
            p.viewPlayer(); 
            dispMenu(); 
            System.out.print("\n\nChoice: ");   
            
            try {
                choice = sc.nextInt(); 
            } catch (InputMismatchException ime) { 
                System.out.print("\n---Please Enter the Game Number---");
                sc.next(); 
            }

            menuChoice(choice, p); 

        } // end while 

        sc.close(); 

    }

    public static void dispMenu() { 

        System.out.print("\n\nMain Menu");  
        System.out.print("\n<1> Guess the Number"); 
        System.out.print("\n<2> Guess the Word"); 
        System.out.print("\n<3> Quizy"); 
        System.out.print("\n<0> Exit"); 

    }

    public static void menuChoice(int i, Player p) { 

        switch (i) { 
         
            case 0: 
                System.out.print("\n\n\tExit Game."); 
                break; 

            case 1: 
                new GTN(p); 
                break; 

            case 2:
                new GTW(p); 
                break;

            case 3: 
                new Quizy(p); 
                break; 
            
            default: 
                System.out.print("<ERROR> launchGame() Switch Error"); 

        }

    }

}
