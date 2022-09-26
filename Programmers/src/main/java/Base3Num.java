/**
 * Created by minguin on 2022-09-23
 */
public class Base3Num {
    public static void main(String[] args){
        int n = 45;
        System.out.println(solution(n));
    }

    private static int solution(int n){
        String base3Num = Integer.toString(n, 3); // 3진수 변환
        int answer = 0;
        for (int i = 0; i < base3Num.length(); i++) {
            answer += Integer.parseInt(String.valueOf(base3Num.charAt(i))) * Math.pow(3, i);
        }
        return answer;
    }


}
