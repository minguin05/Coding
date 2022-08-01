import java.util.Scanner;

public class Backjoon_1284 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if( num == 0 ) break;
            sc.nextLine();
            System.out.println(calculation(num));
        }
    }

    /**
     * 간판 숫자 간격 값 계산
     *
     * @param num 간판 숫자
     */
    private static int calculation(int num){
        String numString = Integer.toString(num);
        int intervalNum = numString.length() - 1; // 자리 사이 여백
        int startEnd = 2; // 앞뒤 여백
        int charNum = 0; // 숫자 값
        for(int i = 0; i<numString.length(); i++){
            char s = numString.charAt(i);
            if(s == '0') charNum += 4;
            else if(s == '1') charNum += 2;
            else charNum += 3;
        }
        return intervalNum + startEnd + charNum;
    }

}
