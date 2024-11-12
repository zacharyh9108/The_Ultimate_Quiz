import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Questions {
    private static final ArrayList<String> bBallQuestions = getFileData("src/BBallQuestions");
    private static final ArrayList<String> soccerQuestions = getFileData("src/SoccerQuestions");
    private static final ArrayList<String> catQuestions = getFileData("src/CatQuestions");
    private static final ArrayList<String> dogQuestions = getFileData("src/DogQuestions");
    private static int score;
    private static int totalAnswers;

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try
        {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine())
            {
                String line = s.nextLine();
                if (!line.isEmpty())
                {
                    fileData.add(line);
                }
            }
            return fileData;
        }
        catch (FileNotFoundException e)
        {
            return fileData;
        }
    }

    public static void askBBall() {
        Scanner y = new Scanner(System.in);
        for (int i = 0; i < bBallQuestions.size(); i = i + 2)
        {
            System.out.print(Questions.bBallQuestions.get(i));
            String userAnswer = y.nextLine();
            if (userAnswer.equals(Questions.bBallQuestions.get(i + 1)))
            {
                Questions.countTotalAnswers();
                Questions.countScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Questions.countTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askSoccer() {
        Scanner y = new Scanner(System.in);
        for (int i = 0; i < soccerQuestions.size(); i = i + 2)
        {
            System.out.print(Questions.soccerQuestions.get(i));
            String userAnswer = y.nextLine();
            if (userAnswer.equals(Questions.soccerQuestions.get(i + 1)))
            {
                Questions.countTotalAnswers();
                Questions.countScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Questions.countTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askDog() {
        Scanner y = new Scanner(System.in);
        for (int i = 0; i < dogQuestions.size(); i = i + 2)
        {
            System.out.print(Questions.dogQuestions.get(i));
            String userAnswer = y.nextLine();
            if (userAnswer.equals(Questions.dogQuestions.get(i + 1)))
            {
                Questions.countTotalAnswers();
                Questions.countScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Questions.countTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askCat() {
        Scanner y = new Scanner(System.in);
        for (int i = 0; i < catQuestions.size(); i = i + 2)
        {
            System.out.print(Questions.catQuestions.get(i));
            String userAnswer = y.nextLine();
            if (userAnswer.equals(Questions.catQuestions.get(i + 1)))
            {
                Questions.countTotalAnswers();
                Questions.countScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Questions.countTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static int countScore() {
        return score++;
    }

    public static int countTotalAnswers() {
        return totalAnswers++;
    }

    public static void visualizeArray()
    {
        System.out.println(bBallQuestions);
    }
}

