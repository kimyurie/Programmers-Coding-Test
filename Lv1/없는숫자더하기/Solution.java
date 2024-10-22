// https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=java
package Lv1.없는숫자더하기;

class Solution {
    public int solution(int[] numbers) {
        // 0~9까지 합 - numbers 모든 합
        int answer = 45;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return answer - sum;
    }
}
