package lv_0_100;

/*
- 홀수 vs 짝수

문제 설명
정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.

제한사항
5 ≤ num_list의 길이 ≤ 50
-9 ≤ num_list의 원소 ≤ 9
 */

public class Ex067 {
    public int solution(int[] num_list) {
        // 데이터 준비
        int even = 0;
        int odd = 0;

        // 홀수, 짝수 인덱스에 따라 합 구하기
        for (int i=0; i<num_list.length; i++) {
            if (i%2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        // 리턴
        return Math.max(even, odd);
    }
}
