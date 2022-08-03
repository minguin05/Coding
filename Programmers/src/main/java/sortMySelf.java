import java.util.Arrays;
import java.util.Comparator;

public class sortMySelf {

    public static void main(String[] args){
        String[] strings = new String[]{"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
    }

    /**
     * Solution 문자열로 구성된 리스트 strings 와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
     *
     * @param strings the strings
     * @param n       the n
     * @return 정렬된 배열
     */
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] subSort;
        subSort = Arrays.stream(strings).sorted(Comparator.comparing(e -> e.charAt(n))).toArray(String[]::new);

        // 인덱스의 문자가 같은 값일 경우 사전순 정렬
        for(int i = 0; i<strings.length-1; i++){
            for(int j = i+1; j< strings.length; j++){
                if(subSort[i].charAt(n) == subSort[j].charAt(n) && subSort[i].compareTo(subSort[j])>0){
                    String temp = "";
                    answer[i] = subSort[j];
                    answer[i+1] = subSort[i];
                    temp = subSort[i];
                    subSort[i] = subSort[j];
                    subSort[j] = temp;
                }else{
                    answer[i] = subSort[i];
                }
            }

        }

        // 마지막 값이 빈값일 경우 인덱스가 변경되지 않아도되는 값이므로 마지막 값 대입
        if(answer[answer.length-1] == null)
            answer[answer.length - 1] = subSort[answer.length - 1];
        return answer;
    }
}
