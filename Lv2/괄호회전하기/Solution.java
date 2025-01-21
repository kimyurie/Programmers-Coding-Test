// https://school.programmers.co.kr/learn/courses/30/lessons/76502
package Lv2.괄호회전하기;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            // 문자열 회전
            String rotated = s.substring(i) + s.substring(0,i);

            // 올바른 괄호 문자열인지 판별
            Stack<Character> st = new Stack<>();
            boolean flag = true;

            for(int z = 0; z < s.length(); z++) {
                char c = rotated.charAt(z);

                if(c == '{' || c == '(' || c == '[') {
                    st.push(c);
                }else{
                    if(st.isEmpty() || (c == '}' && st.peek() != '{' || c == ')' && st.peek() != '(' || c == ']' && st.peek() != '[' )) {
                        flag = false;
                        break;
                    }
                    st.pop();
                }
            }
            if(flag && st.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
