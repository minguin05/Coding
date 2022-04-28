import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon_10773 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int limit = sc.nextInt();

        for (int i = 0; i < limit; i++) {
            int number = sc.nextInt();
            switch(number) {
                case 0:
                    if(!numbers.isEmpty())
                        numbers.remove(numbers.size() - 1);
                    break;
                default:
                    numbers.add(number);
            }
        }
        System.out.println(numbers.stream().mapToInt(e -> e).sum());
    }
}
