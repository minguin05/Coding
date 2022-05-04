import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class devisorList {
    public static void main(String[] args){
        int[] arr= {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }


    /**
     * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
     * 
     * @param arr 숫자 배열
     * @param divisor 나눌 숫자
     * @return int[]
     */
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> test = new ArrayList<>();

        // enhanced-for ver.
//        for (int i : arr) {
//            if (i % divisor == 0) { // 나누어떨어질 경우에만 리스트에 저장
//                test.add(i);
//            }
//        }

        // stream ver.
        Arrays.stream(arr).forEach(e->{
            if(e % divisor == 0) test.add(e);
        });

        if (test.size() == 0) // 아무런 값이 없을 경우 -1 값을 저장
            test.add(-1);

        return test.stream().sorted().mapToInt(Integer::intValue).toArray(); // 리스트를 배열로 변환하여 반환
    }
}
