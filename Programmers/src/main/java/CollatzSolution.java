public class CollatzSolution {
    public static void main(String[] args){
        System.out.println(solution(1));
    }

    /**
     *  콜라츠 추측 이행 횟수 구하는 함수
     *
     * @param num 주어진 정수
     * @return int 횟수
     */
    public static int solution(int num) {
        int count = 500;
        for(int i = 0; i<count; i++){
            if(num == 1)
                break;
            else{
                num = num % 2 == 0 ? num /= 2 : num * 3 + 1;
                count--;
            }
        }
        return num == 1 ? (500 - count) : -1;
    }
}
