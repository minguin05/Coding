package Backjoon_class1;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1000 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum());
    }
}
