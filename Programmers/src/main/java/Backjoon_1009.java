import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<num; i++){
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(getNum(numbers[0], numbers[1]));
        }

    }

    private static int getNum(int a, int b){
        a = (a % 10) == 0 ? 10 : a%10;
        int[][] divideRemain = {{0}, {1}, {6,2,4,8}, {1,3,9,7}, {6, 4}, {5}, {6}, {1, 7,9,3}, {6,8,4,2}, {1, 9}, {10}};
        int repeatNum = divideRemain[a].length;

        return divideRemain[a][b % repeatNum];

    }
}
