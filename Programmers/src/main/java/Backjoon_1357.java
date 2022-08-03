import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1357 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(reverseInteger(reverseInteger(numbers[0])+reverseInteger(numbers[1])));
    }

    private static int reverseInteger(int num){
        String reverseNum = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        char[] list = reverseNum.toCharArray();
        for (int i = list.length - 1; i >= 0; i--) {
            result.append(list[i]);
        }

        return Integer.parseInt(result.toString());

    }
}
