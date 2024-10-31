// https://school.programmers.co.kr/learn/courses/30/lessons/82612?language=java
package Lv1.부족한금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++) {
            answer += price * i;
        }

        if(money < answer) {
            return answer - money;
        }else{
            return 0;
        }


    }
}
