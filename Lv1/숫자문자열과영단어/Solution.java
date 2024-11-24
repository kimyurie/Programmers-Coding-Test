// https://school.programmers.co.kr/learn/courses/30/lessons/81301
package Lv1.숫자문자열과영단어;

import java.util.*;

// m1) 해시맵 사용 방법
class Solution {
    public int solution(String s) {
        // String은 불변이므로 StringBuilder를 사용하는게 성능 측면에서 유리
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder(); // 영단어를 누적할 문자열

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("zero", 0); hm.put("one", 1); hm.put("two", 2);
        hm.put("three", 3); hm.put("four", 4); hm.put("five", 5);
        hm.put("six", 6); hm.put("seven", 7); hm.put("eight", 8);
        hm.put("nine", 9);

        // 한글자씩 점검
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 1.숫자인 경우
            // 문자가 숫자인지 판단하는 함수인 Character.isDigit()를 사용
            if(Character.isDigit(c)) {
                answer.append(c);
                // 2.문자인 경우
            }else {
                temp.append(c); // z -> ze -> zer -> zero

                // temp가 영단어와 매핑되면 숫자로 변환
                // (temp를 toString활용해서 문자열로 변환)
                if(hm.containsKey(temp.toString())) {
                    answer.append(hm.get(temp.toString()));
                    temp.setLength(0); // temp 초기화
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}

// m2) 다른 방법
//class Solution {
//    public int solution(String s) {
//        // 영단어 배열 정의
//        String[] words = { "zero", "one", "two", "three", "four",
//                "five", "six", "seven", "eight", "nine"};
//        // 문자열에서 영단어를 순차적으로 숫자로 변환
//        for(int i = 0; i < words.length; i++) {
//            // 문자열 .replace() 활용해 문자열 포함된 기존 문자를 바꿀 문자로 변환
//            s = s.replace(words[i], String.valueOf(i));
//        }
//
//        return Integer.parseInt(s);
//    }
//}
