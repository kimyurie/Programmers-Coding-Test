// https://school.programmers.co.kr/learn/courses/30/lessons/12982
package Lv1.예산;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // [1,2,3,4,5]

        int answer = 0;
        int sum = 0;
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            if(sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }
}
