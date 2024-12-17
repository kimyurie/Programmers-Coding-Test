// https://school.programmers.co.kr/learn/courses/30/lessons/12980
package Lv2.점프와순간이동;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0; // 건전지 사용량

// n = 5일때,
// 0 -> 1칸 점프 (사용량1) -> 순간이동 1*2 = 2로 이동
//-> 순간이동해서 2*2 = 4로이동 -> 1칸 점프(사용량1) : 총 사용량 2

// n = 6일때,
// 0 -> 1칸 점프 (사용량1) -> 순간이동 1*2 = 2로 이동
//-> 1칸 점프(사용량1) 위치3 -> 순간이동 3*2 = 6 : 총 사용량 2

        // 거꾸로 생각하기 (n부터 0으로 )
        while(n > 0) {
            if(n % 2 == 0) { // 짝수라면
                n /= 2; // 순간이동
            }else{ // 홀수라면
                n -= 1;// 점프
                ans++; // 건전지 사용량 +1
            }

        }

        return ans;
    }
}
