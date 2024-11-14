// https://school.programmers.co.kr/learn/courses/30/lessons/12930
package Lv1.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String answer = "";
        // split(" ")은 연속된 공백을 빈 문자열로 처리하지 않음
        // => 입력 문자열에 여러 개의 공백이 있을 경우 의도한 대로 동작하지 않을 수 있다
        // split(" ") 대신 split(" ", -1)을 사용하여 입력 문자열의 모든 공백을 정확히 유지하도록 변경
        String[] str = s.split(" ", -1);
        //["try", "hello", "world"]

        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                if(j % 2 == 0) {
                    answer += String.valueOf(str[i].charAt(j)).toUpperCase();
                }else{
                    answer += String.valueOf(str[i].charAt(j)).toLowerCase();
                }
            }

            if(i != str.length -1) {
                answer += " ";
            }

        }

        return answer;
    }
}