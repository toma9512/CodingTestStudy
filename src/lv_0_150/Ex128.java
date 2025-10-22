package lv_0_150;

/*
문제 설명
직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ picture의 길이 ≤ 20
1 ≤ picture의 원소의 길이 ≤ 20
모든 picture의 원소의 길이는 같습니다.
picture의 원소는 '.'과 'x'로 이루어져 있습니다.
1 ≤ k ≤ 10
 */

public class Ex128 {
    public String[] solution(String[] picture, int k) {
        // 데이터 준비
        String[] answer = new String[picture.length*k];

        // 데이터 담기
        for (int i=0; i<picture.length; i++) {
            // 초기화
            String word = "";

            // 단어마다 배율 늘리기
            for (int l=0; l<picture[i].length(); l++) {
                for (int m=0; m<k; m++) {
                    word += picture[i].charAt(l);
                }
            }

            // k개만큼 저장
            for (int j=0; j<k; j++) {
                answer[i*k+j] = word;
            }
        }

        // 리턴
        return answer;
    }
}
