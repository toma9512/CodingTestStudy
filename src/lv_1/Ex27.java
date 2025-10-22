package lv_1;

/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 */

public class Ex27 {
    public boolean solution(String s) {
        // 데이터 준비
        int n = s.length();

        // 길이 확인
        if (n!=4 && n!=6) return false;

        // 숫자로만 구성되어 있는지 확인
        for (int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (ch<'0' || ch>'9') return false;
        }

        // 리턴
        return true;
    }
}
