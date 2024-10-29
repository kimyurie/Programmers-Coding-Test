// https://school.programmers.co.kr/learn/courses/30/lessons/70128?language=java
package Lv1.내적;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        // (a[0] * b[0]) + (a[1] * b[1]) + (a[2] * b[2])...
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
