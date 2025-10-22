package lv_0_240;

/*
문제 설명
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ score[0], score[1] ≤ 100
1 ≤ score의 길이 ≤ 10
score의 원소 길이는 2입니다.
score는 중복된 원소를 갖지 않습니다.
 */

import java.util.*;

public class Ex217 {
    public int[] solution(int[][] score) {
        // 데이터 준비
        double[] average = new double[score.length];
        int[] rank = new int[score.length];

        // 평균 구하기
        for (int i=0; i<score.length; i++) {
            average[i] = (score[i][0]+score[i][1])/2.0;
        }

        // 정렬한 배열 새로 만들기
        double[] sorted = Arrays.copyOf(average, average.length);
        Arrays.sort(sorted);

        // 등수 매기기
        for (int i=0; i<average.length; i++) {
            for (int j=0; j<sorted.length; j++) {
                if (average[i] == sorted[j])
                    rank[i] = average.length-j;
            }
        }

        // 리턴
        return rank;
    }
}
