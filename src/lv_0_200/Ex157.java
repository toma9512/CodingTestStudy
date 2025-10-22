package lv_0_200;

/*
문제 설명
영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
my_string은 소문자와 공백으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
 */

public class Ex157 {
    public String solution(String my_string) {
        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') answer += ch;
        }

        // 리턴
        return answer;
    }
}
