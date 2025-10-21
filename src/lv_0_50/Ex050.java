package lv_0_50;

/*
- 배열의 원소 삭제하기

문제 설명
정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소 ≤ 1,000
arr의 원소는 모두 서로 다릅니다.
1 ≤ delete_list의 길이 ≤ 100
1 ≤ delete_list의 원소 ≤ 1,000
delete_list의 원소는 모두 서로 다릅니다.
 */

public class Ex050 {
    public int[] solution(int[] arr, int[] delete_list) {
        // 데이터 준비
        int count = 0;
        int[] check = new int[arr.length];

        // arr에 삭제해야할 인덱스를 check에 저장
        for (int i=0; i<arr.length; i++) {
            for (int j : delete_list) {
                if (arr[i] == j) {
                    check[i] = 1;
                    count++;
                    break;
                }
            }
        }

        // 리턴할 데이터,인덱스 준비
        int[] answer = new int[arr.length-count];
        int idx = 0;

        // check를 반복문으로 돌면서 원소가 0인 인덱스를 arr에서 가져와 answer에 저장
        for (int i=0; i<arr.length; i++) {
            if (check[i] == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        // 리턴
        return answer;
    }
}
