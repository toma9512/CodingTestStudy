package lv_0_240;

/*
문제 설명
선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
line_2.png
선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.

제한사항
lines의 길이 = 3
lines의 원소의 길이 = 2
모든 선분은 길이가 1 이상입니다.
lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
-100 ≤ a < b ≤ 100
 */

public class Ex237 {
    public int solution(int[][] lines) {
        // 데이터 준비
        int max = -101;
        int min = 101;
        int count = 0;

        // 최대 최소 찾기
        for (int[] arr : lines) {
            max = Math.max(max, arr[1]);
            min = Math.min(min, arr[0]);
        }

        // 새로운 배열 생성
        int[] array = new int[max-min];

        // 선분 겹치기
        for (int[] arr : lines) {
            for (int i=arr[0]; i<arr[1]; i++) {
                array[i-min]++;
            }
        }

        // 겹치는 길이 찾기
        for (int i : array) {
            if (i > 1) count++;
        }

        // 리턴
        return count;
    }
}
