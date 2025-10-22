package lv_0_240;

/*
문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

제한사항
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000
 */

import java.util.*;

public class Ex228 {
    public int solution(int[] array) {
        // 데이터 준비
        int count = 0; // 최대 갯수
        int max = -1; // 최대 갯수인 숫자
        int temp = 1; // 반복문 돌면서 임시로 갯수를 저장할 변수

        // 정렬
        Arrays.sort(array);

        // 갯수 세기
        for (int i=0; i<array.length-1; i++) {
            if (array[i] == array[i+1]) temp++; // 앞 뒤가 같을 때
            else if (temp > count) { // 최대 갯수가 바뀔 때
                max = array[i];
                count = temp;
                temp = 1;
            } else if (temp == count) { // 최대 갯수가 같을 때
                max = -1;
                temp = 1;
            } else temp = 1;
        }
        // 한번 더
        if (temp > count) { // 최대 갯수가 바뀔 때
            max = array[array.length-1];
            count = temp;
            temp = 1;
        } else if (temp == count) { // 최대 갯수가 같을 때
            max = -1;
            temp = 1;
        }

        // 리턴
        return max;
    }
}
