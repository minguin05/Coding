package Backjoon_class1_plus_plus;

import java.util.*;

public class Backjoon_2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int[][] test = {{0,0} , {1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0}};
        long multiplyNum = (long)a * b * c;
        int[] splitNum = Arrays.stream(Long.toString(multiplyNum).split("")).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(splitNum).forEach(e-> test[e][1]+=1);

        for (int[] ints : test) {
            System.out.println(ints[1]);
        }


    }
}
