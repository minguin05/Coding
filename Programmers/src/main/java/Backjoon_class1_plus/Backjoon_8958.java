package Backjoon_class1_plus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon_8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limitNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < limitNum; i++) {
            String[] quizResult = sc.nextLine().split("");
            System.out.println(resultScore(quizResult));
        }
        System.out.println();
    }

    private static int resultScore(String[] quizResult){
        int sumScore = 0;
        int middleScore = 0;
        List<Integer> middleScoreSave = new ArrayList<>();
        for (String s : quizResult) {
            if (s.equals("O")) {
                middleScore += 1;
            } else if (s.equals("X")) {
                if (middleScore != 0) {
                    middleScoreSave.add(middleScore);
                    middleScore = 0;
                }
            }
        }
        if (quizResult[quizResult.length - 1].equals("O")) {
            middleScoreSave.add(middleScore);
        }

        for (Integer integer : middleScoreSave) {
            for (int j = 1; j <= integer; j++) {
                sumScore += j;
            }
        }


        return sumScore;
    }
}
