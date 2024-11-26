// https://school.programmers.co.kr/learn/courses/30/lessons/12915
package Lv1.문자열내마음대로정렬하기;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        // 1. 각 문자열의 n번째 문자열과 원래 문자열을 합친 배열 생성
        String[] temp = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            // ["usun", "ebed", "acar"]
            temp[i] = strings[i].charAt(n) + strings[i];
        }

        // 2. temp 배열 오름차순 정렬
        Arrays.sort(temp); // ["acar", "ebed", "usun"]

        // 3. 정렬된 결과에서 원래 문자열만 추출
        for(int j = 0; j < answer.length; j++) {
            answer[j] = temp[j].substring(1); // 1번째 문자부터 끝까지
        }

        return answer;
    }
}
