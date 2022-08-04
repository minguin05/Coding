package Backjoon_class1;

import java.util.Scanner;

public class Backjoon_2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] lineString = sc.nextLine().split(" ");
        System.out.println(reversreNum(lineString));
    }

    private static int reversreNum(String[] nums){
        String a = nums[0];
        String b = nums[1];
        String aReverse = "";
        String bReverse = "";

        for (int i = 2; i >= 0; i--) {
            aReverse += a.charAt(i);
            bReverse += b.charAt(i);
        }

        return Math.max(Integer.parseInt(aReverse), Integer.parseInt(bReverse));
    }
}
