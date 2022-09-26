import java.util.Arrays;

/**
 * Created by minguin on 2022-09-26
 */
public class Carpet {
    public static void main(String[] args){
        int brown = 24;
        int yellow = 24;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    private static int[] solution(int brown, int yellow){
        int[] answer = new int[2];
        for (int yellowY = 1; yellowY <= yellow; yellowY++) {
            if(yellow % yellowY == 0){
                int yellowX = yellow / yellowY;
                if( checkBrownNum(yellowX, yellowY) == brown ){
                    answer[0] = yellowX+2;
                    answer[1] = yellowY+2;
                    break;
                }
            }
        }
        return answer;
    }

    private static int checkBrownNum (int yellowX, int yellowY){
        return (yellowX+2) * 2 + yellowY*2;
    }
}
