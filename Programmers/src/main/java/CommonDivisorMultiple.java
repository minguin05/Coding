import java.util.Arrays;

import java.lang.Math;

public class CommonDivisorMultiple {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(60, 48)));
    }

    /**
     * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수
     *
     * @param n
     * @param m
     * @return 최대공약수, 최소공배수
     */
    public static int[] solution(int n, int m) {
        int[] answer = {1, 1};
        // 에라토스테네스의 체
        int N = 1000000;
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int divisorMax = max;
        int divisorMin = min;

        boolean[] isNotPrime = new boolean[N+1];
        isNotPrime[0] = isNotPrime[1] = true;

        for(int i = 2; i*i<=N;i++){
            if (!isNotPrime[i]) {
                for(int j = i*i; j<=N; j+=i) isNotPrime[j] = true;
            }
        }


        for (int i = 2; i < divisorMax; i++) {
            if(!isNotPrime[i]){
                while (true) {
                    if (divisorMax % i == 0 && divisorMin % i == 0) {
                        answer[0] *= i;
                        divisorMax /= i;
                        divisorMin /= i;
                    }else{
                        break;
                    }
                }
            }

        }
        answer[1] = max * min / answer[0];


        return answer;
    }
}
