// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package Lv1.과일장수;

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score); // [1,1,1,2,2,3,3]

        int length = score.length;

        // 뒤에서부터 m개씩 묶어서 이익 계산
        // 묶음: [1, 1, 1, 2] → 최소 점수: 1 → 이익: 4
        for(int i = length - m; i >= 0; i -= m) {
            int min = score[i];
            answer += min * m;
        }

        // 정렬된 배열: [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
        // 묶음: [1, 1, 2] → 최소 점수: 1 → 이익: 3
        // 묶음: [2, 2, 2] → 최소 점수: 2 → 이익: 6
        // 묶음: [4, 4, 4] → 최소 점수: 4 → 이익: 12
        // 묶음: [4, 4, 4] → 최소 점수: 4 → 이익: 12
        // 최대 이익: 33

        return answer;
    }
}
