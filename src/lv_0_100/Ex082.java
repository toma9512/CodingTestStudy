package lv_0_100;

/*
- 순서 바꾸기

문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
 */

public class Ex082 {
    public int[] solution(int[] num_list, int n) {
        // 데이터 준비
        int[] arr = new int[num_list.length];

        // 데이터 담기
        for (int i=n; i<num_list.length; i++) arr[i-n] = num_list[i];
        for (int i=0; i<n; i++) arr[i+num_list.length-n] = num_list[i];

        // 리턴
        return arr;
    }
}
