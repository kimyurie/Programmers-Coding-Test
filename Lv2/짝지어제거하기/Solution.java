// https://school.programmers.co.kr/learn/courses/30/lessons/12973?language=java
package Lv2.짝지어제거하기;

import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // * 스택에 먼저 수 다 넣지 말고, 넣어가면서 하나씩 비교하기
            // * 비어있는 경우 부터 생각하지 말고 비어있지 않은 경우부터 생각해서 if문 짜기!
            // 스택 비어있지 않고, 최상단 문자가 현재 문자와 같으면 제거
            if(!st.isEmpty() && st.peek() == current) {
                st.pop();
            }else { // 스택이 비어 있거나, 최상단 문자가 문자와 다르면 추가
                st.push(current);
            }
        }

        return st.isEmpty() ? 1 : 0;

    }
}
