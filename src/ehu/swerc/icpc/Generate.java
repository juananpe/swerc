package ehu.swerc.icpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        boolean correct = true;

        while (correct) {
            List<String> topic = new ArrayList<>();
            // generate random number between 2 and 500
            int N = new Random().nextInt(499) + 2;

            // generate random number between 1 and 500
            int M = new Random().nextInt(500) + 1;

            Random rand = new Random();
            System.out.println(N + " " + M);
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < M; j++) {
                    sb.append(rand.nextInt(2));
                }
                topic.add(sb.toString());
            }
            List<Integer> list1 = Result.acmTeam(topic);
            List<Integer> list2 = ResultIncorrect.acmTeam(topic);
            // compare lists
            if (list1.get(0).intValue() != list2.get(0).intValue() || list1.get(1).intValue() != list2.get(1).intValue()) {
                System.out.println("Wrong answer");
                correct = false;
                System.out.println("Correct: " + list1);
                System.out.println("Incorrect: " + list2);
                // print topic
                for (String s : topic) {
                    System.out.println(s);
                }
            }
        }
    }
}
