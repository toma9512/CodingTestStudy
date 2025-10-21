package lv_0_50;

/*
- 문자열 바꿔서 찾기

문제 설명
문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중  pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.

제한사항
1 ≤ myString의 길이 ≤ 100
1 ≤ pat의 길이 ≤ 10
myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
 */

public class Ex048 {
    public int solution(String myString, String pat) {
        // 길이 데이터 준비
        int n = myString.length();
        int m = pat.length();

        // myString을 바꾸지 않고 pat과 연속으로 전부 다른 부분 문자열이 있는지 확인
        for (int i=0; i<=n-m; i++) {
            boolean check = true;
            for (int j=0; j<m; j++) {
                if (myString.charAt(i+j) == pat.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) return 1;
        }

        // 리턴
        return 0;
    }
}
