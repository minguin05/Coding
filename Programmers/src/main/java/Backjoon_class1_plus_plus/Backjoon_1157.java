package Backjoon_class1_plus_plus;

import java.util.*;

public class Backjoon_1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] inputText = sc.nextLine().toUpperCase().split("");
        Map<String, Integer> alphaMap = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        Arrays.stream(inputText).forEach(e->alphaMap.put(e, alphaMap.getOrDefault(e, 0)+1));

        int maxValue = Collections.max(alphaMap.values());

        alphaMap.entrySet().stream().filter(e-> e.getValue() == maxValue).forEach(element-> result.add(element.getKey()));

        System.out.println(result.size() > 1 ? "?" : result.get(0));

    }
}
