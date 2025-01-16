// https://school.programmers.co.kr/learn/courses/30/lessons/138476
package Lv2.귤고르기;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        //  1 : 1개, 2 : 2개, 3 : 2개, 4 : 1개, 5 : 2개
        // k = 6일때 종류의 값을 합한 수가 6이 되어야함 (종류의 개수가 큰 수 부터 하나씩 값 더하기)
        // (2 : 2개) + (3 : 2개) + (5 : 2개) = 6
        // 남은 키의 개수인 3이 정답!

        // 1 : 1개, 2 : 2개, 3 : 2개, 4 : 1개, 5 : 2개
        // k = 4
        // (2 : 2개) + (3 : 2개) = 4
        // 남은 키의 개수인 2가 정답!

        // 1 : 4개, 2 : 3개, 3 : 1개
        // k = 2
        // (1 : 1개) + (2 : 1개) = 2
        // 남은 키의 개수인 1이 정답!

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
            // 처음 나오는 크기면 1로 초기화, 기존에 있던 크기면 값 증가
            hm.put(tangerine[i], hm.getOrDefault(tangerine[i], 0) + 1);
        }

        // 값의 개수를 기준으로 정렬하기 위해 리스트에 추가
        ArrayList<Integer> list = new ArrayList<>(hm.values());
        // list = [1, 2, 2, 2, 1]

        // 내림차순 정렬 (개수가 많은 것부터 정렬)
        // (**배열은 Arrays.sort()로 정렬하고 ArrayList는 Collections.sort로 정렬하기**)
        Collections.sort(list, Collections.reverseOrder());
        // list = [2, 2, 2, 1, 1]

        // 각 값의 개수 하나씩 더해서 k보다 크거나 같으면 결과 도출
        int sum = 0;
        int answer = 0;
        for(int j = 0; j < list.size(); j++) {
            sum += list.get(j);
            answer++; // 종류 수 증가
            // 같은것만 조건으로 하면 답 틀리고 크거나 같아야 함
            if(sum >= k) {
                break;
            }
        }

        return answer;
    }
}
