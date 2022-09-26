import java.util.Arrays;

/**
 * Created by minguin on 2022-09-26
 */
public class SecretMap {
    public static void main(String[] args){
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<arr1.length; i++){
            char[] a = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i]))).toCharArray();
            char[] b = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr2[i]))).toCharArray();
            for (int j = 0; j < n; j++) {
                if(a[j] == '1' || b[j] == '1'){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }

        return answer;
    }
}
