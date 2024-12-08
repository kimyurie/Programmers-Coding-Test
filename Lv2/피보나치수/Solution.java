// https://school.programmers.co.kr/learn/courses/30/lessons/12945?language=java
package Lv2.피보나치수;

class Solution {
    public int solution(int n) {
        // 피보나치 수열 값을 저장할 배열
        int[] dp = new int[n+1];

        // 초기값 설정
        dp[0] = 0; // F(0) = 0
        dp[1] = 1; // F(1) = 1

        // 반복문을 통해 피보나치 수 계산
// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴
        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n];
    }
}
