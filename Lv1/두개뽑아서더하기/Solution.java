// https://school.programmers.co.kr/learn/courses/30/lessons/68644
package Lv1.두개뽑아서더하기;
// review : 1 /

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
        // HashSet<Integer>은 자동으로 정렬되지 않으므로 .sorted()를 이용한 정렬 과정이 필요하다.
        // (Set은 순서가 없는 데이터의 집합)
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}