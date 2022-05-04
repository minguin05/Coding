import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SquareRoot {
    public static void main(String[] args){
        System.out.println(solution(253));
    }


    /**
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
     * @param n
     * @return long
     */
    public static long solution(long n) {
        return (int)Math.sqrt(n) == Math.sqrt(n) ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
