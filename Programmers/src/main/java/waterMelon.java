public class waterMelon {
    public static void main(String[] args){
        System.out.println(solution(20));
    }

    /**
     * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
     * 짝수일 경우 '수박'을 전체 횟수의 반만큼 반복하고, 홀수일 경우 마지막에 "수"를 추가
     * @param n 숫자 갯수
     * @return String
     */
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("수박".repeat(Math.max(0, n / 2)));
        if(n%2 != 0)
            sb.append("수");

        return sb.toString();
    }
}
