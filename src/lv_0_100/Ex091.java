package lv_0_100;

/*
- 문자열 잘라서 정렬하기

문제 설명
문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
단, 빈 문자열은 반환할 배열에 넣지 않습니다.

제한사항
1 ≤ myString ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Ex091 {
    public String[] solution(String myString) {
        // 데이터 준비
        List<String> arr = new ArrayList<>();

        // x 기준으로 자르기
        String[] xArr = myString.split("x");

        // 리스트에 담기
        for (String i : xArr) {
            if (!i.isEmpty()) arr.add(i);
        }

        // 배열로 변경
        String[] answer = arr.toArray(new String[0]);

        // 정렬
        Arrays.sort(answer);

        // 리턴
        return answer;
    }
}
