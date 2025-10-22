package lv_0_200;

/*
문제 설명
문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_str의 길이 ≤ 100
1 ≤ n ≤ my_str의 길이
my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 */

public class Ex197 {
    public String[] solution(String my_str, int n) {
        // 데이터 준비
        String[] answer = new String[(my_str.length()-1)/n+1];
        int len = answer.length;

        // 데이터 담기
        for (int i=0; i<answer.length-1; i++) {
            answer[i] = my_str.substring(i*n,(i+1)*n);
        }
        answer[len-1] = my_str.substring((len-1)*n, my_str.length());


        // 리턴
        return answer;
    }
}
