import java.util.Arrays;

public class DotProduct {
    public static void main(String[] args){
        int[] arr1 ={-1,0,1};
        int[] arr2 ={1,0,-1};
        System.out.println(solution(arr1, arr2));
    }

    /**
     * a와 b의 내적을 return
     *
     * @param a int[]
     * @param b int[]
     * @return int
     */
    public static int solution(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= b[i];
        }
        return Arrays.stream(a).sum();
    }
}
