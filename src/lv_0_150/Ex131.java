package lv_0_150;

/*
문제 설명
이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소의 길이 ≤ 100
arr의 모든 원소의 길이는 같습니다.
1 ≤ arr의 원소의 원소 ≤ 1,000
 */

public class Ex131 {
    public int[][] solution(int[][] arr) {
        // 데이터 준비
        int m = arr.length;
        int n = arr[0].length;
        int max = Math.max(m, n);
        int[][] answer = new int[max][max];

        // 데이터 담기
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        // 리턴
        return answer;
    }
}
