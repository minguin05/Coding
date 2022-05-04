import java.util.Arrays;

public class NumberBetweenSum {
    public static void main(String[] args){
        System.out.println(solution(3, 3));
    }


    /**
     * a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
     *
     * @param a int
     * @param b int
     * @return long 정수의 합
     */
    public static long solution(int a, int b) {
        long answer = 0;
        for(int i=Math.min(a,b); i<=Math.max(a,b); i++){
            answer+=i;
        }
        return answer;
    }
}
