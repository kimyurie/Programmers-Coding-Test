// https://school.programmers.co.kr/learn/courses/30/lessons/131705
package Lv1.삼총사;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++) {
            // j는 i의 다음 수 부터
            for(int j = i+1; j < number.length; j++) {
                // z는 j의 다음 수 부터
                for(int z = j+1; z < number.length; z++) {
                    if(number[i] + number[j] + number[z] == 0) answer++;
                }
            }
        }
        return answer;
    }
}
