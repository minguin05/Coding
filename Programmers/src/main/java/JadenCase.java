import java.util.ArrayList;

public class JadenCase {
    public static void main(String[] args){
        System.out.println(solution("a   a   "));
    }

    public static String solution(String s){
        String word = "";
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) != ' '){
                word += s.charAt(i);
            }else{
                if(word.equals("")){
                    words.add(" ");
                }else{
                    word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                    words.add(word);
                    word = "";
                    words.add(" ");
                }
            }
        }

        if(!word.equals("")) words.add(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());

        return String.join("", words);
    }
}
