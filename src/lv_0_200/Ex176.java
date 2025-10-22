package lv_0_200;

/*
문제 설명
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < my_string 길이 < 100
 */

import java.util.*;

public class Ex176 {
    public String solution(String my_string) {
        // 소문자로 변경
        my_string = my_string.toLowerCase();

        // 정렬을 위해 배열로 변경
        String[] answer = my_string.split("");

        // 정렬
        Arrays.sort(answer);

        // 리턴
        return String.join("", answer);
    }
}
