// https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=java
package Lv1.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        // 수박 글자를 반복해서 글자 수 만큼 자르기 (틀린 방법)
        // -> n만큼 반복해서 글자 생성하는데 홀수 번째에는 '수', 짝수번째에는 '박'나오게
        String answer = "";

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer += "수";
            }else {
                answer += "박";
            }
        }

        return answer;
    }
}
