import java.util.Arrays;

public class reportResult {
    public static void main(String[] args){
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = solution(id_list, report, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 반환될 정답 값
        int[] reportedNum = new int[id_list.length]; // 신고된 횟수 저장

        // 중복된 값을 제거 후 신고당한 사람에 대한 횟수 저장
        Arrays.stream(report).distinct().forEach(e->reportedNum[Arrays.asList(id_list).indexOf(e.split(" ")[1])]++);

        for (String s : report) {
            int j = 0;
            while (j < reportedNum.length) {
                // 신고자, 신고당한 사람을 분리
                String name = s.split(" ")[1];
                // 신고 기준 횟수 이상이며, 신고 기준 횟수 이상인 사람을 신고한 사람의 경우에만 값 증가
                if (reportedNum[j] >= k)
                    if(id_list[j].equals(name)) {
                        answer[Arrays.asList(id_list).indexOf(s.split(" ")[0])]++;
                    }
                j++;
            }

        }
        return answer;
    }
}
