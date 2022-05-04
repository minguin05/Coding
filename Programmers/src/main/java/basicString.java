public class basicString {
    public static void main(String[] args){
        System.out.println(solution("4234"));
    }


    /**
     * 입력받은 문자열의 길이가 4 혹은 6이고, 숫자로만 이루어져있을 경우 true 반환
     * @param s 입력받은 문자열
     * @return boolean answer
     */
    public static boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6;

        for(char a : s.toCharArray()){
            if(!Character.isDigit(a))
                answer = false;
        }
        return answer;
    }
}
