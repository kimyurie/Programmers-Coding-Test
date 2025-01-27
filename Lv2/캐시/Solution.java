// https://school.programmers.co.kr/learn/courses/30/lessons/17680
package Lv2.캐시;

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // cache hit : CPU 가 참조하고자 하는 메모리가 캐시에 존재하고 있을 경우
        // cache miss : CPU 가 참조하고자 하는 메모리가 캐시에 존재하지 않을 경우

        // 캐시 크기 2일때 예시
        // |     |     |
        // + cache miss 실행 시간 5
        // |  Jeju   |     |
        // + cache miss 실행 시간 5
        // |   Pangyo  |   Jeju  |
        // + cache miss 실행 시간 5
        // |  NewYork   |  Pangyo |
        // + cache hit 실행 시간 1
        // |   newyork  |  NewYork |
        // 답 : 16

        // 캐시 크기가 0일 경우 모든 접근이 cache miss
        if(cacheSize == 0) return cities.length * 5;

        Queue<String> queue = new LinkedList<>();
        int answer = 0;

        for(int i = 0; i < cities.length; i++) {
            // 모든 문자를 소문자로 변환
            cities[i] = cities[i].toLowerCase();
            // 넣으려는 문자와 큐에 있는 문자 중 같은 문자가 있을 때,
            if(queue.contains(cities[i])) {
                // 해당 문자를 지우고 추가
                queue.remove(cities[i]);
                queue.add(cities[i]);
                answer += 1;
            } else { // 중복되는 문자가 없다면,
                // 가장 오래된 문자 요소 제거 후 추가
                if(queue.size() >= cacheSize) {
                    queue.poll();
                }
                queue.add(cities[i]);
                answer += 5;
            }
        }

        return answer;
    }
}
