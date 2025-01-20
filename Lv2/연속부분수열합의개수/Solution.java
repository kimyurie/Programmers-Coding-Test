// https://school.programmers.co.kr/learn/courses/30/lessons/131701
package Lv2.연속부분수열합의개수;

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // 중복 제거해야하므로 hashSet 이용하기
        HashSet<Integer> hs = new HashSet<>(); // 합을 추가할 set

        int start = 1;
        while(start <= elements.length) {
            for(int i = 0; i < elements.length; i++) {
                int value = 0;
                for(int j = i; j < i + start; j++) {
                    value += elements[j % elements.length];
                }
                hs.add(value);
            }
            start++;
        }
        return hs.size();
    }
}
