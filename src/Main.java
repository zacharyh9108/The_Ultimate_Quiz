import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exitLoop = false;
        String userName;

        do
        {
            Scanner y = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            userName = y.nextLine();
            if (userName.length() > 10)
            {
                System.out.println("Username too long!\n");
            } else
            {
                exitLoop = true;
            }
        }
        while (!exitLoop);

        System.out.println("Leaderboard");
        String topScorer = Player.getLeaderBoard();
        System.out.println("Top Scorer: " + topScorer);
        System.out.println();

        System.out.println("Welcome to the Ultimate Quiz!\n");
        System.out.println("The Ultimate Quiz Topics!");
        System.out.println("--------------------");
        System.out.println("- Cats");
        System.out.println("- Dogs");
        System.out.println("- Soccer");
        System.out.println("- Basketball");
        System.out.println("- Riddles");
        System.out.println("- Fun Facts");
        System.out.println("--------------------");

        String userQuiz;
        do
        {
            exitLoop = false;
            Scanner s = new Scanner(System.in);
            System.out.print("Which quiz would you like to complete?(-1 to exit): ");
            userQuiz = s.nextLine();

            if (userQuiz.equalsIgnoreCase("riddles"))
            {
                while (!exitLoop)
                {
                    Scanner x = new Scanner(System.in);
                    System.out.print("Easy/Medium/Hard?: ");
                    String difficulty = x.nextLine();

                    if (difficulty.equalsIgnoreCase("easy"))
                    {
                        exitLoop = true;
                        askQuestions(Questions.getEasy());
                    } else if (difficulty.equalsIgnoreCase("medium"))
                    {
                        exitLoop = true;
                        askQuestions(Questions.getMed());
                    } else if (difficulty.equalsIgnoreCase("hard"))
                    {
                        exitLoop = true;
                        askQuestions(Questions.getHard());
                    } else
                    {
                        System.out.println("That's not a difficulty, try again\n");
                    }
                }
            } else if (userQuiz.equalsIgnoreCase("basketball"))
            {
                askQuestions(Questions.getBBall());

            } else if (userQuiz.equalsIgnoreCase("soccer"))
            {
                askQuestions(Questions.getSoccer());
            } else if (userQuiz.equalsIgnoreCase("dogs"))
            {
                askQuestions(Questions.getDogs());
            } else if (userQuiz.equalsIgnoreCase("cats"))
            {
                askQuestions(Questions.getCats());
            }
            else if (userQuiz.equalsIgnoreCase("fun facts"))
            {
                askQuestions(Questions.getFunFacts());
            }else if (!userQuiz.equals("-1"))
            {
                System.out.println("That's not a quiz, try again\n");
            }
        }
        while (!userQuiz.equals("-1"));

        double finalAnswer = Player.getTotalScorePct();
        String score = Player.getTotalScore();

        if (Player.getTotalAnswers() == 0)
        {
            System.out.println("\nYou did not do any quizzes");
        }
        else if(Player.getScore() == 0 && Player.getTotalAnswers() > 0)
        {
            System.out.println("\nYou got a zero!\nDo your homework next time... " + userName);
        }
        else if(Player.getScore() == Player.getTotalAnswers())
        {
            System.out.println("\nYou did perfect " + userName + "!");
            System.out.println("Your final score was: " + score);
            System.out.println(finalAnswer + "% !!!!");
        }
        else
        {
            System.out.println("\nYour final score was: " + score);
            if (finalAnswer >= 80)
            {
                System.out.println("Good job!\nYou got: " + finalAnswer + "%");
            }
            else
            {
                System.out.println("You got: " + finalAnswer + "%");
            }
        }

        if (Player.getScore() >= 15 && Player.getTotalAnswers() >= 15)
        {
            try (FileWriter fw = new FileWriter("src/Scoreboard", true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(userName);
                out.println(score);
            } catch (IOException e) {
                //
            }
        }
    }

    // Method to ask questions and review answers
    public static void askQuestions(ArrayList<String> questions) {
        for (int i = 0; i < 10; i+=2) {
            String answer = questions.get(i + 1);
            Scanner s = new Scanner(System.in);
            System.out.print(questions.get(i));
            String userAnswer = s.nextLine();
            if (userAnswer.toLowerCase().contains(answer)) {
                Player.addScore();
                Player.addTotalAnswers();
                System.out.println("You got it correct!\n");
            } else {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }
}
