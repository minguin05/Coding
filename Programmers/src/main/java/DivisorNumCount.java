import java.util.ArrayList;

public class DivisorNumCount {
    public static void main(String[] args){
        System.out.println(solution(24, 27));
    }

    /**
     * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return
     *
     * @param left 시작 숫자
     * @param right 끝나는 숫자
     * @return
     */
    public static int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer> divisorArray = new ArrayList<>(); // 각 숫자의 약수를 저장할 ArrayList
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j==0) divisorArray.add(i);
            }
            answer = divisorArray.size() % 2 == 0 ? answer + i : answer - i;
            divisorArray.clear();
        }
        return answer;
    }

}
