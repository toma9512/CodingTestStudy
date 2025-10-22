package lv_0_240;

/*
문제 설명
점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
dots의 길이 = 4
dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
0 ≤ x, y ≤ 100
서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
 */

public class Ex238 {
    public int solution(int[][] dots) {
        // 데이터 준비
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i=0; i<4; i++) {
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }
        int[] para = new int[6];

        // 평행한지 확인
        for (int i=0; i<3; i++) {
            for (int j=i+1; j<4; j++) {
                // 비교할 대상들
                int k = 3-i;
                int l = 3-j;
                if (i+j == 3) {
                    if (i==0) {
                        k = 1;
                        l = 2;
                    } else {
                        k = 0;
                        l = 3;
                    }
                }
                if ((x[i]-x[j])*(y[k]-y[l])
                        == (x[k]-x[l])*(y[i]-y[j])) {
                    System.out.print(i+""+j);
                    return 1;
                }
            }
        }

        // 리턴
        return 0;
    }
}
