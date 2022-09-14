import java.util.Arrays;
import java.util.Collections;

/**
 * Created by minguin on 2022-09-14
 */
public class MakeMinNum {
    public static void main(String[] args){
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println(solution(A,B));
    }

    private static int solution(int[] a, int[] b) {
        Arrays.sort(a);
        Integer[] changeB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(changeB, Collections.reverseOrder());
        int result = 0;
        int minLength = Math.min(a.length, b.length);

        for(int i = 0; i<minLength; i++){
            result += a[i] * changeB[i];
        }

        return result;
    }
}
