public class MakePrimeNumber {


    public static void main(String[] args){
        int[] nums = {1,2,7,6,4};
        System.out.println(solution(nums));
    }

    /**
     * 배열 중 세 숫자의 합이 소수인 숫자의 갯수
     *
     * @param nums the nums
     * @return the int 소수의 개수
     */
    public static int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int numbers = 3000;
        boolean[] isNotPrime  = new boolean[numbers+1];

        isNotPrime[0] = isNotPrime[1] = true;

        for(int i=2; i*i<=numbers; i++){
            if(!isNotPrime[i]){
                for(int j=i*i; j<=numbers; j+=i) isNotPrime[j]=true;
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int test = nums[i] + nums[j] + nums[k];
                    if (!isNotPrime[test]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }



}
