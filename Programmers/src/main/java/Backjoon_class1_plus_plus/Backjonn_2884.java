package Backjoon_class1_plus_plus;

import java.util.Scanner;

public class Backjonn_2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hourNum = sc.nextInt();
        int minuteNum = sc.nextInt();
        int[] returnTime = {0,0};

        if(minuteNum < 45) {
            returnTime[0] = hourNum - 1;
            returnTime[1] = (minuteNum - 45) + 60;
        }else{
            returnTime[0] = hourNum;
            returnTime[1] = minuteNum - 45;
        }

        if(returnTime[0] < 0 ) returnTime[0] = 23;

        System.out.println(returnTime[0] + " " + returnTime[1]);


    }
}
