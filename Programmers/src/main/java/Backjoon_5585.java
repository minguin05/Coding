import java.util.*;

public class Backjoon_5585 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int taroMoney = 1000;
        int returnMoney = taroMoney - money;
        int result = 0;

        for (int i = 0; i < 6; i++){
            int divisionNum = 0;
            int number = returnMoney;
            if(taroMoney != 0 && returnMoney !=0){
                if((i+1) % 2 == 0){
                    divisionNum = taroMoney /= 5;
                    if(returnMoney / divisionNum != 0){
                        result += number / divisionNum;
                        returnMoney = returnMoney % divisionNum;
                    }
                }
                else{
                    divisionNum = taroMoney /= 2;
                    if(returnMoney / divisionNum != 0){
                        result += number / divisionNum;
                        returnMoney = returnMoney % divisionNum;
                    }
                }

            }

        }
        System.out.println(result);
    }
}
