import java.util.Arrays;

public class MinMax {
    public static void main(String[] args){
        System.out.println(solution("1 2 3 4"));
    }

    public static String solution(String s){
        int[] numbers = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        // 1차 소스 -> 전체 배열  for 문으로 돌면서 min max 값 비교
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if(Math.max(num, max) == num){
                max = num;
            }
            if(Math.min(num, min) == num){
                min = num;
            }
        }

        // 2차 소스 stream API 활용
        max = Arrays.stream(numbers).max().getAsInt();
        min = Arrays.stream(numbers).min().getAsInt();

        return max + " " + min;
    }
}
