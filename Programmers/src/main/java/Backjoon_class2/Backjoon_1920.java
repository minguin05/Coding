package Backjoon_class2;

import java.util.*;

public class Backjoon_1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> test = new HashMap<>();

        sc.nextLine();
        Arrays.stream(sc.nextLine().split(" ")).forEach(element-> test.put(element, 0));
        sc.nextLine();

        String[] mArray = sc.nextLine().split(" ");

        for(String s : mArray){
            if(test.get(s) != null)
                System.out.println(1);
            else System.out.println(0);
        }

    }
}
