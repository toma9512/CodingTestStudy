package lv_0_150;

/*
문제 설명
정수 배열 arr와 query가 주어집니다.
query를 순회하면서 다음 작업을 반복합니다.
짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
5 ≤ arr의 길이 ≤ 100,000
0 ≤ arr의 원소 ≤ 100
1 ≤ query의 길이 < min(50, arr의 길이 / 2)
query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
 */

import java.util.*;

public class Ex136 {
    public int[] solution(int[] arr, int[] query) {
        for (int i=0; i<query.length; i++) {
            // i가 짝수일 때
            if (i%2 == 0) {
                int[] temp = Arrays.copyOf(arr, query[i]+1); // 복사
                arr = Arrays.copyOf(temp, query[i]+1); // 저장
            }

            // 홀수일 때
            else {
                int[] temp = new int[arr.length-query[i]];
                // 복사
                for (int j=0; j<temp.length; j++) {
                    temp[j] = arr[query[i]+j];
                }
                arr = temp; // 저장
            }
        }

        // 리턴
        return arr;
    }
}
