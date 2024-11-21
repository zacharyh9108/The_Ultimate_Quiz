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
    private static final ArrayList<String> funFacts = getFileData("src/FunFacts");


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
        ArrayList<String> newQuestions = bBallQuestions;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * newQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(newQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newQuestions.get(random + 1)))
            {
                newQuestions.remove(random);
                newQuestions.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askSoccer() {
        ArrayList<String> newQuestions = soccerQuestions;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * newQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(newQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newQuestions.get(random + 1)))
            {
                newQuestions.remove(random);
                newQuestions.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askDog() {
        ArrayList<String> newQuestions = dogQuestions;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * newQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(newQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newQuestions.get(random + 1)))
            {
                newQuestions.remove(random);
                newQuestions.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askCat() {
        ArrayList<String> newQuestions = catQuestions;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++)
        {
            do {
                random = (int)(Math.random() * newQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(newQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newQuestions.get(random + 1)))
            {
                newQuestions.remove(random);
                newQuestions.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askEasy() {
        ArrayList<String> newRiddles = easyRiddles;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * newRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(newRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newRiddles.get(random + 1)))
            {
                newRiddles.remove(random);
                newRiddles.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askMed() {
        ArrayList<String> newRiddles = medRiddles;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * newRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(newRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newRiddles.get(random + 1)))
            {
                newRiddles.remove(random);
                newRiddles.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }
    public static void askHard() {
        ArrayList<String> newRiddles = hardRiddles;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * newRiddles.size());
            }
            while (random % 2 != 0);
            System.out.println(newRiddles.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newRiddles.get(random + 1)))
            {
                newRiddles.remove(random);
                newRiddles.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void askFunFacts() {
        ArrayList<String> newQuestions = funFacts;
        Scanner s = new Scanner(System.in);
        int random;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * newQuestions.size());
            }
            while (random % 2 != 0);
            System.out.println(newQuestions.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(newQuestions.get(random + 1)))
            {
                newQuestions.remove(random);
                newQuestions.remove(random);
                Player.addTotalAnswers();
                Player.addScore();
                System.out.println("You got it correct\n");
            }
            else
            {
                Player.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        }
    }
}

