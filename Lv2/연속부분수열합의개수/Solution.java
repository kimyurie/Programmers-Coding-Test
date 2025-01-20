// https://school.programmers.co.kr/learn/courses/30/lessons/131701
package Lv2.연속부분수열합의개수;

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                for(int z = j; z < j+i; z++) {
                    sum += elements[z % elements.length];
                }
                hs.add(sum);
            }
        }

        answer = hs.size();

        return answer;
    }
}
