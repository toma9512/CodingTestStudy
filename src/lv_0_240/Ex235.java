package lv_0_240;

/*
문제 설명
다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
image.png
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

제한사항
board는 n * n 배열입니다.
1 ≤ n ≤ 100
지뢰는 1로 표시되어 있습니다.
board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
 */

public class Ex235 {
    public int solution(int[][] board) {
        // 데이터 준비
        int count = 0;
        int n = board.length;

        // 길이가 1일 때
        if (n == 1) {
            return board[0][0] == 0 ? 1 : 0;
        }

        // 1인 지역 근처를 -1로 바꾸기
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 1) {
                    // 데이터 초기화
                    int[] xArr = {-1,0,1};
                    int[] yArr = {-1,0,1};

                    // 폭탄이 모서리에 있을 때
                    if (i == 0) xArr = new int[] {0,1};
                    if (j == 0) yArr = new int[] {0,1};
                    if (i == n-1) xArr = new int[] {-1,0};
                    if (j == n-1) yArr = new int[] {-1,0};

                    // 인접한 지역 -1로 바꾸기
                    for (int x : xArr) {
                        for (int y : yArr) {
                            if (board[i+x][j+y]==0)
                                board[i+x][j+y] = -1;
                        }
                    }
                }
            }
        }

        // 0인 지역 세기
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 0) count++;
            }
        }

        // 리턴
        return count;
    }
}
