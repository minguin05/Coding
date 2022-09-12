import java.util.HashMap;
import java.util.Map;

public class KakaoMBTI {
    public static void main(String[] args){
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices ={5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }


    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        Map<Character, Integer> surveyResult = new HashMap<>();

        for(char s : type) surveyResult.put(s, 0); // 초기화

        for(int i = 0; i<choices.length; i++){
            int scoreNum = choices[i] - 4;
            char s = scoreNum < 0 ? survey[i].charAt(0) : survey[i].charAt(1);

            surveyResult.put(s, surveyResult.get(s)+Math.abs(scoreNum));

        }

        answer+= surveyResult.get('R') >= surveyResult.get('T')? "R" : "T";
        answer+= surveyResult.get('C') >= surveyResult.get('F')? "C" : "F";
        answer+= surveyResult.get('J') >= surveyResult.get('M')? "J" : "M";
        answer+= surveyResult.get('A') >= surveyResult.get('N')? "A" : "N";


        return answer;
    }
}
