import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1225 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int[] a = Arrays.stream(nums[0].split("")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(nums[1].split("")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Long> minguin = new ArrayList<>();
        minguin.add(0, 0L);

        Arrays.stream(a).forEach(element-> Arrays.stream(b).forEach(bElement -> {
            Long data = minguin.get(0);
            minguin.set(0, data + ((long) element * bElement));
        }));

        System.out.println(minguin.get(0));

    }
}
