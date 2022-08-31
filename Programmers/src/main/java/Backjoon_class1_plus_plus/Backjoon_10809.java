package Backjoon_class1_plus_plus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Backjoon_10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text= sc.nextLine();
        String[] inputText = text.split("");
        int[] returnArray = new int[26];
        Map<String, Integer> result = new HashMap<>();

        Arrays.stream(inputText).forEach(
                element-> result.put(element, text.indexOf(element))
        );
        for(int i =0; i<26 ; i++){
            char s = (char) (i+97);
            if(result.get(String.valueOf(s)) != null){
                returnArray[i] = result.get(String.valueOf(s));
            }else{
                returnArray[i] = -1;
            }
        }

        for(int i: returnArray){
            System.out.print(i + " ");
        }

    }
}
