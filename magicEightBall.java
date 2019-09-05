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
        System.out.println(location);
    }

    // RUN PROGRAM #################################################################

    public static void main(String[] args) {
        gatherAndStoreInput();
        testIfQuestion(Global.questionAskedByUser);
    }
}