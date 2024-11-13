// https://school.programmers.co.kr/learn/courses/30/lessons/147355
package Lv1.크기가작은부분문자열;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        //  t를 p의 길이씩 자르기
        //  => 현재 위치 부터 + p의 길이까지 (현재 위치 인덱스 늘려가면서)
        for(int i = 0; i <= t.length() - p.length(); i++) {
            // p의 길이가 최대 18이므로, t.substring() 결과가 int 범위를 넘어갈 수 있음.
            long num = Long.parseLong(t.substring(i, i + p.length()));
            if(num <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}
