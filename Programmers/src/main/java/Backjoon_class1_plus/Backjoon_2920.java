package Backjoon_class1_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] daJangJo = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(scendingCheck(daJangJo));
    }

    private static String scendingCheck(int[] daJangJo){
        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1,};
        String result = "";

        if (daJangJo[0] == 8) {
            for (int i = 0; i < 8; i++) {
                if(daJangJo[i] != descending[i]){
                    result="mixed";
                    break;
                }
                result = "descending";
            }
        }else if(daJangJo[0] == 1) {
            for (int i = 0; i < 8; i++) {
                if(daJangJo[i] != ascending[i]){
                    result="mixed";
                    break;
                }
                result = "ascending";
            }
        }else{
            result = "mixed";
        }

        return result; // 해당 값의 첫번째 값이 0일 경우 제거하고 리턴
    }
}
