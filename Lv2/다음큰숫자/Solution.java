package Lv2.다음큰숫자;

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1111 -> 10111
        // 1. n을 2진수로 변환하기
        String a = Integer.toBinaryString(n);
        // 2. n의 1개수 세기
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '1') {
                count++;
            }
        }

        // 3. n보다 큰 숫자를 2진수로 변환하기
        //  -> 변환한 수 중에서 1의 개수가 count와 같으면 답으로 반환
        for(int j = n+1; j < Integer.MAX_VALUE; j++) {
            String s = Integer.toBinaryString(j);
            int cnt = 0;
            for(int z = 0; z < s.length(); z++) {
                if(s.charAt(z) == '1') {
                    cnt++;
                }
            }
            if(cnt == count) {
                answer = j;
                break;
            }
        }

        return answer;
    }
}

