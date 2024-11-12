import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exitLoop = false;

        System.out.println("Welcome to the Ultimate Quiz!\n");
        System.out.println("The Ultimate Quiz Topics!");
        System.out.println("--------------------");
        System.out.println("- Cats");
        System.out.println("- Dogs");
        System.out.println("- Soccer");
        System.out.println("- Basketball");
        System.out.println("- Riddles");
        System.out.println("--------------------");

        while (!exitLoop) {
            Scanner s = new Scanner(System.in);
            System.out.print("Which quiz would you like to complete?: ");
            String userQuiz = s.nextLine();

            if (userQuiz.equalsIgnoreCase("riddles")) {
                while (!exitLoop)
                {
                    Scanner x = new Scanner(System.in);
                    System.out.print("Easy/Medium/Hard?: ");
                    String difficulty = x.nextLine();

                    if (difficulty.equalsIgnoreCase("easy"))
                    {
                        exitLoop = true;
                        System.out.println("easy");
                    }
                    else if (difficulty.equalsIgnoreCase("medium"))
                    {
                        exitLoop = true;
                        System.out.println("medium");
                    }
                    else if (difficulty.equalsIgnoreCase("hard"))
                    {
                        exitLoop = true;
                        System.out.println("hard");
                    }
                    else
                    {
                        System.out.println("That's not a difficulty, try again\n");
                    }
                }
            }
            else if (userQuiz.equalsIgnoreCase("basketball"))
            {
                exitLoop = true;
                Questions.askBBall();

            }
            else if (userQuiz.equalsIgnoreCase("soccer"))
            {
                exitLoop = true;
                Questions.askSoccer();
            }
            else if (userQuiz.equalsIgnoreCase("dogs"))
            {
                exitLoop = true;
                Questions.askDog();
            }
            else if (userQuiz.equalsIgnoreCase("cats"))
            {
                exitLoop = true;
                Questions.askCat();
            }
            else
            {
                System.out.println("That's not a quiz, try again\n");
            }
        }
        System.out.println("Your final score was: " + Questions.countScore() + " / " + Questions.countTotalAnswers());
    }
}