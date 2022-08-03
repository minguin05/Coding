import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1267 {

    // 영식 요금제 => 30초마다 10원씩 청구
    // 민식 요금제 => 60초마다 15원씩 청구
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int callNum = sc.nextInt();
        sc.nextLine();
        int[] callTimes = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String result = "";

        int yNum = 0; int mNum = 0;

        for (int i = 0; i < callNum; i++) {
            yNum += ((callTimes[i] / 30) + 1) * 10;
            mNum += ((callTimes[i] / 60) + 1) * 15;
        }


        result = (yNum>mNum) ? "M " + mNum : "Y " + yNum;

        if(yNum == mNum){
            result = "Y M " + yNum;
        }

        System.out.println(result);


    }
}
