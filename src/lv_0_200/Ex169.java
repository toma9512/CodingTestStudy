package lv_0_200;

/*
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
 */

public class Ex169 {
    public int solution(String my_string) {
        // 데이터 준비
        int answer = 0;

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch>='1' && ch<='9') answer += ch-'0';
        }

        // 리턴
        return answer;
    }
}
