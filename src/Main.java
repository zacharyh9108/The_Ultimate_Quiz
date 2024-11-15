import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Ultimate Quiz!\n");
        System.out.println("The Ultimate Quiz Topics!");
        System.out.println("--------------------");
        System.out.println("- Cats");
        System.out.println("- Dogs");
        System.out.println("- Soccer");
        System.out.println("- Basketball");
        System.out.println("- Riddles");
        System.out.println("--------------------");

        String userQuiz;
        do {
            boolean exitLoop = false;
            Scanner s = new Scanner(System.in);
            System.out.print("Which quiz would you like to complete?(-1 to exit): ");
            userQuiz = s.nextLine();
            if (userQuiz.equalsIgnoreCase("riddles")) {
                while (!exitLoop) {
                    Scanner x = new Scanner(System.in);
                    System.out.print("Easy/Medium/Hard?: ");
                    String difficulty = x.nextLine();

                    if (difficulty.equalsIgnoreCase("easy")) {
                        exitLoop = true;
                        Questions.askEasy();
                    } else if (difficulty.equalsIgnoreCase("medium")) {
                        exitLoop = true;
                        Questions.askMed();
                    } else if (difficulty.equalsIgnoreCase("hard")) {
                        exitLoop = true;
                        Questions.askHard();
                    } else {
                        System.out.println("That's not a difficulty, try again\n");
                    }
                }
            } else if (userQuiz.equalsIgnoreCase("basketball")) {
                exitLoop = true;
                Questions.askBBall();

            } else if (userQuiz.equalsIgnoreCase("soccer")) {
                exitLoop = true;
                Questions.askSoccer();
            } else if (userQuiz.equalsIgnoreCase("dogs")) {
                exitLoop = true;
                Questions.askDog();
            } else if (userQuiz.equalsIgnoreCase("cats")) {
                exitLoop = true;
                Questions.askCat();
            } else if (!userQuiz.equals("-1")){
                System.out.println("That's not a quiz, try again\n");
            }
        }
        while (!userQuiz.equals("-1"));
        if (Questions.getTotalAnswers() == 0) {
            System.out.println("You did not do any quizzes");
        }
        else if(Questions.getScore() == 0 && Questions.getTotalAnswers() > 0) {
            System.out.println("You got a zero\nDo your homework next time");
        }
        else if(Questions.getScore() == Questions.getTotalAnswers()) {
            System.out.println("You did perfect!");
            System.out.println("Your final score was: " + Questions.getScore() + " / " + Questions.getTotalAnswers());
        }
        else {
            System.out.println("Your final score was: " + Questions.getScore() + " / " + Questions.getTotalAnswers());
        }
    }
}