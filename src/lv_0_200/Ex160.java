package lv_0_200;

/*
문제 설명
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 1,000
0 ≤ n ≤ 1,000
 */

public class Ex160 {
    public int solution(int[] array, int n) {
        // 데이터 준비
        int count = 0;

        // 데이터 담기
        for (int i : array) {
            if (i == n) count++;
        }

        // 리턴
        return count;
    }
}
