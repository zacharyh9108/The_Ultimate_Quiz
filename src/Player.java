import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Player class represents the statistics of the user and the ArrayList of the score board.
 */
public class Player {
    private static int score;
    private static int totalAnswers;
    private static final ArrayList<String> scoreBoard = getFileData("data/scoreboard");

    /**
     * The getFileData method uses the fileName parameter to convert a file into an ArrayList.
     * @param fileName represents the name of the file.
     * @return returns the new ArrayList.
     */
    public static ArrayList<String> getFileData(String fileName)
    {
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
     * The addScore() method adds one to the total score.
     */
    public static void addScore() {
        score++;
    }

    /**
     * The getScore() method is the getter method for addScore().
     * @return returns the total score
     */
    public static int getScore() {
        return score;
    }

    /**
     * The addTotalAnswers() method adds one to the totalAnswers.
     */
    public static void addTotalAnswers() {
        totalAnswers++;
    }

    /**
     * The getTotalAnswers() method is the getter method for addTotalAnswers().
     * @return returns the total amount of totalAnswers
     */
    public static int getTotalAnswers() {
        return totalAnswers;
    }

    /**
     * The getTotalScore() method will return the total answered right, over the total answered.
     * @return returns the total answered right, over the total answered in fraction form.
     */
    public static String getTotalScore() {
        return getScore() + "/" + getTotalAnswers();
    }

    /**
     * The getTotalScorePct() will perform a calculation to get the percentage of
     * @return returns the percentage of your score without the percent sign.
     */
    public static double getTotalScorePct() {
        return Math.round(((double) getScore() / getTotalAnswers()) * 100 * 100) / 100.0;
    }

    /**
     * The getLeaderBoard() method will compare a user's score to different users on the scoreboard.
     * @return returns the person with the best score.
     */
    public static String getLeaderBoard() {
        String topScorer = null;
        double highestScore = -1.0;
        ArrayList<String> newScoreBoard = scoreBoard;

        for (int i = 0; i < newScoreBoard.size(); i += 2)
        {
            String name = newScoreBoard.get(i);
            String scoreString = newScoreBoard.get(i + 1);
            int correctAnswers = Integer.parseInt(scoreString.substring(0, scoreString.indexOf("/")));
            int totalAnswered = Integer.parseInt(scoreString.substring(scoreString.indexOf("/") + 1));
            double score = Math.round((double)correctAnswers / totalAnswered * 100);

            if (score > highestScore)
            {
                highestScore = score;
                topScorer = name + " with score " + score + "%";
            }
        }
        return topScorer;
    }
}
