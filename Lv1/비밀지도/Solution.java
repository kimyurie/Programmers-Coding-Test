// https://school.programmers.co.kr/learn/courses/30/lessons/17681
package Lv1.비밀지도;

import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // arr1과 arr2의 이진수를 비교
        // 01001
        // 11110
        // -----
        // 11111 -> 둘 중 하나라도 1이면 1임 (OR연산)

        // 1. 십진수 -> 이진수로 바꾸기
        // 2. arr1과 arr2의 이진수를 비교
        // arr1.charAt(0) || arr2.charAt(0) = 1
        for (int i = 0; i < n; i++) {
            // 각 행의 arr1과 arr2를 OR 연산하여 전체 지도의 정보를 얻음
            int combined = arr1[i] | arr2[i];

            // 이진수로 변환하면서 지도 형태로 문자열 구성
            String str = "";
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(combined)).replace(' ', '0');

            for (int x = 0; x < n; x++) {
                if (binaryString.charAt(x) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }

            answer[i] = str;
        }

        return answer;
    }
}
