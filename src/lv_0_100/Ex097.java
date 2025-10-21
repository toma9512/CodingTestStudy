package lv_0_100;
/*
- 특별한 이차원 배열 1

문제 설명
정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.

제한사항
1 ≤ n ≤ 100
 */

public class Ex097 {
    public int[][] solution(int n) {
        // 데이터 준비
        int[][] arr = new int[n][n];

        // 대각선 1로 채우기
        for (int i=0; i<n; i++) arr[i][i] = 1;

        // 리턴
        return arr;
    }
}
