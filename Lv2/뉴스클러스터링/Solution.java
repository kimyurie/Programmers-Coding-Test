// https://school.programmers.co.kr/learn/courses/30/lessons/17677
package Lv2.뉴스클러스터링;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 다중 집합 저장할 리스트 생성
        ArrayList<String> multiSet1 = new ArrayList<>();
        ArrayList<String> multiSet2 = new ArrayList<>();
        // 합집합
        ArrayList<String> union = new ArrayList<>();
        // 교집합
        ArrayList<String> intersection = new ArrayList<>();

        // 입력 문자열을 소문자로 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // str1에서 알파벳으로 이루어진 두 글자씩 끊어 다중집합 생성
        for(int i = 0; i < str1.length() - 1; i++) {
            char first = str1.charAt(i);
            char second  = str1.charAt(i+1);

            // 두 글자가 모두 알파벳이면 다중집합에 추가
            if(first >= 'a' && first <= 'z' &&
                    second >= 'a' && second <= 'z') {
                // 두 문자를 결합하여 추가
                multiSet1.add(first + "" + second);
            }
        }

        // str2에서 알파벳으로 이루어진 두 글자씩 끊어 다중집합 생성
        for(int i = 0; i < str2.length() - 1; i++) {
            char first = str2.charAt(i);
            char second  = str2.charAt(i+1);

            // 두 글자가 모두 알파벳이면 다중집합에 추가
            if(first >= 'a' && first <= 'z' &&
                    second >= 'a' && second <= 'z') {
                // 두 문자를 결합하여 추가
                multiSet2.add(first + "" + second);
            }
        }

        // 다중집합을 정렬 (정렬 후 탐색이 쉬워짐)
        Collections.sort(multiSet1);
        Collections.sort(multiSet2);

        // multiSet1을 탐색하며 교집합과 합집합 구하기
        for(String s : multiSet1) {
            // multiSet2에 동일한 원소가 있다면 제거 후 교집합에 추가
            if(multiSet2.remove(s)) {
                intersection.add(s);
            }
            // 일단 multiSet1의 모든 원소를 합집합에 추가
            union.add(s);
        }

        // multiSet2에 남아 있는 원소를 합집합에 추가
        for(String s : multiSet2) {
            union.add(s);
        }

        // 자카드 유사도 계산
        double jakard = 0;

        // 두 문자열이 모두 공집합일 경우 유사도를 1로 설정
        if(union.size() == 0) {
            jakard = 1;
        } else {
            // J(A, B) = |A ∩ B| / |A ∪ B|
            jakard = (double)intersection.size() / (double)union.size();
        }

        // 유사도를 65536을 곱한 후 정수로 변환하여 반환
        return (int)(jakard * 65536);

    }
}
