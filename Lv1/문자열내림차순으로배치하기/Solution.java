// https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=java
package Lv1.문자열내림차순으로배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 -> 문자 배열
        String str[] = new String[s.length()];

        for(int i = 0; i < s.length(); i++) {
            str[i] = String.valueOf(s.charAt(i));
        }

        // 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());

        for(int j = 0; j < str.length; j++) {
            answer += str[j];
        }

        return answer;
    }
}
