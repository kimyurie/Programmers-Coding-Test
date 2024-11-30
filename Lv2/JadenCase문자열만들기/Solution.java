// https://school.programmers.co.kr/learn/courses/30/lessons/12951?language=java
package Lv2.JadenCase문자열만들기;

import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        // split(" ", -1)은 모든 공백을 유지하고, 연속된 공백도 빈 문자열로 처리
        String[] str = s.split(" ", -1);

        for(int i = 0; i < str.length; i++) {
            if(!str[i].isEmpty()) {
                str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
            }

            // 테스트케이스 8번
            // "  for the what 1what  "
            // "  For The What 1what  "

            answer.append(str[i]);

            if(i != str.length - 1) {
                answer.append(" ");
            }

        }

        return answer.toString();
    }
}
