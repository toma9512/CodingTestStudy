package lv_0_100;

/*
- 공백으로 구분하기 2

문제 설명
단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자와 공백으로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
my_string에는 단어가 하나 이상 존재합니다.
 */

import java.util.*;

class Ex068 {
    public String[] solution(String my_string) {
        // 데이터 준비
        List<String> arr = new ArrayList<>();
        String word = "";

        // 공백 기준으로 담기
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) != ' ') {
                word += my_string.charAt(i);
            } else if (word != "") {
                arr.add(word);
                word = "";
            }
        }
        if (word != "") arr.add(word);

        // 리턴
        return arr.toArray(new String[0]);
    }
}
