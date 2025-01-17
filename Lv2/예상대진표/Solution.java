// https://school.programmers.co.kr/learn/courses/30/lessons/12985
package Lv2.예상대진표;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        // 1 2 / 3 4 / 5 6 / 7 8
        // (1) / 4(2) /(3) / 7(4)
        //    4(1)   /   7(2)    ----> 3번째까지!
        //         (1)
        // --> 3번째 라운드에서 붙게됌
        while(a != b) { // a의 값과 b의 값이 일치할 때까지
            a = (a / 2) + (a % 2); //  4 -> 2 -> 1 -> 1
            b = (b / 2) + (b % 2);//   7 -> 4 -> 2 -> 1
            answer++;
        }
        return answer;
    }
}
