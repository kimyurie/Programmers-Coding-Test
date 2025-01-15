// https://school.programmers.co.kr/learn/courses/30/lessons/159994
package Lv1.카드뭉치;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0; // cards1의 인덱스
        int index2 = 0; // cards2의 인덱스

        for(int i = 0; i < goal.length; i++) {
            if(index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1++;
            }else if(index2 < cards2.length && cards2[index2].equals(goal[i])) {
                index2++;
            }else {
                return "No";
            }
        }

        return "Yes";
    }
}