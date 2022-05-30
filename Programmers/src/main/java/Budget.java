import java.util.Arrays;

public class Budget {
    public static void main(String[] args){
        int[] arr1 ={1, 3, 2, 5, 4};
        System.out.println(solution(arr1, 9));
        solution(arr1, 9);
    }

    /**
     * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return
     *
     * @param d 각 부서 예산 값
     * @param budget 정해진 예산 총액
     * @return int 지원 가능한 부서의 수
     */
    public static int solution(int[] d, int budget) {
        d = Arrays.stream(d).sorted().toArray();
        int count = 0;

        for (int j : d) {
            if (budget - j > 0 ) {
                budget -= j;
                count++;
            }
        }
        System.out.println("count >> " + count);
        return count;
    }
}
