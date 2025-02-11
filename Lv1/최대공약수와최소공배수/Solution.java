// https://school.programmers.co.kr/learn/courses/30/lessons/12940?language=java
package Lv1.최대공약수와최소공배수;
// review : 1 /

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 최대공약수 계산 (유클리드 호제법)
        int gcd = gcd(n, m);

        // 최소공배수 구하기 => (n * m) / 최대공약수
        int lcm = (n * m) / gcd;

        answer[0] = gcd; // 최대공약수
        answer[1] = lcm; // 최소공배수

        return answer;
    }

    // 유클리드 호제법 사용해 최대공약수 계산
    // ex) 106과 16의 최대공약수 구하기
    //  106 / 16 = 6 ... 10
    //        16 / 10 = 1 ... 6
    //             10 / 6 = 1 ... 4
    //                  6 / 4 = 1 ... 2
    //                      4 / 2 = 2 ... 0
    //            나머지가 0이되므로 나눠지는 수인 2가 최대공약수!
    // => 두 수 a,b의 최대공약수는 b와 a%b의 최대공약수와 동일
    // (나머지를 나누는 수에 계속 나누면 마지막 나누는 수가 최대공약수)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // b = 0일 때, a가 최대공약수가 된다
        return a;
    }
}
