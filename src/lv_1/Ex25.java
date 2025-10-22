package lv_1;

/*
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
 */

import java.util.*;

public class Ex25 {
    public String solution(String s) {
        // 데이터 준비
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        // 오름차순 정렬
        Arrays.sort(arr);

        // 문자열으로 합치기
        for (int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }

        // 리턴
        return sb.toString();
    }
}
