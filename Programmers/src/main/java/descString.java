import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class descString {
    public static void main(String[] args){
        System.out.println(solution("ZAbcdefg"));
    }

    /**
     * 문자열을 전달받아 해당 문자열을 역순으로 정렬해 새로운 문자열을 리턴
     * @param s 문자열
     * @return String
     */
    public static String solution(String s) {
        String[] sString = s.split("");

        return Arrays.stream(sString).sorted(Collections.reverseOrder()).collect(Collectors.joining());
    }
}
