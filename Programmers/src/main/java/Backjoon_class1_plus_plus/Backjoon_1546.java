package Backjoon_class1_plus_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subjectNum = sc.nextInt();
        sc.nextLine();
        double[] subjectScore = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).sorted().toArray();

        for(int i = 0; i<subjectNum; i++){
            subjectScore[i] = subjectScore[i] / subjectScore[subjectNum-1] * 100;
        }

        double result = Arrays.stream(subjectScore).sum() / subjectNum;

        System.out.println(result);


    }
}
