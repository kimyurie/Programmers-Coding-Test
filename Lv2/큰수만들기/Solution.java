// https://school.programmers.co.kr/learn/courses/30/lessons/42883
package Lv2.큰수만들기;

import java.util.*;

class Solution {
    public String solution(String number, int k) {
        // 문자열 변동 많으므로 StringBuilder 쓰기
        StringBuilder answer = new StringBuilder(); // 결과를 저장할 문자열 빌더
        int length = number.length() - k; // 최종적으로 남아야할 문자열 길이

        int index = 0; // 탐색 시작 인덱스
        for(int i = 0; i < length; i++) { // 총 자릿수
            char max = '0'; // 가장 큰 숫자를 찾기 위한 초기값
            // 2. 선택할 숫자의 범위를 제한
            // 탐색할 수 있는 최대 범위는 (현재 인덱스) + (제거 가능한 숫자 수)까지
            for(int j = index; j <= k + i; j++) {
                if(number.charAt(j) > max){
                    max = number.charAt(j);
                    // max로 지정된 인덱스의 다음 인덱스로
                    index = j + 1;
                }
            }
            answer.append(max); // 첫째자릿수 + 둘째자릿수 .. 이런 형태로 StringBuilder에 추가
        }
        return answer.toString();
    }
}
