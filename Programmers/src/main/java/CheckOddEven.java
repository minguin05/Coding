public class CheckOddEven {
    public static void main(String[] args){
        System.out.println(solution(3));
    }


    /**
     * num 이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환
     *
     * @param num 전달받은 수
     * @return String
     */
    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
