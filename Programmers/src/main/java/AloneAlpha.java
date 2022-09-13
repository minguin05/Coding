import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by minguin on 2022-09-13
 */
public class AloneAlpha {

    public static void main(String[] args){
        String input_string = "edeaaabbccd";
        System.out.println(solution(input_string));
    }

    private static String solution(String input_string) {
        String result = "";
        ArrayList<String> answer = new ArrayList<>();

        //  1. 해당 문자의 수를 구한다.
        //  2. 시작 인덱스부터 해당 문자의 수까지 같은 문자가 아닐 경우 외톨이 문자로 판단
        //  2-1. 외톨이 문자를 배열에 저장
        //  2-2. 같은 문자는 계산에서 제외하기 위해 공백으로 변환 ( 빈문자로 변경할 경우 "zbzbz" -> "bb"로 바뀌어 외톨이 문자가 아니라고 판단 )
        //  3. 문자 중 공백은 trim() 함수로 제거

        for(int i = 0; i<input_string.length(); i++){
            int charNum = input_string.length() - input_string.replace(String.valueOf(input_string.charAt(i)), "").length(); // 해당 문자의 수
            int startIdx = input_string.indexOf(input_string.charAt(i));
            int endIdx = Math.min(startIdx + charNum, input_string.length());
            for(int j = startIdx; j<endIdx; j++){
                if(input_string.charAt(j) != input_string.charAt(i) ){
                    answer.add(Character.toString(input_string.charAt(i)));
                    input_string = input_string.replaceAll(String.valueOf(input_string.charAt(i)), " ");
                    break;
                }
            }
        }

        result = (answer.size() == 0) ? "N" : answer.stream().sorted().collect(Collectors.joining("")).trim();

        return result;
    }
}
