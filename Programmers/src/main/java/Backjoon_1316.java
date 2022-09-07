import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Backjoon_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int limitNum = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<limitNum; i++){
            result += groupCheck(sc.nextLine());
        }
        System.out.println(result);
    }

    private static int groupCheck(String text){
        String[] textArray = text.split("");
        String[] findArray = new String[textArray.length];
        findArray[0] = textArray[0];
        int result = 1;
        int findIdx = 1;
        for(int i = 1; i<textArray.length; i++){
            if(i != 1 && Arrays.stream(findArray).anyMatch(Predicate.isEqual(textArray[i])) && !textArray[i - 1].equals(textArray[i])){
                result = 0;
                break;
            }else{
                findArray[findIdx] = textArray[i];
                findIdx++;
            }
        }
        return result;
    }
}
