import java.util.Arrays;
import java.util.Collections;
import java.util.stream.LongStream;

public class ReverseInt {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(	4329)));
    }


    /**
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
     *
     * @param n 전달받은 함수값
     * @return int[]
     */
    public static int[] solution(long n) {
        // long값을 int 배열로 변경
        int[] preArray = Arrays.stream(Long.toString(n).split("")).mapToInt(Integer::parseInt).toArray();
        int preArrayLength = preArray.length;
        int[] answer = new int[preArrayLength];

        preArrayLength-=1;
        // 순서 뒤집기
        for(int i = 0; i<preArray.length; i++){
            answer[i] = preArray[preArrayLength--];
        }
        return answer;
    }
}
