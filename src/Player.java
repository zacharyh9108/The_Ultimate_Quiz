import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private static String name;
    private static int score;
    private static int totalAnswers;
    private static final ArrayList<String> scoreBoard = getFileData("src/scoreboard");

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

    public Player(String name, int score, int totalAnswers) {
        Player.name = name;
        Player.score = score;
        Player.totalAnswers = totalAnswers;
    }

    public String toString() {
        return "Player: " + name + ", Score: " + score;
    }

    public static void addScore() {
        score++;
    }

    public static int getScore() {
        return score;
    }

    public static void addTotalAnswers() {
        totalAnswers++;
    }

    public static int getTotalAnswers() {
        return totalAnswers;
    }

    public static String getTotalScore() {
        return getScore() + "/" + getTotalAnswers();
    }

    public static double getTotalScorePct() {
        return Math.round((double)(Player.getScore()) / (double)Player.getTotalAnswers() * 100);
    }

    public static String getScoreBoard() {
        String topScorer = null;
        double highestScore = -1.0;
        ArrayList<String> newScoreBoard = scoreBoard;
        for (int i = 0; i < newScoreBoard.size(); i+=2) {
            String name = newScoreBoard.get(i);
            String scoreString = newScoreBoard.get(i + 1);
            int correctAnswers = Integer.parseInt(scoreString.substring(0, scoreString.indexOf("/")));
            int totalAnswered = Integer.parseInt(scoreString.substring(scoreString.indexOf("/") + 1));
            double score = Math.round((double) correctAnswers / totalAnswered * 100);
            if (score > highestScore) {
                highestScore = score;
                topScorer = name + " with score " + score + "%";
            }
        }
        return topScorer;
    }
}