package Backjoon_class1_plus_plus;

import java.util.Scanner;

public class Backjoon_9498 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int score = sc.nextInt();
        String scoreAlpha = "";

        if(score >= 90) scoreAlpha = "A";
        else if(score >= 80) scoreAlpha = "B";
        else if(score >= 70) scoreAlpha = "C";
        else if(score >= 60) scoreAlpha = "D";
        else scoreAlpha = "F";
        System.out.println(scoreAlpha);
    }
}
