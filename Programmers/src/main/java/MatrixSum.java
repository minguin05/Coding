import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixSum {
    public static void main(String[] args){
        int[][] arr1 ={{1,2},{2,3}};
        int[][] arr2 ={{3,4},{5,6}};
        int[][] arr3 ={{1},{2}};
        int[][] arr4 ={{3},{4}};
        int[][] arr5 ={{1,2,3},{3,4,5}};
        int[][] arr6 ={{1,2,3},{3,4,5}};
        System.out.println(Arrays.deepToString(solution(arr5, arr6)));
    }


    /**
     *  2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수
     *
     * @param arr1 매개변수 1
     * @param arr2 매개변수 2
     * @return 합계 정보
     */
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i].length == 1){
                answer[i][0] = Arrays.stream(arr1[i]).toArray()[0] + Arrays.stream(arr2[i]).toArray()[0];
            } else{
                for(int j = 0; j<arr1[i].length; j++){
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        return answer;
    }
}
