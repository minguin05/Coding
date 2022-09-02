import java.util.Scanner;

public class Backjoon_1094 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] stickLength = {64, 32, 16, 8, 4, 2, 1};
        int inputLength = Integer.parseInt(sc.nextLine());
        int stickNum = 0;

        for (int i = 0; i < stickLength.length; i++) {
            if (stickLength[i] <= inputLength) {
                inputLength -= stickLength[i];
                stickNum++;
            }
        }
        System.out.println(stickNum);

    }
}
