// https://school.programmers.co.kr/learn/courses/30/lessons/87390
package Lv2.n2배열자르기;

class Solution {
    public int[] solution(int n, long left, long right) {
        // 1. n행 n열 크기의 2차원 배열 만들기
        // n = 3 (3행 3열)일때,
        // 1 2 3
        // 2 2 3
        // 3 3 3

        // 2. 1행, 2행,... n행 잘라내어 모두 이어붙인 새로운 1차원 배열 만들기
        // 1 2 3 / 2 2 3 / 3 3 3

        // 3. arr[left], arr[left+1]...arr[right]만 남기고 나머지 지우기
        // arr[2], arr[3], arr[4], arr[5]일때,
        // 답은 [3,2,2,3]
        //-----------------------

        int[] answer = new int[(int)(right - left + 1)];

        // 메모리 초과를 막기 위해 2차원 배열이 아닌
        // 처음부터 1차원 배열로 정답 배열 채우기! [1,2,3,2,2,3,3,3,3]
        for(long i =  left; i <= right; i++) { // 2~5
            // 행 열 = 0   1    2
            //  0   i+1, i+2, i+3,
            //  1   i+2, i+2, i+3,
            //  2   i+3, i+3, i+3
            // [0,0] = 1
            // [0,1], [1,0], [1,1] = 2
            // [0,2], [1,2], [2,0],[2,1],[2,2] = 3
            // [행,열] 형식인데 열과 행 중 큰 수가 채울 숫자가 된다.
            // [0,2], [0,1], [1,0], [2,1]
            int row = (int)(i / n); //2 / 3 = 0
            int col = (int)(i % n); //2 % 3 = 2
            // answer 인덱스는 0부터 채워져야 함
            answer[(int)(i - left)] = Math.max(row, col)+1;
        } // [3,2,2,3]

        return answer;
    }
}
