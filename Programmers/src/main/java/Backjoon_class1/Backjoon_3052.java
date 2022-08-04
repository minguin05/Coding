package Backjoon_class1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Backjoon_3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        Map<Integer, Integer> remain = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt()%42;
        }

        Arrays.stream(numbers)
                .forEach(element ->
                        remain.put(element, remain.getOrDefault(element,0)+1)); // 나눈 값이 같은 경우  +1 저장 아닐 경우 새로 저장

        System.out.println(remain.size());

    }


}
