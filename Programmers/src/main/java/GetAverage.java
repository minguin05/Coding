import java.util.Arrays;

public class GetAverage {
    public static void main(String[] args){
        int[] arr = {5,5};
        System.out.println(solution(arr));
    }


    /**
     * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수
     * @param arr 전달받은 배열
     * @return double
     */
    public static double solution(int[] arr) {
//        for문 활용
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        return (double) sum/arr.length;
        // stream 활용
         return Arrays.stream(arr).average().getAsDouble();
    }
}
