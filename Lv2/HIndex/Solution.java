// https://school.programmers.co.kr/learn/courses/30/lessons/42747
package Lv2.HIndex;
// review : 1 / 2

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // 배열 오름차순 정렬
        Arrays.sort(citations);
        // [0, 1, 3, 5, 6]

// citations[i]에서 i값을 증가시키고 논문의 수를 감소시키면서 비교 했을 때
// 인용 횟수가 논문의 수 이상이 되었을 때의 논문의 수가 H-Index가 된다
        //     1회 인용(1회이상): 1,3,5,6 => 4개
        //            (1회이하): 0,1 => 2개
        // -> 4편의 논문이 1회 이상 인용이므로 조건 충족x
        //     2회 인용(2회이상): 3,5,6 => 3개
        //            (2회이하): 0,1 => 2개
        // -> 3편의 논문이 2회 이상 인용이므로 조건 충족x
        //     3회 인용(3회이상): 3,5,6 => 3개
        //            (3회이하): 0,1,3 => 3개
        // -> 3편의 논문이 3회 이상 인용이므로 조건 충족o
        for(int i = 0; i < citations.length; i++) {
            // 인용된 논문 수
            // 5개 -> 4개 -> 3개 -> 2개 -> 1개 순으로
            int h = citations.length - i;

            // citations[i] 는 0 -> 1 -> 3 -> 5 -> 6 순으로
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
