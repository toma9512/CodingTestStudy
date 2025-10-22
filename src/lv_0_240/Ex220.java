package lv_0_240;

/*
문제 설명
문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < A의 길이 = B의 길이 < 100
A, B는 알파벳 소문자로 이루어져 있습니다.
 */

public class Ex220 {
    public int solution(String A, String B) {
        // 데이터 준비
        int answer = 0;

        // 밀기
        while (answer < A.length()) {
            // 검사
            if (A.equals(B)) break;

            answer ++; // 횟수 증가

            // 오른쪽으로 밀기
            String temp = A.substring(0,A.length()-1);
            A = A.substring(A.length()-1,A.length());
            A += temp;
        }

        // 리턴
        return (answer != A.length()) ? answer : -1;
    }
}
