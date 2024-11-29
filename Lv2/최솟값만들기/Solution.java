// https://school.programmers.co.kr/learn/courses/30/lessons/12941?language=java
package Lv2.최솟값만들기;

import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 곱해서 누적된 값이 최소가 되게
        // A, B 정렬 후 곱하기
        // A = [1, 2, 4]
        // B = [4, 5, 5]
        // 5 + 8 + 16 = 29
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }
}
