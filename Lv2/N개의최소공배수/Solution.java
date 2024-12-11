// https://school.programmers.co.kr/learn/courses/30/lessons/12953
package Lv2.N개의최소공배수;

class Solution {
    // 1. 최소 공약수 구하기
    //    -> 유클리드호제법 이용
    //    : 두 수 a,b의 최대공약수는 b와 a%b의 최대공약수와 동일
    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public int solution(int[] arr) {
        // 2. 최소 공배수 구하기
        //    -> 배열 요소 곱한거 / 최소 공약수 = 최소 공배수
        for(int i = 0; i < arr.length - 1; i++) {
            int num = gcd(arr[i+1], arr[i]); // 최대공약수 결과
            arr[i+1] = (arr[i] * arr[i+1]) / num; // 최대공배수 갱신하며 구하기
        }
        return arr[arr.length - 1];
    }
}
