package Backjoon_class1_plus;

import java.util.Scanner;

public class Backjoon_2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int result=0;
        int resultIndex=0;
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        int[][] max = new int[9][1];
        int index = 0;
        max[index][0] = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max[index][0]){
                max[index][0] = 0;
                index = i;
                max[index][0] = numbers[i];
            }
        }

        for (int i = 0; i < max.length; i++) {
            if(max[i][0] != 0){
                result = max[i][0];
                resultIndex = i+1;
            }
        }

        System.out.println(result);
        System.out.println(resultIndex);

    }
}
