/**
 * Created by minguin on 2022-09-26
 */
public class NextNumber {
    public static void main(String[] args){
        int n = 78;
        System.out.println(solution(n));
    }

    private static int solution(int n){
        int nThridOneNum = Integer.bitCount(n); // Integer.bitCount : 숫자를 2진수로 변환 후 1의 개수 반환하는 함수
        int i = n+1;
        while(true){
            int secondThirdOneNum = Integer.bitCount(i);
            if(nThridOneNum == secondThirdOneNum) {
                break;
            }
            i++;
        }
        return i;
    }
}
