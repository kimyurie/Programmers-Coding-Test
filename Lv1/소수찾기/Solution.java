// https://school.programmers.co.kr/learn/courses/30/lessons/12921
package Lv1.소수찾기;

class Solution {
    public int solution(int n) {
        // 2는 소수이므로 1로 초기화 (n은 항상 2이상)
        int answer = 1;

        // 3부터 n까지의 수 소수 판별 함수 호출
        for(int i = 3; i <= n; i++) {
            if(isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    // 소수 판별 메서드
    public boolean isPrime(int num) {
        // 2부터 num의 제곱근까지 반복
        for(int i = 2; i <= (int)Math.sqrt(num); i++) {
            // num이 i로 나눈 나머지가 0이면 소수 아님
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}