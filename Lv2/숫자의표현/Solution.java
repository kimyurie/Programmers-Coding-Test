package Lv2.숫자의표현;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // n을 연속한 자연수들로 표현
        // n과 같지 않은데 n보다 커지면 안됌
        // j   i   i+1 i+2 i+3
        // 1 + 2 + 3 + 4 + 5
        // j   i
        // 2 + 3 + 4 + 5 + 6
        // j   i
        // 3 + 4 + 5 + 6
        // j   i
        // 4 + 5 + 6
        for(int j = 1; j <= n; j++) {
            int sum = 0;
            for(int i = j; i <= n; i++) {
                sum += i;
                if(sum == n) {
                    answer++;
                }else if(sum > n){
                    break;
                }
            }
        }

        return answer;
    }
}