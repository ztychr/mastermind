import java.util.Scanner;
import java.util.Arrays;


public class Guess {

    // instance/global variables
    GenerateCode code = new GenerateCode();
    String c1;
    String c2;
    String c3;
    String c4;
    public String[] guesses;

    // method to get guess input from player
    // creates an array of four values with input
    public void Guess() {

        for (int i = 1; i < 11; i++) {

/*
            // prints secret code in the beginning of game
        for (String Element : code.SecretCode) {
            System.out.print(Element + " ");
        }
*/
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your guess.\n");
            System.out.print("color 1: ");
            c1 = in.nextLine();
            System.out.print("color 2: ");
            c2 = in.nextLine();
            System.out.print("color 3: ");
            c3 = in.nextLine();
            System.out.print("color 4: ");
            c4 = in.nextLine();

            guesses = new String[]{c1, c2, c3, c4};

            System.out.print("\nYou have entered: ");
            for (String Element : guesses) {
                System.out.print(Element + " ");
            }
            System.out.println("\n");

            GuessCheck();

            System.out.println("You have used " + i + " of 10 turns.");
        }

        System.out.println("Sorry, you have used your 10 turns without guessing the code.");
        System.out.println("The correct code was: " + Arrays.toString(code.SecretCode));
    }

    // method to match guess inputs with the randomly generated SecretCode array
    public void GuessCheck() {

        int colorCounter;
        int placeCounter;

        colorCounter = 0;
        placeCounter = 0;

        boolean placeTrue;
        placeTrue = false;

        for (int i = 0; i < 4; i++) {

            if (guesses[i].equals(code.SecretCode[i])) {
                placeCounter++;
                placeTrue = true;
            }

            for (int j = 0; j < 4; j++) {

                if (guesses[i].equals(code.SecretCode[j]) && placeTrue == false){

                    colorCounter++;
                    break;
                }
            }
            placeTrue = false;
        }

        if (placeCounter == 4) {

            System.out.println("Congratulations! You have guessed the right code!");
            System.out.println("The correct code was: " + Arrays.toString(code.SecretCode));
            System.exit(0);
        }

        else
        System.out.println(placeCounter + " black pins." + "\n");
        System.out.println(colorCounter + " white pins." + "\n");

    }
}

