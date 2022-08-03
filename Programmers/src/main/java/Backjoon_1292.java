import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> result = new ArrayList<>();
        int nums = 0;
        for (int i = 1; i <= numbers[1]; i++) {
            for (int k = 1; k <= i; k++) {
                result.add(i);
            }
            if (result.size() > numbers[1]) {
                break;
            }

        }

        for(int j = numbers[0]-1; j< numbers[1]; j++){
            nums+=result.get(j);
        }
        System.out.println(nums);
    }


}
