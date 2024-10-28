// https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=java
package Lv1.제일작은수제거하기;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열이 하나만 있을 경우 [-1] 리턴
        if (arr.length == 1) return new int[] {-1};

        // arr에서 가장 작은 수가 있을 때
        // 임의의 가장 큰수와 비교
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        } // for문 다 돌고나면 min = 가장 작은 수가 됌!

        // 새로운 배열에 min을 제외한 요소들 복사
        int[] answer = new int[arr.length - 1];
        int index = 0; // answer 배열의 인덱스
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != min) {
                answer[index++] = arr[j];
            }
        }

        return answer;
    }
}