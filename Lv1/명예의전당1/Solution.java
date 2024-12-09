// https://school.programmers.co.kr/learn/courses/30/lessons/138477
package Lv1.명예의전당1;

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> place = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(place.size() < k) {
                // 명예의 전당 크기가 k보다 작으면 점수 추가
                place.add(score[i]);
            } else if (score[i] > place.get(0)) {
                // 새로운 점수가 최하위 점수보다 크면 교체
                // place[0] 값 제거
                place.remove(0); // [20, 100] //[100,150]
                // 수 추가
                place.add(score[i]);// [20,100,150] //[100,100,150]
            }

            // 정렬해 최하위 점수 업데이트
            Collections.sort(place); // [10,20,100] //[100,100,150]
            // 최하위 점수 정답 배열에 저장
            answer[i] = place.get(0);
        }

        return answer;
    }
}