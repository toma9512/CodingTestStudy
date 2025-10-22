package lv_0_200;

/*
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
1 ≤ my_string 안의 자연수 ≤ 1000
연속된 수는 하나의 숫자로 간주합니다.
000123과 같이 0이 선행하는 경우는 없습니다.
문자열에 자연수가 없는 경우 0을 return 해주세요.
 */

public class Ex190 {
    public int solution(String my_string) {
        // 데이터 준비
        int answer = 0;
        String temp = "";

        // 숫자 확인
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch>='0' && ch<='9') temp += ch; // 0~9 숫자라면
            else if (!temp.isEmpty()) { // temp가 비어있지 않으면
                answer += Integer.parseInt(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) answer += Integer.parseInt(temp);

        // 리턴
        return answer;
    }
}
