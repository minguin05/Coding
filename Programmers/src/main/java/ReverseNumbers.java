import java.util.Arrays;
import java.util.Collections;

public class ReverseNumbers {
    public static void main(String[] args){
        System.out.println(solution(118372));
    }

    /**
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴
     *
     * @param n 전달받은 숫자
     * @return long
     */
    public static long solution(long n) {
        StringBuilder newNumber = new StringBuilder();
        Arrays.stream(Long.toString(n).split("")).sorted(Collections.reverseOrder()).mapToInt(Integer::parseInt).forEach(newNumber::append);

        return Long.parseLong(newNumber.toString());
    }
}
