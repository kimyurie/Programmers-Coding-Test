package Lv1._3진법뒤집기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3); // 10진법 -> 3진법 변환
        String str = "";
        for(int i = three.length() - 1; i >= 0; i--) {
            str += three.charAt(i);
        }
        answer = Integer.parseInt(str,3); // 3진법 -> 10진법 변환
        return answer;
    }
}
