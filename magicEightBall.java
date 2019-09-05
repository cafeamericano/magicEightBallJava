import java.util.Random;
import java.util.Scanner;

public class Global {

    // GLOBAL VARIABLES ###########################################################

    public static String questionAskedByUser = "Will I win the lottery?";

    // FUNCTIONS ##################################################################

    // DRAW THE BALL, BASIC
    static void drawBallBasic() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############     #####     ##############");
        System.out.println("#############    ##   ##    ##############");
        System.out.println("#############    #######    ##############");
        System.out.println("#############    ##   ##    ##############");
        System.out.println("#############     #####     ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // DRAW THE BALL, I'D SAY DEFINITELY
    static void drawBallIdSayDefinitely() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############    I WOULD    ##############");
        System.out.println("#############      SAY      ##############");
        System.out.println("#############   DEFINITELY  ##############");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // DRAW THE BALL, THINGS ARE LOOKING GOOD
    static void drawBallThingsAreLookingGood() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############     THINGS    ##############");
        System.out.println("#############      ARE      ##############");
        System.out.println("#############     LOOKING   ##############");
        System.out.println("#############      GOOD!    ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // DRAW THE BALL, IT'S MURKY
    static void drawBallItsMurky() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############      IT'S     ##############");
        System.out.println("#############      MURKY    ##############");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // DRAW THE BALL, NOT LOOKING SO GOOD
    static void drawBallNotLookingSoGood() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############      NOT      ##############");
        System.out.println("#############    LOOKING    ##############");
        System.out.println("#############      SO       ##############");
        System.out.println("#############     GOOD      ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // DRAW THE BALL, NO WAY
    static void drawBallNoWay() {
        System.out.println("                                          ");
        System.out.println("             ###############              ");
        System.out.println("       ###########################        ");
        System.out.println("     ################################     ");
        System.out.println("  ######################################  ");
        System.out.println(" ######################################## ");
        System.out.println("##########################################");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("#############       NO      ##############");
        System.out.println("#############      WAY!     ##############");
        System.out.println("#############               ##############");
        System.out.println("#############               ##############");
        System.out.println("##########################################");
        System.out.println(" ######################################## ");
        System.out.println("  ######################################  ");
        System.out.println("     ################################     ");
        System.out.println("       ###########################        ");
        System.out.println("             ###############              ");
        System.out.println("                                          ");
    }

    // INSERT LINE BREAK
    static void addLineBreak() {
        System.out.println("                                          ");
    }

    // TAKE IN A QUESTION FROM THE USER
    static void gatherAndStoreInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("I'm a magic eight ball. Ask me about your future!");
        addLineBreak();

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
            // Respond based on random number
            if (n == 0) {
                drawBallIdSayDefinitely();
            } else if (n == 1) {
                drawBallThingsAreLookingGood();
            } else if (n == 2) {
                drawBallItsMurky();
            } else if (n == 3) {
                drawBallNotLookingSoGood();
            } else if (n == 4) {
                drawBallNoWay();
            }
        }
    }

    // RUN PROGRAM #################################################################

    public static void main(String[] args) {
        drawBallBasic();
        gatherAndStoreInput();
        testIfQuestion(Global.questionAskedByUser);
        addLineBreak();
    }
}