// https://school.programmers.co.kr/learn/courses/30/lessons/12949
package Lv2.행렬의곱셈;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 결과 행렬의 크기는 arr1의 행 개수와 arr2의 열 개수에 따라 결정
        int[][] answer = new int[arr1.length][arr2[0].length];
        // arr1 [[1, 4],
        //       [3, 2],
        //       [4, 1]]
        // arr2 [[3, 3],
        //       [3, 3]]

        // arr1 행렬 x arr2 행렬 = arr1 행렬의 행 개수 X arr2 행렬의 열 개수
        // answer[0][0] = (arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0]) = 3 + 12 = 15
        // answer[0][1] = (arr1[1][0] * arr2[0][1]) + (arr1[1][1] * arr2[1][1]) = (3*3) + (2*3) = 15

        // answer[1][0] = (arr1[2][0] * arr2[0][0]) + (arr1[2][1] * arr2[1][0]) = (4*3) + (1*3) = 15
        // answer[1][1] = (arr1[0][0] * arr2[0][1]) + (arr1[0][1] * arr2[1][1]) = (1*3) + (4*3) = 15

        // answer[2][0] = (arr1[1][0] * arr2[0][0]) + (arr1[1][1] * arr2[1][0]) = (3*3) + (2*3) = 15
        // answer[2][1] = (arr1[2][0] * arr2[0][1]) + (arr1[2][1] * arr2[1][1]) = (4*3) + (1*3) = 15

        for(int i = 0; i < arr1.length; i++) { // arr1의 각 행을 처리
            for(int j = 0; j < arr2[0].length; j++) { // arr2의 각 열을 처리
                for(int z = 0; z < arr1[0].length; z++) {  // arr1의 한 행과 arr2의 한 열의 각 원소를 곱하고 누적합을 계산
                    answer[i][j] += arr1[i][z] * arr2[z][j];
                }
            }
        }

        return answer;
    }
}