package lv_0_50;

/*
- 뒤집힌 문자열

문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
 */

public class Ex014 {
    public String solution(String my_string) {
        String answer = "";

        for (int i=0; i<my_string.length(); i++) {
            answer += my_string.charAt(my_string.length()-i-1);
        }

        return answer;
    }
}
