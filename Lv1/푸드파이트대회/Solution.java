// https://school.programmers.co.kr/learn/courses/30/lessons/134240
package Lv1.푸드파이트대회;

import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        // 3개 음식
        // food[물의양, 1번음식양, 2번음식양, 3번음식양]
        // food[1,      3,4,6]
        // 122333 0 333221
        // 14    0  14

        // [3,4,6]
        int sum = 0;  // 음식의 양의 합
        for(int i = 1; i < food.length; i++) {  // 1,2,3
            sum += food[i];
            // 0을 기준으로 양쪽 수의 합이 14

            // 1 추가하기
            // 총 1의 개수가 3개 인데 3/2 = 1개 이하로 1추가가능
            int t = food[i] / 2;
            for(int j = 0; j < t; j++) {
                sb.append(i);
            }
        }

        sb.append(0); // "1223330"

        // 역순 정렬
        for(int z = sb.length() - 2; z >= 0; z--) {
            sb.append(sb.charAt(z));
        }

        return sb.toString();
    }
}
