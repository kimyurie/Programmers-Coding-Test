// https://school.programmers.co.kr/learn/courses/30/lessons/132267
package Lv1.콜라문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 빈 병 2개 -> 1개 줌
        // -------------------
        // 빈 병 20개 -> 10개 줌
        // 빈 병 10개 -> 5개 줌
        // 빈 병 5개 -> 2개 줌 .. 빈병 1개 남음
        // 빈 병 2개 -> 1개 줌
        // 빈 병 5개일 때 남은 1병 + 위에 1개 -> 1개 줌
        // 총 10 + 5 + 2 + 1 + 1 = 19개 (정답)

        // 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 수 x
        while(n >= a) {
            // (만약 빈 병 2개 -> 2개 준다면?)
            // (빈 병 20개 -> 20개 줌)
            // 원래 교환 수에 한번 교환당 받는 병수를 곱해준다
            int exchange = (n / a) * b; // 10
            answer += exchange; // 10 + ...
            // 어차피 나머지가 0일때는 더할때 영향을 미치지 않으므로 if 조건 안나눠도 됌
            n = (n % a) + exchange;
        }

        return answer;
    }
}