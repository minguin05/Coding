package Backjoon_class1_plus_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] checkNum = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        int checkTrueNum = 0;
        for(double i: checkNum){
            checkTrueNum += Math.pow(i, 2);
        }
        System.out.println(checkTrueNum%10);

    }
}
