// https://school.programmers.co.kr/learn/courses/30/lessons/12901
package Lv1._2016년;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 윤년 일수 - 366일 (2월 끝일이 29일)
        // 1월 ~ 12월 끝일
        // 31,29,31,30,31,30,31,31,30,31,30,31

        // 1. 해당 날짜까지 총 일수 계산
        // 2016년 1월 1일은 금요일
        String[] dw = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};

        // 해당 월 전까지의 일수 더하기
        int sumday = 0;
        for(int i = 0; i < a-1; i++) {
            sumday += days[i];
        }

        // 해당 월의 일수 더하기
        // b일 전날까지의 날짜 포함 (5월 23일까지)
        sumday += (b - 1);

        // 2. 해당 날짜 요일 계산
        answer = dw[sumday % 7];

        return answer;
    }
}
