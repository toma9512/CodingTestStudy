package lv_0_100;

/*
- 카운트 다운

문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ end_num ≤ start_num ≤ 50
 */

public class Ex087 {
    public int[] solution(int start_num, int end_num) {
        // 데이터 준비
        int[] arr = new int[start_num-end_num+1];

        // 데이터 담기
        for (int i=start_num; i>=end_num; i--) {
            arr[start_num-i] = i;
        }

        // 리턴
        return arr;
    }
}
