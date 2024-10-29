// https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=java
package Lv1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 != 0) {
            answer += s.charAt(s.length()/2);
        }else{
            answer += s.substring(s.length()/2-1, s.length()/2 + 1);
        }

        return answer;
    }
}
