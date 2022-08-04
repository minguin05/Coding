import java.util.Scanner;

public class Backjoon_1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = Integer.toString(sc.nextInt());
        String testNum = reverseNumCheck(num);
        int cycle = 1;
        sc.nextLine();
        while(true){
            if(num.equals(testNum)) { // 결과 값이랑 똑같으면 분기 탈출
                break;
            }else{
                testNum = reverseNumCheck(testNum); // 다르면 같을 때까지 호출
            }
            cycle++;
        }

        System.out.println(cycle);
    }

    private static String reverseNumCheck(String num){
        String numString = (num.length() < 2) ? "0"+num : num; // 숫자 자리수 맞추기
        String numRightString = String.valueOf(numString.charAt(1)); // 자릿수 맞춘 수의 오른쪽 값
        int sumResult = Integer.parseInt(String.valueOf(numString.charAt(0))) + Integer.parseInt(numRightString); // 각 자리의 합
        String sumRightNum = (Integer.toString(sumResult).length() < 2) ? "0"+Integer.toString(sumResult) : Integer.toString(sumResult); // 더한 값의 오른쪽 값
        String s = numRightString + String.valueOf(sumRightNum.charAt(1)); // 파리미터 오른쪽 값 + 더한 값의 오른쪽 값

        return String.valueOf(s.charAt(0)).equals("0") ? String.valueOf(s.charAt(1)) : s; // 해당 값의 첫번째 값이 0일 경우 제거하고 리턴
    }
}
