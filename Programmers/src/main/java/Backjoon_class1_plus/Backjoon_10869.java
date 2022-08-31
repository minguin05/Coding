package Backjoon_class1_plus;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(nums[0]+nums[1]);
        System.out.println(nums[0]-nums[1]);
        System.out.println(nums[0]*nums[1]);
        System.out.println(nums[0]/nums[1]);
        System.out.println(nums[0]%nums[1]);

    }
}
