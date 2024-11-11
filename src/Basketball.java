import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Basketball {
    private static final ArrayList<String> questions = getFileData("src/BBallQuestions");

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

    public static void askBBallQuestions() {
        Scanner y = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i = i + 2)
        {
            System.out.print(Basketball.questions.get(i));
            String userAnswer = y.nextLine();
            if (userAnswer.equals(Basketball.questions.get(i + 1)))
            {
                System.out.println("You got it correct\n");
            }
            else
            {
                System.out.println("You got it wrong\n");
            }
        }
    }

    public static void visualizeArray()
    {
        System.out.println(questions);
    }
}


