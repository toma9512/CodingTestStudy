package lv_0_200;

/*
문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
 */

public class Ex162 {
    public int[] solution(int n) {
        // 데이터 담기
        int[] answer = new int[(n+1)/2];

        // 데이터 담기
        for (int i=0; i<answer.length; i++) {
            answer[i] = i*2+1;
        }

        // 리턴
        return answer;
    }
}
