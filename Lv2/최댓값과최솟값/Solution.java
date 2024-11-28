// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
package Lv2.최댓값과최솟값;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int i = 0; i < str.length; i++) {
            if(Integer.parseInt(str[i]) > min) {
                min = Integer.parseInt(str[i]);
            }

            if(Integer.parseInt(str[i]) < max) {
                max = Integer.parseInt(str[i]);
            }
        }

        answer = max + " " + min;

        return answer;
    }
}