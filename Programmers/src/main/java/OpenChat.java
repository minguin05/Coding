import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChat {
    public static void main(String[] args){
        int n = 5;
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }


    public static String[] solution(String[] record) {
        ArrayList<String> answer  = new ArrayList<>();
        Map<String, String> name = new HashMap<>();
        String[][] history = new String[record.length][2];
        int i =0;

        // 변경되는 이름 -> hashmap으로 관리
        // 데이터는 순서가 필요하기 때문에 배열로 관리
        for(String s: record){
            String[] test = s.split(" ");
            if(!test[0].equals("Leave"))
                name.put(test[1], test[2]);
            history[i][0] = test[0];
            history[i][1] = test[1];
            i++;
        }

        for (int j = 0; j < history.length; j++) {
            history[j][1] = name.get(history[j][1]);
            if(history[j][0].equals("Enter")){
                answer.add(history[j][1] + "님이 들어왔습니다.");
            }else if(history[j][0].equals("Leave")){
                answer.add(history[j][1] + "님이 나갔습니다.");
            }
        }


        return answer.toArray(new String[answer.size()]);
    }
}
