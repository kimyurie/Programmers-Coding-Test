// https://school.programmers.co.kr/learn/courses/30/lessons/76501?language=java
package Lv1.음양더하기;

import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] = Integer.parseInt("-" + absolutes[i]);
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
