// https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=java
package Lv1.콜라츠추측;

class Solution {
    public int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            }else{
                num = num * 3 + 1;
            }

            answer++;

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
