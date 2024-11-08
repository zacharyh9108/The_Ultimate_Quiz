import java.util.ArrayList;
import java.util.Scanner;

public class Basketball {
    private static ArrayList<String> questions = new ArrayList<>();

    public static void getBBallQuestions() {
        questions.add("How many players are on the court in a middle of the game?");
        questions.add("10");
    }
    public static void askBBallQuestions() {
        Scanner y = new Scanner(System.in);
        System.out.print(questions.get(0));
        String userAnswer = y.nextLine();
    }
}
