// https://school.programmers.co.kr/learn/courses/30/lessons/12977
package Lv1.소수만들기;

class Solution {
    public boolean isDemic(int num) {
        // 소수 판별
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] nums) {
        // 입출력 예 #1 [1,2,3,4]
        // [1,2,3] -> 1 + 2 + 3 = 6 (소수 x)
        // [인덱스0, 인덱스 1, 인덱스2]
        // [1,2,4] -> 1 + 2 + 4 = 7 (소수 O)
        // [인덱스0, 인덱스 1, 인덱스3]
        // [1,3,4] -> 1 + 3 + 4 = 8 (소수 x)
        // [인덱스0, 인덱스 2, 인덱스3]
        // [2,3,4] -> 2 + 3 + 4 = 9 (소수 x)
        // [인덱스1, 인덱스 2, 인덱스3]
        int answer = 0;

        // 첫번째 숫자 탐색
        for(int i = 0; i < nums.length - 2; i++) { // 마지막 두개의 숫자 남아있어야함.
            // 두번째 숫자 탐색
            for(int j = i+1; j < nums.length - 1; j++) { // 마지막 한개의 숫자 남아있어야함.
                // 세번째 숫자 탐색
                for(int x = j+1; x < nums.length; x++) {
                    int sum = nums[i] + nums[j] + nums[x];
                    // 소수 판별
                    if(isDemic(sum)) {
                        answer++;
                    }
                }

            }
        }

        return answer;
    }

}
