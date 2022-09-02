import java.util.*;

public class Backjoon_1181 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sortString = new ArrayList<>();
        Map<Integer, String> test = new HashMap<>();

        int limitNum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < limitNum; i++) {
            String text = sc.nextLine();
            if(!sortString.contains(text))
                sortString.add(text);
        }
        sortString.stream()
                .sorted().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
