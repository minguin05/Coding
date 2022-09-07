import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limitNum = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<limitNum; i++){
            int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (a[1]/2 < a[0]) a[0] = a[1] - a[0];
            System.out.println(mathFun(a[0], a[1]));
        }
    }

    private static Long mathFun(int a, int b){
        int remainNum = b;
        Long multipleA = 1L;
        Long multipleB = 1L;
        for(int i = 1; i<= a;i++){
            multipleA *= i;
            multipleB *= remainNum;
            remainNum--;
        }

        return multipleB / multipleA;
    }
}
