/**
 * Created by minguin on 2022-09-20
 */
public class ExpressionNumber {
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n){
        int answer = 0; // 결과 횟수
        int partNum = 0; // 각 숫자의 합산값

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                partNum+=j;
                if (partNum == n) {
                    answer++;
                    break;
                } else if (partNum > n) { // 합산 값이 클 경우 계산할 필요가 없으므로 반복 탈출
                    break;
                }
            }
            partNum = 0;
        }

        return answer;
    }
}
