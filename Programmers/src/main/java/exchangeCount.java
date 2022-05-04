import java.util.Arrays;
import java.util.Comparator;

public class exchangeCount {

    public static void main(String[] args){
        String[] strings = new String[]{"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(solution(3, 20,4));
    }


    /**
     * 파라미터 값을 통해 거스름돈을 계산하여 전달하는 문제
     * price(1+2+...+count) 놀이기구 탈 때 필요한 가격을 계산하는 공식으로 풀이
     *
     * @param price 놀이기구 가격
     * @param money 가지고 있는 돈
     * @param count 반복해서 탈 횟수
     * @return 거스름돈
     */
    public static long solution(int price, int money, int count){
        long answer = -1;

        long countNum = 0; // 공식 내 괄호 값
        for(int i = 1; i<count+1; i++){
            countNum += i;
        }

        long totalPrice = countNum * price;

        answer = totalPrice < money ? 0 : (totalPrice - money);

        return answer;
    }
}
