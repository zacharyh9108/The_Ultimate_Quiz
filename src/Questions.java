import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The Questions class represents the multiple ArrayList of different quiz topics.
 */
public class Questions {
    private static final ArrayList<String> bBallQuestions = getFileData("src/BBallQuestions");
    private static final ArrayList<String> soccerQuestions = getFileData("src/SoccerQuestions");
    private static final ArrayList<String> catQuestions = getFileData("src/CatQuestions");
    private static final ArrayList<String> dogQuestions = getFileData("src/DogQuestions");
    private static final ArrayList<String> easyRiddles = getFileData("src/EasyRiddles");
    private static final ArrayList<String> medRiddles = getFileData("src/MediumRiddles");
    private static final ArrayList<String> hardRiddles = getFileData("src/HardRiddles");
    private static final ArrayList<String> funFacts = getFileData("src/FunFacts");


    /**
     * The getFileData method uses the fileName parameter to convert a file into an ArrayList.
     * @param fileName represents the name of the file.
     * @return returns the new ArrayList.
     */
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

    /**
     * The getQuestions method will create and return a new ArrayList with 10 elements given the ArrayList questions.
     * @param questions represents a big set of Q&As.
     * @return returns a new ArrayList with 5 questions and 5 answers.
     */
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

    /**
     * The getRandomEvenIndex method will calculate a random even number based on the number of the parameter size.
     * @param size represents the biggest number - 1 you want to be shown.
     * @return returns a randomized even number.
     */
    private static int getRandomEvenIndex(int size) {
        int random;
        do {
            random = (int) (Math.random() * size);
        } while (random % 2 != 0);
        return random;
    }

    /**
     * The getBBall() method uses the getQuestions method with an ArrayList full of basketball
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the bBallQuestions file.
     * @return returns a ArrayList of 5 Q&As about basketball.
     */
    public static ArrayList<String> getBBall() {
        return getQuestions(bBallQuestions);
    }

    /**
     * The getSoccer() method uses the getQuestions method with an ArrayList full of soccer
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the soccerQuestions file.
     * @return returns a ArrayList of 5 Q&As about soccer.
     */
    public static ArrayList<String> getSoccer() {
        return getQuestions(soccerQuestions);
    }

    /**
     * The getCats() method uses the getQuestions method with an ArrayList full of cat
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the catQuestions file.
     * @return returns an ArrayList of 5 Q&As about cats.
     */
    public static ArrayList<String> getCats() {
        return getQuestions(catQuestions);
    }

    /**
     * The getDogs() method uses the getQuestions method with an ArrayList full of dog
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the dogQuestions file.
     * @return returns an ArrayList of 5 Q&As about dogs.
     */
    public static ArrayList<String> getDogs() {
        return getQuestions(dogQuestions);
    }

    /**
     * The getEasy() method uses the getQuestions method with an ArrayList full of easy riddle
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the easyRiddles file.
     * @return returns an ArrayList of 5 Q&As containing easy riddles.
     */
    public static ArrayList<String> getEasy() {
        return getQuestions(easyRiddles);
    }

    /**
     * The getMed() method uses the getQuestions method with an ArrayList full of medium riddle
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the medRiddles file.
     * @return returns an ArrayList of 5 Q&As containing medium riddles.
     */
    public static ArrayList<String> getMed() {
        return getQuestions(medRiddles);
    }

    /**
     * The getHard() method uses the getQuestions method with an ArrayList full of hard riddle
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the hardRiddles file.
     * @return returns an ArrayList of 5 Q&As containing hard riddles.
     */
    public static ArrayList<String> getHard() {
        return getQuestions(hardRiddles);
    }

    /**
     * The getFunFacts() method uses the getQuestions method with an ArrayList full of fun fact
     * related Q&As to make a new ArrayList with a random set of 5 Q&As from the funFacts file.
     * @return returns an ArrayList of 5 Q&As containing fun facts.
     */
    public static ArrayList<String> getFunFacts() {
        return getQuestions(funFacts);
    }
}
