// https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=java
package Lv1.약수의개수와덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            // 약수의 개수 세기
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++;
            }

            if(count % 2 == 0) {
                answer += i;
            }else {
                answer -= i;
            }
        }

        return answer;
    }
}
