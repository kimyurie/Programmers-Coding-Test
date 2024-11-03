// https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=java
package Lv1.직사각형별찍기;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int m = sc.nextInt(); // 3

        String answer = "";
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                answer += "*";
            }
            System.out.println(answer);//answer변수가 초기화 되지 않아 누적되어 늘어나므로
            answer = ""; // answer 변수 초기화
        }


    }
}
