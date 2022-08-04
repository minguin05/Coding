package Backjoon_class1;

import java.util.Scanner;

public class Backjoon_2439 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sc.nextLine();
        for (int i = 0; i < result; i++) {
            int m = result - i-1;
            for (int j = 0; j < result; j++) {
                if(j<m)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
