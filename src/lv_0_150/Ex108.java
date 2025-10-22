package lv_0_150;

/*
문제 설명
문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ strArr의 길이 ≤ 100,000
1 ≤ strArr의 원소의 길이 ≤ 30
strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.

 */

import java.util.*;

public class Ex108 {
    public int solution(String[] strArr) {
        // 데이터 준비
        int max = 0;
        int temp = 1;

        // 길이순으로 정렬
        Arrays.sort(strArr, (s1, s2) -> s1.length()-s2.length());

        // 가장 큰 값 찾기
        for (int i=1; i<strArr.length; i++) {
            if (strArr[i-1].length() == strArr[i].length()) temp++;
            else {
                max = (max > temp) ? max : temp;
                temp = 1;
            }
        }
        max = (max > temp) ? max : temp;

        // 리턴
        return max;
    }
}
