import java.util.ArrayList;
import java.util.Arrays;


public class RemoveMinimum {
    public static void main(String[] args){
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    /**
     * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
     *
     * @param arr 정수를 저장한 배열
     * @return int[]
     */
    public static int[] solution(int[] arr) {
        ArrayList<Integer> test = new ArrayList<>();

        if(arr.length == 1){
            test.add(0, -1);
        } else {
            Arrays.stream(arr).forEach(test::add);
            test.remove(test.indexOf(Arrays.stream(arr).min().getAsInt()));
        }

        return test.stream().mapToInt(Integer::intValue).toArray();

    }
}
