import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetPrimeNumber {
    public static void main(String[] args){
        System.out.println(solution(5));
    }


    /**
     * 에라토스테네스의 체를 활용하여 소수의 숫자를 구하는 함수
     *
     * @param n 기준 숫자
     * @return int 소수의 개수
     */
    public static int solution(int n) {
        String[] isPrime = new String[n+1];
        ArrayList<Integer> primeNumber = new ArrayList<>();

        // 소수일 때 "true" 아닐 때 null
        isPrime[0] = isPrime[1] = "true";

        for(int i=2; i*i<=n; i++){
            if(isPrime[i] == null){
                for(int j=i*i; j<=n; j+=i) isPrime[j]="true";
            }
        }

        return Collections.frequency(Arrays.asList(isPrime), null);
    }
}
