// https://school.programmers.co.kr/learn/courses/30/lessons/68644
package Lv1.두개뽑아서더하기;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // HashSet 사용해 중복된 값 제거
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        // 중복된 제거된 합들을 정렬된 배열로 변환
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}