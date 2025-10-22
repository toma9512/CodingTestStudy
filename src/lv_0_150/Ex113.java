package lv_0_150;

/*
문제 설명
정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
n 은 1, 2, 3, 4 중 하나입니다.
slicer의 길이 = 3
slicer에 담긴 정수를 차례대로 a, b, c라고 할 때
0 ≤ a ≤ b ≤ num_list의 길이 - 1
1 ≤ c ≤ 3
5 ≤ num_list의 길이 ≤ 30
0 ≤ num_list의 원소 ≤ 100
 */

public class Ex113 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // 데이터 준비
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int len = num_list.length;

        // n에 따라 다른 배열 리턴
        switch (n) {
            case 1 :
                answer = new int[b+1];
                for (int i=0; i<answer.length; i++) {
                    answer[i] = num_list[i];
                }
                break;
            case 2 :
                answer = new int[len-a];
                for (int i=0; i<answer.length; i++) {
                    answer[i] = num_list[a+i];
                }
                break;
            case 3 :
                answer = new int[b-a+1];
                for (int i=0; i<answer.length; i++) {
                    answer[i] = num_list[a+i];
                }
                break;
            case 4 :
                answer = new int[(b-a)/c+1];
                for (int i=0; i<answer.length; i++) {
                    answer[i] = num_list[a+i*c];
                }
                break;
        }

        // 리턴
        return answer;
    }
}
