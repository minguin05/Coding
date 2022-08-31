package Backjoon_class1_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String numCount = sc.nextLine();

        System.out.print(Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).sum());

    }
}
