import java.util.ArrayList;
import java.util.Arrays;

public class CaesarCipher {
    public static void main(String[] args){
        System.out.println(solution("a b ", 1));
    }


    /**
     * Solution 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수
     *
     * @param s the s
     * @param n the n
     * @return the string
     */
    public static String solution(String s, int n) {
        String answer = "";
        ArrayList<Character> sChar = new ArrayList<>();

        s.chars().mapToObj(i -> (char) i).forEach(sChar::add);

        for (Character c : sChar) {
            int a = c + n;
            if(c<= 'Z'  && a > 90){
                a -= 26;
            }
            else if (c>= 'a' && a>122){
                a -= 26;
            }
            else if (c==' ')
                a = 32;
            answer += (char)a;
        }
        return answer;
    }
}
