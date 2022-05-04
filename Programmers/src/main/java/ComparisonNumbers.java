import java.util.Locale;

public class ComparisonNumbers {
    public static void main(String[] args){
        System.out.println(solution("poooyY"));
    }


    /**
     * s에 'p'의 개수와 'y'의 개수를 비교
     * @param s 입력받은 문자열
     * @return boolean answer
     */
    public static boolean solution(String s) {
        s= s.toLowerCase();
        return s.chars().filter(e->e=='p').count() == s.chars().filter(e->e=='y').count();
    }
}
