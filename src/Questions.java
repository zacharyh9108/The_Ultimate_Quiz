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


    // Method to read file data
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

    // Method to handle questions
    public static ArrayList<String> getQuestions(ArrayList<String> questions) {
        ArrayList<String> feedback = new ArrayList<>();
        ArrayList<String> newQuestions = new ArrayList<>(questions);

        for (int i = 0; i < 5; i++) {
            int random = getRandomEvenIndex(newQuestions.size());
            feedback.add(newQuestions.get(random));
            feedback.add(newQuestions.get(random + 1));
            newQuestions.remove(random);
            newQuestions.remove(random);
        }
        return feedback;
    }

    // Helper method to get a random even index
    private static int getRandomEvenIndex(int size) {
        int random;
        do {
            random = (int) (Math.random() * size);
        } while (random % 2 != 0);
        return random;
    }


    public static ArrayList<String> getBBall() {
        return getQuestions(bBallQuestions);
    }

    public static ArrayList<String> getSoccer() {
        return getQuestions(soccerQuestions);
    }

    public static ArrayList<String> getCats() {
        return getQuestions(catQuestions);
    }

    public static ArrayList<String> getDogs() {
        return getQuestions(dogQuestions);
    }

    public static ArrayList<String> getEasy() {
        return getQuestions(easyRiddles);
    }

    public static ArrayList<String> getMed() {
        return getQuestions(medRiddles);
    }

    public static ArrayList<String> getHard() {
        return getQuestions(hardRiddles);
    }

    public static ArrayList<String> getFunFacts() {
        return getQuestions(funFacts);
    }
}
