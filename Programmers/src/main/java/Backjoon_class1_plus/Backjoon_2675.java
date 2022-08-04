package Backjoon_class1_plus;

import java.util.Scanner;

public class Backjoon_2675 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limitNum = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<limitNum; i++){
            String[] params = sc.nextLine().split(" ");
            System.out.println(repeatString(Integer.parseInt(params[0]), params[1]));
        }

    }

    private static String repeatString(int num, String lineString) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<lineString.length();i++){
            for(int k=0; k<num; k++){
                sb.append(lineString.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
