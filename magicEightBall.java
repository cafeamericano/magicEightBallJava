import java.util.Random;
import java.util.Scanner;

public class Global {

    // GLOBAL VARIABLES ###########################################################

    public static String questionAskedByUser = "Will I win the lottery?";

    // FUNCTIONS ##################################################################

    // TAKE IN A QUESTION FROM THE USER
    static void gatherAndStoreInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("I'm a magic eight ball. Ask me a question!");

        // String input
        String name = myObj.nextLine();
        Global.questionAskedByUser = name;
    }

    // VERIFY A QUESTION MARK APPEARS IN THE STRING
    static void testIfQuestion(String context) {
        int location = context.indexOf("?");
        if (location == -1) {
            System.out.println("That wasn't a question!");
        } else {
            System.out.println("Hmmm... let me think about that.");
            Random rand = new Random();
            int n = rand.nextInt(5); 
            //Respond based on random number
            if (n == 0) {
                System.out.println("Things are looking good.");
            }
            else if (n == 1) {
                System.out.println("I'd say definitely.");
            }
            else if (n == 2) {
                System.out.println("It's murky.");
            }
            else if (n == 3) {
                System.out.println("Not looking so good.");
            }
            else if (n == 4) {
                System.out.println("No way.");
            }
        }
    }

    // RUN PROGRAM #################################################################

    public static void main(String[] args) {
        gatherAndStoreInput();
        testIfQuestion(Global.questionAskedByUser);
    }
}