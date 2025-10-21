package lv_0_50;

/*
- 카운트 업

문제 설명
정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ start_num ≤ end_num ≤ 50
 */

public class Ex020 {
    public int[] solution(int start_num, int end_num) {
        // 데이터 준비
        int[] answer = new int[end_num-start_num+1];

        // 데이터 담기
        for (int i=start_num; i<=end_num; i++) {
            answer[i-start_num] = i;
        }

        // 리턴
        return answer;
    }
}
