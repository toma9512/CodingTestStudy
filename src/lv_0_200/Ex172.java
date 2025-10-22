package lv_0_200;

/*
문제 설명
문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 */

public class Ex172 {
    public String solution(String my_string) {
        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch>='a' && ch<='z') { // 소문자인 경우
                answer += (char) (ch + ('A'-'a'));
            } else { // 대문자인 경우
                answer += (char) (ch + ('a'-'A'));
            }
        }

        // 리턴
        return answer;
    }
}
