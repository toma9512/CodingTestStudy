package lv_0_150;

/*
문제 설명
랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
0 ≤ arr의 원소 ≤ 100,000
1 ≤ k ≤ 1,000
 */

public class Ex127 {
    public int[] solution(int[] arr, int k) {
        // 데이터 담기
        int[] answer = new int[k];
        int index = 0;

        // 데이터 담기
        for (int i=0; i<arr.length; i++) {
            // 중복 확인
            boolean check = true;
            for (int j=0; j<i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }

            // 중복이 없을 때 저장, index에 1더하기
            if (check) answer[index++] = arr[i];

            // 배열이 전부 채워지면 종료
            if (index == k) break;
        }

        // 완성될 배열의 길이가 k보다 작은 경우
        if (index != k) {
            for (int i=index; i<k; i++) answer[i] = -1;
        }

        // 리턴
        return answer;
    }
}
