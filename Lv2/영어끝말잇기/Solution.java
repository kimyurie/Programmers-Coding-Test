// https://school.programmers.co.kr/learn/courses/30/lessons/12981
package Lv2.영어끝말잇기;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // contains써야하므로 List쓰기
        List<String> list = new ArrayList<>();
        // 처음부터 list에 단어들 다 추가하지 말고 조건걸어 추가해가는 방식으로 풀이
        list.add(words[0]);

// 틀렸을때 판별 :
// 1. 앞사람이 말한 단어 마지막 문자로 시작하는 단어가 아닐때
// 2. 이전에 나왔던 단어일 때
        for(int i = 1; i < words.length; i++) {
            if((words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
                    || list.contains(words[i])) {
                answer[0] = (i % n) + 1; // 몇 번째 사람인지
                answer[1] = (i / n) + 1; // 해당 사람의 차례
                break;
            }
            // 위 조건이 아니면 단어 추가 가능
            list.add(words[i]);
        }

        return answer;
    }
}
