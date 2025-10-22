package lv_0_150;

/*
문제 설명
0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ a의 길이 ≤ 100,000
1 ≤ b의 길이 ≤ 100,000
a와 b는 숫자로만 이루어져 있습니다.
a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.

 */

public class Ex125 {
    public String solution(String a, String b) {
        // 데이터 준비
        String answer = "";
        int[] arr = new int[100001];
        int n = Math.min(a.length(), b.length());
        String c = (a.length() > b.length()) ? a : b;

        // 연산
        for (int i=0; i<n; i++) {
            int intA = a.charAt(a.length()-1-i) - '0';
            int intB = b.charAt(b.length()-1-i) - '0';
            arr[i] = intA+intB;
        }
        for (int i=n; i<c.length(); i++) {
            arr[i] = c.charAt(c.length()-1-i) - '0';
        }

        // 10 이상 바꾸기
        for (int i=0; i<c.length(); i++) {
            if (arr[i] >= 10) {
                arr[i] -= 10;
                arr[i+1]++;
            }
        }

        // 정수 길이
        int len =0;
        if (arr[c.length()] == 0) len = c.length();
        else len = c.length()+1;

        // 문자열로 변경
        for (int i=len-1; i>=0; i--) {
            answer += String.valueOf(arr[i]);
        }

        // 리턴
        return answer;
    }
}
