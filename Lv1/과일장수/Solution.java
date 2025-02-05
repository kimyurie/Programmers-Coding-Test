// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package Lv1.과일장수;

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 입출력 예 #1
        // k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1] 일때,
        // 1. [1, 1, 1, 2, 2, 3, 3]로 정렬
        // 2. [2, 2, 3, 3]로 자르고 해당 이익 계산
        // 인덱스 (score.length - m) ~ (score.length - 1) 까지
        // score[score.length - m] * m = 8
        // ==> 총이익 = 8
        // 입출력 예 #2
        // k = 4, m = 3, 사과 7개의 점수가 [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]일때,
        // 1. [1,1,2,2,2,2,4,4,4,4,4,4]로 정렬
        // 2. [4,4,4]로 자르고 이익 계산 +
        //    [4,4,4]로 자르고 이익 계산 +
        //    [2,2,2]로 자르고 이익 계산 +
        //    [1,1,2]로 자르고 이익 계산 +
        //    ==> 총이익 = 33
        Arrays.sort(score); // [1, 1, 1, 2, 2, 3, 3]

        int answer = 0;
        for(int i = score.length - m; i >= 0; i-= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}