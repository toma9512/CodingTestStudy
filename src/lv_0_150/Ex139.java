package lv_0_150;

/*
문제 설명
양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ n ≤ 30
 */

public class Ex139 {
    public int[][] solution(int n) {
        // 데이터 준비
        int[][] arr = new int[n][n];
        char dir = 'r';
        int x = 0;
        int y = 0;

        // 나선형으로 배치하기
        arr[0][0] = 1;
        for (int i=2; i<=n*n; i++) {
            // x,y 저장
            int tempX = x;
            int tempY = y;

            // 방향에 따라 이동
            switch (dir) {
                case 'r' :
                    tempX++;
                    break;
                case 'd' :
                    tempY++;
                    break;
                case 'l' :
                    tempX--;
                    break;
                case 'u' :
                    tempY--;
                    break;
            }

            if (tempX==n || (dir=='r' && arr[tempY][tempX]!=0)) { // 오른쪽으로 가다가 막혔을 때
                dir = 'd'; // 아래로 내려갈 수 있도록
                i--; // 반복문 다시 실행하도록
                continue;
            } else if (tempY==n || (dir=='d' && arr[tempY][tempX]!=0)) { // 밑으로 가다가 막혔을 때
                dir = 'l';
                i--;
                continue;
            } else if (tempX==-1 || (dir=='l' && arr[tempY][tempX]!=0)) { // 왼쪽
                dir = 'u';
                i--;
                continue;
            } else if (tempY==-1 || (dir=='u' && arr[tempY][tempX]!=0)) { // 위
                dir = 'r';
                i--;
                continue;
            }

            // 막히지 않았을 때
            x = tempX;
            y = tempY;
            arr[y][x] = i;
        }

        // 리턴
        return arr;
    }
}
