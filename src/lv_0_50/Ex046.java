package lv_0_50;

/*
- l로 만들기

문제 설명
알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.
 */

public class Ex046 {
    public String solution(String myString) {
        // 데이터 준비
        String answer = "";

        // 문자 바꾸기
        for (char i : myString.toCharArray()) {
            if (i < 'l') {
                answer += 'l';
            } else {
                answer += i;
            }
        }

        // 리턴
        return answer;
    }
}
