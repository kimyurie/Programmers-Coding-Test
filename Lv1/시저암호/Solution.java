// https://school.programmers.co.kr/learn/courses/30/lessons/12926
package Lv1.시저암호;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // AB -> BC -> CD -> DE -> EF -> FG
        //    1     1     1
        // a B z -> b C a -> c D b -> d E c -> e F d
        //       1        1        1        1

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                // 원래 알파벳 - 'a' + n = 이동된 알파벳의 위치
                // 이동된 알파벳 위치 + 'a' = 이동된 알파벳
                // % 26 을 하는 이유는 z + 1 했을 때 a로 순환되게 하기 위해
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            }else if(ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            // 공백은 그대로 추가
            answer += ch;
        }

        return answer;
    }
}
