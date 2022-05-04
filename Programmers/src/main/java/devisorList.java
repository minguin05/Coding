import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class devisorList {
    public static void main(String[] args){
        int[] arr= {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }


    public static int[] solution(int[] arr, int divisor) {
        List<Integer> test = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                test.add(i);
            }
        }

        if (test.size() == 0)
            test.add(-1);

        return test.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
