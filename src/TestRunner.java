import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {

        ArrayList<String> gfg = new ArrayList<String>();


        gfg.add("0");
        gfg.add("1");

        gfg.add("2");
        gfg.add("3");

        gfg.add("4");
        gfg.add("5");

        gfg.add("6");
        gfg.add("7");

        gfg.add("8");
        gfg.add("9");


        Scanner s = new Scanner(System.in);
        int random = 0;
        for (int i = 0; i < 5; i++) {
            do {
                random = (int)(Math.random() * gfg.size());
            }
            while (random % 2 != 0);
            System.out.println(gfg.get(random));
            String userAnswer = s.nextLine();
            if (userAnswer.equalsIgnoreCase(gfg.get(random + 1)))
            {
                gfg.remove(random);
                System.out.println(gfg);
                gfg.remove((random));
                System.out.println(gfg);
                Questions.addTotalAnswers();
                Questions.addScore();
                System.out.println("You got it correct\n");
            }
            else {
                Questions.addTotalAnswers();
                System.out.println("You got it wrong\n");
            }
        System.out.println("ArrayList : " + gfg);
    }
}}
