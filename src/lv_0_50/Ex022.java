package lv_0_50;

/*
- n개 간격의 원소들

문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
5 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ 4
 */

public class Ex022 {
    public int[] solution(int[] num_list, int n) {
        // 데이터 준비
        int[] answer = new int[(num_list.length-1)/n+1];

        // 데이터 담기
        for (int i=0; i<num_list.length; i+=n) {
            answer[i/n] = num_list[i];
        }

        // 리턴
        return answer;
    }
}
