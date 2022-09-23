import java.util.ArrayList;

/**
 * Created by minguin on 2022-09-20
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 99999;
        System.out.println(solution(n));
    }

    private static int solution(int n){
        int answer = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0, 0);
        fibonacci.add(1, 1);

        for (int i = 2; i < n; i++) {
            int fibonacciNum = fibonacci.get(i-1)%1234567+fibonacci.get(i-2)%1234567;
            fibonacci.add(i, fibonacciNum);
        }

        // (A+B)%C = ((A%C) + (B%C)) % C
        return (fibonacci.get(n-1)+fibonacci.get(n-2))%1234567;
    }
}
