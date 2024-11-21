// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package Lv1.가장가까운같은글자;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            // 앞에서 같은 수중 가까운 것과의 차이를 찾기 때문에 for문이 뒤에서 부터 시작
            for(int j = i - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i-j;
                    break;
                }
            }
            if(answer[i] == 0) answer[i] = -1;
        }


        return answer;
    }
}