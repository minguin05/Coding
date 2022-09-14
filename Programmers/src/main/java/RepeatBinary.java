import java.util.Arrays;

/**
 * Created by minguin on 2022-09-14
 */
public class RepeatBinary {
    public static void main(String[] args){
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));
    }

    private static int[] solution(String s) {
        int[] answer = new int[2]; // 반복횟수, 없어진 0의 수

        while(!s.equals("1")){
            int length = s.length();
            int nonZeroNum = s.replaceAll("0", "").length();
            answer[1] += length - nonZeroNum;
            s = Integer.toBinaryString(nonZeroNum);
            answer[0]++;
        }

        return answer;
    }

}
