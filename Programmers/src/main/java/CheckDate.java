public class CheckDate {
    public static void main(String[] args){
        System.out.println(solution(1, 7));
    }


    /**
     * Solution string.
     * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수
     *
     * @param a the a 월
     * @param b the b 일
     * @return the string 요일
     */
    public static String solution(int a, int b) {
        Integer[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayName = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int fullDay = 0;
        int remainDays = 0;

        for (int i = 0; i < a-1; i++) {
            fullDay += days[i];
        }

        remainDays = (fullDay + b) % 7;

        return remainDays == 0 ? dayName[6] : dayName[remainDays-1];
    }
}
