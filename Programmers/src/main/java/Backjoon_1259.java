import java.util.*;

public class Backjoon_1259 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if( num == 0 ) break;
            sc.nextLine();
            System.out.println(checkResult(num));
        }
    }

    private static String checkResult(int num){
        String numString = Integer.toString(num);
        int numLength = numString.length();
        String result = "";

        ArrayList<Character> frontChars = new ArrayList<Character>();
        ArrayList<Character> backChars = new ArrayList<Character>();
        for (int i = 0; i < numLength; i++) {
            if(i < (numLength / 2)){
                frontChars.add(numString.charAt(i));
            }else {
                backChars.add(numString.charAt(i));

            }
        }

        if((numLength % 2) != 0)
            backChars.remove(0);

        Collections.reverse(backChars);

        for (int i = 0; i < frontChars.size(); i++) {
            if(frontChars.get(i) != backChars.get(i)) {
                result = "no";
                break;
            }
        }

        return result.equals("") ? "yes" : "no";

    }
}
