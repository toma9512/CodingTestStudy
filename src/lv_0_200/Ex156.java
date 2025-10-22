package lv_0_200;

/*
문제 설명
문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
letter은 길이가 1인 영문자입니다.
my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
대문자와 소문자를 구분합니다.
 */

public class Ex156 {
    public String solution(String my_string, String letter) {
        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            if (!my_string.substring(i,i+1).equals(letter)) {
                answer += my_string.charAt(i);
            }
        }

        // 리턴
        return answer;
    }
}
