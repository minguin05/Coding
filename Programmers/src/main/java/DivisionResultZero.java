public class DivisionResultZero {
    public static void main(String[] args){
        int n = 12;
        System.out.println(solution(n));
    }

    /**
     * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
     *
     * @param n 나누어질 숫자
     * @return 나머지가 1이 되는 숫자
     */
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
