public class bringTheCenterLetter {
    public static void main(String[] args){
        String s = "lovely";
        System.out.println("result >> " + solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        // 홀수일 경우 가운데 2개의 값을 추출
        if (s.length() % 2 == 0) {
            sb.append(s.charAt(s.length() / 2 -1)).append(s.charAt(s.length() / 2));
        } else { // 짝수일 경우 가운데 1개의 값을 추출
            sb.append(s.charAt(s.length() / 2));
        }

        return sb.toString();
    }
}
