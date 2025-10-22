package lv_1;

/*
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

제한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
 */

public class Ex20 {
    public String solution(String s) {
        // 길이
        int n = s.length();

        // 짝수일 때
        if (s.length()%2 == 0) {
            return s.substring(n/2-1,n/2+1);
        }

        // 홀수일 때
        else {
            return String.valueOf(s.charAt(n/2));
        }
    }
}
