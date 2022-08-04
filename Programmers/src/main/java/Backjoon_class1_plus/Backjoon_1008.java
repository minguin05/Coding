package Backjoon_class1_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((double) numbers[0]/numbers[1]);

    }
}
