package Lv1.같은숫자는싫어;
// review : 1 , 2

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        // 스택에 arr 속 값 넣기
        for (int i = 0; i < arr.length; i++) {
            // 스택이 비어있거나, 스택 최상단 값이 현재 i와 같지 않으면
            if(stack.isEmpty() || stack.peek() != arr[i]) {
                // 스택에 집어넣기
                stack.push(arr[i]);
            }

            // stack.pop()이 연속된 숫자를 단순히 무시하는 것이 아니라 이전 숫자 자체를 제거하는 동작이 잘못된 결과를 초래
            // else{
            //     if(stack.peek() == arr[i]) {
            //         stack.pop();
            //     }
            // }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}