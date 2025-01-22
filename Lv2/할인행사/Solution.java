// https://school.programmers.co.kr/learn/courses/30/lessons/131127
package Lv2.할인행사;

import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
// 10일 동안 할인 진행
// 원하는 제품은 바나나 3개, 사과 2개, 쌀 2개, 돼지고기 2개, 냄비 1개
// (총 14일 동안이므로 14-10+1=총 5일간 확인하기)
// (1DAY)치킨, 사과, 사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀 -> 냄비 없으므로 X
        // 치킨1개, 사과3개, 바나나2개, 쌀2개, 돼지고기2개 형태로
// (2DAY)사과, 사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비 -> 바나나 없으므로 X
        // 사과3개, 바나나2개, 쌀2개, 돼지고기2개, 냄비1개 형태로
// (3DAY)사과, 바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나 -> 조건 충족 O
        // 사과2개, 바나나3개, 쌀2개, 돼지고기2개, 냄비1개 형태로
// (4DAY)바나나, 쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과 -> 조건 충족 O
        // 바나나3개, 쌀2개, 사과2개, 돼지고기2개, 냄비1개 형태로
// (5DAY)쌀, 사과, 돼지고기, 바나나, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나 -> 조건 충족 O
        // 쌀2개, 사과2개, 돼지고기2개, 바나나3개, 쌀2개, 냄비1개 형태로

        // want와 number배열 해시맵으로 바꾸기
        // ex) 바나나 3개, 사과 2개, 쌀 2개, 돼지고기 2개, 냄비 1개
        HashMap<String, Integer> hm1 = new HashMap<>();
        for(int z = 0; z < want.length; z++) {
            hm1.put(want[z], number[z]);
        }

        for(int i = 0; i < discount.length - 10 + 1; i++) { // 1day~5day
            HashMap<String, Integer> hm2 = new HashMap<>();
            // 1. 처음나오는 요소이면 1로 초기화, 기존에 있던 요소이면 값 증가
            // ex) (1DAY)치킨 1개, 사과3개, 바나나 2개, 쌀 2개, 돼지고기2개 형태로

            for (int j = i; j < i + 10; j++) {
                hm2.put(discount[j], hm2.getOrDefault(discount[j],0)+1);
            }

            // 2. hm1과 hm2 해시맵 비교해서 일치하면 answer+1
            boolean isMatched = true;
            for (String key : hm1.keySet()) {
                if (hm2.getOrDefault(key, 0) < hm1.get(key)) {
                    isMatched = false;
                    break;
                }
            }

            if (isMatched) {
                answer++;
            }
        }


        return answer;
    }
}
