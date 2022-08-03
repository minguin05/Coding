import java.util.Scanner;

public class Backjoon_1547 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] cups = {{0,0}, {1,1}, {2,2}, {3,3}};
        for(int i = 0; i<num; i++){
            String[] numbers = sc.nextLine().split(" ");
            changeCheck(cups, numbers[0], numbers[1]);
        }

        System.out.println(cups[1][1]);
    }

    /*
    * 자리 변환 함수
    * 공의 위치를 바꾸어 변환하는 함수
     */
    private static void changeCheck(int[][] cups, String beforeLocation, String afterLocation){
        int beforeIndex = 0; // 기존 index 값
        int afterIndex = 0; // 바꿀 index 값
        for(int i=1; i< cups.length; i++){
            if(cups[i][1] == Integer.parseInt(beforeLocation))
                beforeIndex = i;
            else if (cups[i][1] == Integer.parseInt(afterLocation))
                afterIndex = i;
        }
        int temp_num = cups[beforeIndex][1];
        cups[beforeIndex][1] = cups[afterIndex][1];
        cups[afterIndex][1] = temp_num;
    }
}
