class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int lcm = arr[0];
        for(int i = 0; i < arr.length; i++){
            for(int j = Math.min(lcm, arr[i]) ; j >= 1; j--){
                if(lcm % j == 0 && arr[i] % j == 0){
                    lcm = lcm * arr[i] / j;
                    break;
                }
            }
            answer = lcm;
        }
        
        return answer;
    }
}