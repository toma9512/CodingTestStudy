package lv_0_100;

/*
- ad 제거하기

문제 설명
문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ strArr의 길이 ≤ 1,000
1 ≤ strArr의 원소의 길이 ≤ 20
strArr의 원소는 알파벳 소문자로 이루어진 문자열입니다.
 */

import java.util.ArrayList;
import java.util.List;

class Ex064 {
    public String[] solution(String[] strArr) {
        // 데이터 준비
        List<String> arr = new ArrayList<>();
        char[] ad = {'a','d'};

        // ad 포함 문자 제거 후 arr에 담기
        for (String word : strArr) {
            boolean check = true;
            for (int i=0; i<=word.length()-2; i++) {
                boolean check2 = false;
                for (int j=0; j<2; j++) {
                    // ad 검사 중 하나라도 잘못되면 check2를 ture로, 반복문 탈출
                    if (word.charAt(i+j) != ad[j]) {
                        check2 = true;
                        break;
                    }
                }
                // ad가 있으면 check를 false로 변경
                if (!check2) check = false;
            }
            // check가 true면 ad를 포함하지 않으므로 리스트에 추가
            if (check) arr.add(word);
        }

        // 리턴
        return arr.toArray(new String[0]);
    }
}
