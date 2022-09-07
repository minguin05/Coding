import java.util.*;

public class CorrectBracket {
    public static void main(String[] args){
        System.out.println(solution("(())()"));
    }


    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ')') answer = false;
        else if (s.charAt(s.length() - 1)== '(') answer = false;
        else{
            for(int i = 0; i<s.length() ; i++){
                if(s.charAt(i) == '('){
                    stack.push('(');
                }else{
                    if(stack.size() > 0)
                        stack.pop();
                    else{
                        answer = false;
                        break;
                    }
                }
            }
            if(stack.size() > 0) answer = false;
        }
        return answer;
    }
}
