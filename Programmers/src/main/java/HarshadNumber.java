import java.util.Arrays;

public class HarshadNumber {
    public static void main(String[] args){
        int[] arr = {5,5};
        System.out.println(solution(12));
    }

    /**
     *
     * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수
     *
     * @param x  자연수 x
     * @return boolean 하샤드 수인지 반환
     */
    public static boolean solution(int x) {
        // stream ver.
//        return x % Arrays.stream(Integer.toString(x).split("")).mapToInt(Integer::parseInt).sum() == 0;
        String[] test = String.valueOf(x).split("");
        int sum = 0;
        for(String s : test){
            sum += Integer.parseInt(s);
        }

        return x % sum == 0;
    }
}
