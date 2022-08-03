import java.util.Arrays;
import java.util.Scanner;


/**
 * 직사각형에서 탈출
 * @author minguin
 */
public class Backjoon_1085 {

    // 가장 작은 숫자 찾기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numList = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        numList[2] = numList[2] - numList[0];
        numList[3] = numList[3] - numList[1];

        System.out.println(Arrays.stream(numList).sorted().toArray()[0]);


    }
}
