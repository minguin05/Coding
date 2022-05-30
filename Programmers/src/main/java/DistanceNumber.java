import java.util.Arrays;

public class DistanceNumber {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(-4, 2)));
    }


    public static long[] solution(int x, int n) {
        long[] result = new long[n];
        for (int i = 1; i <= n; i++) {
            result[i-1] = x * (long)i;
        }
        return result;
    }
}
