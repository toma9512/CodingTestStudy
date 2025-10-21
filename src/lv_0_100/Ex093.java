package lv_0_100;

/*
- 이차원 배열 대각선 순회하기

문제 설명
2차원 정수 배열 board와 정수 k가 주어집니다.
i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ board의 길이 ≤ 100
1 ≤ board[i]의 길이 ≤ 100
1 ≤ board[i][j] ≤ 10,000
모든 board[i]의 길이는 같습니다.
0 ≤ k < board의 길이 + board[i]의 길이

 */

public class Ex093 {
    public int solution(int[][] board, int k) {
        // 데이터 준비
        int sum = 0;

        // 합 구하기
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (i+j <= k) sum += board[i][j];
            }
        }

        // 리턴
        return sum;
    }
}
