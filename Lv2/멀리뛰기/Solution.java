// https://school.programmers.co.kr/learn/courses/30/lessons/12914
package Lv2.멀리뛰기;

class Solution {
    public long solution(int n) {
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
}