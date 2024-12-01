// https://school.programmers.co.kr/learn/courses/30/lessons/70129?language=java
package Lv2.이진변환반복하기;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removedZeros = 0; // 제거된 0의 개수

        while(!s.equals("1")) { // s가 모두 "1"이 될때까지 반복 (최종 이진 변환 결과는 항상 "1"인점을 이용)

            // 1. 원래 수에서 0제거하기
            int originalLength = s.length();
            s = s.replaceAll("0", ""); // 모든 0을 제거 // "1111"
            int newLength = s.length(); // 4

            removedZeros += (originalLength - newLength);

            // 2. 2진법으로 변환하기
            // 길이를 2진법 문자열로 변환 // 4 -> 110
            s = Integer.toBinaryString(newLength);

            // 3. 변환 1번 추가
            count++;
        }

        answer[0] = count;
        answer[1] = removedZeros;

        return answer;
    }
}