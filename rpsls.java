import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class rpsls {
    //Holds the description of what each character defeats.
    String desc;

    public rpsls(String charDesc) {
        //Constructor for thte rpsls class that sets the desc to 
        //the individual character instances.
        desc = charDesc; 
    }

    public String getUserThrow() {
        //Use the scanner class to get the users throw.
        Scanner obj1 = new Scanner(System.in);
        System.out.println("What is your throw? ");
        //Saves the user's throw
        String userThrow = obj1.nextLine();
        //Close the object
        obj1.close();
        return userThrow;
    }

    public static void main(String[] args) {
        //This array holds the options that a user can select for 
        //the game.
        ArrayList<String> characters = new ArrayList<String>();

        //This adds the string fro each character option.
        characters.add("Rock");
        characters.add("Paper");
        characters.add("Scissors");
        characters.add("Lizard");
        characters.add("Spock");

        //Loop through the arrayList to display the options that the 
        //user may choose from.
        System.out.println("Your options are: ");
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }

        //Create individual instances of the characters that have the 
        //description for what they defeat.
        rpsls Rock = new rpsls("Rock Defeats Scissors and Lizard.");
        rpsls Paper = new rpsls("Paper Defeats Rock and Spock.");
        rpsls Scissors = new rpsls("Scissors Defeats Paper and Lizard.");
        rpsls Lizard = new rpsls("Lizard Defeats Paper and Spock.");
        rpsls Spock = new rpsls("Spock Defeats Rock and Scissors.");

        // Generate a number that will be assigned to a string of 
        //a character
        Random rand = new Random();
        int upper = 4;
        int intRand = rand.nextInt(upper);

        String CPUThrow;

        //Assign the randomly generated number to a string of either 
        //rock, paper, scissors, lizard, or Spock
        if (intRand == 0) {
            CPUThrow = "Rock";
        } else if (intRand == 1) {
            CPUThrow = "Paper";
        } else if (intRand == 2) {
            CPUThrow = "Scissors";
        } else if (intRand == 3) {
            CPUThrow = "Lizard";
        } else {
            CPUThrow = "Spock";
        }

        // Get user input
        rpsls user = new rpsls("");
        String userThrow = user.getUserThrow();
        
        //if statement is structured such that it will test if the user
        //won and test each case in which the user would win. Else it 
        //outputs that the CPU won.
        String result;

        if (userThrow.equals(CPUThrow)) 
        {
            //if there is a tie
            System.out.println("CPU throws: " + CPUThrow);
            result = "It's a Tie!";
            System.out.println(result);
        } else if (userThrow.equals("Rock") && 
        (CPUThrow.equals("Scissors") || CPUThrow.equals("Lizard"))) 
        {
            //circumstances for if rock were to win
            System.out.println("CPU throws: " + CPUThrow);
            result = "User Wins!";
            System.out.println(result);
            System.out.println(Rock.desc);
        } else if (userThrow.equals("Paper") && 
        (CPUThrow.equals("Rock") || CPUThrow.equals("Spock"))) 
        {
            //Circumstances for if paper were to win
            System.out.println("CPU throws: " + CPUThrow);
            result = "User Wins!";
            System.out.println(result);
            System.out.println(Paper.desc);
        } else if (userThrow.equals("Scissors") && 
        (CPUThrow.equals("Paper") || CPUThrow.equals("Lizard"))) 
        {
            //Circumstances for if Scissors were to win
            System.out.println("CPU throws: " + CPUThrow);
            result = "User Wins!";
            System.out.println(result);
            System.out.println(Scissors.desc);
        } else if (userThrow.equals("Lizard") && 
        (CPUThrow.equals("Paper") || CPUThrow.equals("Spock"))) 
        {
            //Circumstances for if Lizard were to win
            System.out.println("CPU throw: " + CPUThrow);
            result = "User Wins!";
            System.out.println(result);
            System.out.println(Lizard.desc);
        } else if (userThrow.equals("Spock") && 
        (CPUThrow.equals("Rock") || CPUThrow.equals("Scissors"))) 
        {
            //Circumstances for it Spock were to win
            System.out.println("CPU throws: " + CPUThrow);
            result = "User Wins!";
            System.out.println(result);
            System.out.println(Spock.desc);
        } else {
            //If user doesn't win then CPU wins
            System.out.println("CPU throws: " + CPUThrow);
            result = "CPU Wins!";
            System.out.println(result);
        }
        
    }
}
