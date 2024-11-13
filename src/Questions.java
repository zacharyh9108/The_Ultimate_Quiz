import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Questions {
    private static final ArrayList<String> bBallQuestions = getFileData("src/BBallQuestions");
    private static final ArrayList<String> soccerQuestions = getFileData("src/SoccerQuestions");
    private static final ArrayList<String> catQuestions = getFileData("src/CatQuestions");
    private static final ArrayList<String> dogQuestions = getFileData("src/DogQuestions");
    private static final ArrayList<String> easyRiddles = getFileData("src/EasyRiddles");
    private static final ArrayList<String> medRiddles = getFileData("src/MediumRiddles");
    private static final ArrayList<String> hardRiddles = getFileData("src/HardRiddles");
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
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * bBallQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.bBallQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.bBallQuestions.get(random + 1)))
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
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * soccerQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.soccerQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.soccerQuestions.get(random + 1)))
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
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * dogQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.dogQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.dogQuestions.get(random + 1)))
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
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * catQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.catQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.catQuestions.get(random + 1)))
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

    public static void askEasy() {
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * easyRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.easyRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.easyRiddles.get(random + 1)))
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

    public static void askMed() {
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * medRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.medRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.medRiddles.get(random + 1)))
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
    public static void askHard() {
        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * hardRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(Questions.hardRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equals(Questions.hardRiddles.get(random + 1)))
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
        score++;
        return score;
    }


    public static int countTotalAnswers() {
        totalAnswers++;
        return totalAnswers;
    }

    public static void visualizeArray()
    {
        System.out.println(bBallQuestions);
    }
}

