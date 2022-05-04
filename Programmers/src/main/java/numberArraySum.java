import java.util.Arrays;

public class numberArraySum {
    public static void main(String[] args){
        System.out.println(solution(987));
    }

    /**
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수
     *
     * @param n 자리수
     * @return int 각 자리수의 합
     */
    public static int solution(int n) {
        return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
