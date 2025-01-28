// https://school.programmers.co.kr/learn/courses/30/lessons/64065
package Lv2.튜플;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        // 2},{2,1},{2,1,3},{2,1,3,4 형태로 자르고, },{ 기준으로 나눠서 집어넣기
        // 중괄호 포함시 이를 문자 그대로 인식시키려면, 아래처럼 이스케이프 처리(\\)가 필요
        String[] str = s.substring(2, s.length() - 2).split("\\},\\{");
        // str = ["2", "2,1", "2,1,3", "2,1,3,4"];

        // 길이를 기준으로 오름차순 정렬
        Arrays.sort(str, (a, b) -> (a.length() - b.length()));
        // str = ["2", "2,1", "2,1,3", "2,1,3,4"];

        // 중복되는 수 제외하고 answer에 수 집어넣기
        for(String group : str) {
            String[] numbers = group.split(",");
            for(String num : numbers) {
                // numbers = ["2"];
                // numbers = ["2", "1"];
                // numbers = ["2", "1", "3"];
                // numbers = ["2", "1", "3", "4"];
                int value = Integer.parseInt(num);
                if(hs.add(value)) {
                    answer.add(value);
                }
            }
        }

        // 리스트 -> 배열로 전환 후 반환
        return answer.stream().mapToInt(i->i).toArray();
    }
}