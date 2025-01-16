// https://school.programmers.co.kr/learn/courses/30/lessons/176963
package Lv1.추억점수;

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // 해시맵 사용
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }

        for(int j = 0; j < photo.length; j++) {
            for(int z = 0; z < photo[j].length; z++) {
                if(hm.containsKey(photo[j][z])) {
                    answer[j] += hm.get(photo[j][z]);
                }
            }
        }
        return answer;
    }
}
