package lv_1;

/*
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */

// public class Ex36 {
//     public String solution(String s) {
//         // 데이터 준비
//         String[] arr = s.split(" ");
//         String answer = "";
//
//         // 알파벳 바꾸기
//         for (int i=0; i<arr.length; i++) {
//             // 데이터 초기화
//             String word = "";
//             char[] ch = arr[i].toCharArray();
//
//             // 대문자, 소문자로 바꾸기
//             for (int j=0; j<ch.length; j++) {
//                 if (j%2 == 0) {
//                     if (ch[j]>='a' && ch[j]<='z') word += (char) (ch[j]-'a'+'A');
//                     else word += (char) ch[j];
//                 } else {
//                     if (ch[j]>='a' && ch[j]<='z') word += (char) ch[j];
//                     else word += (char) (ch[j]+'a'-'A');
//                 }
//             }
//
//             // 바꾸기
//             arr[i] = word;
//         }
//
//         // 공백 넣기
//         String sum = String.join("",arr);
//         int len = 0; // 공백 길이
//         for (int i=0; i<s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 answer += " ";
//                 len++;
//             } else {
//                 answer += sum.charAt(i-len);
//             }
//         }
//
//         // 리턴
//         return answer;
//     }
// }

public class Ex36 {
    public String solution(String s) {
        // 데이터 준비
        String[] arr = s.split("");
        String answer = "";
        int count = 0;

        // 데이터 담기
        for (int i=0; i<arr.length; i++) {
            count = (arr[i].equals(" ")) ? 0 : count+1;
            answer += (count%2==1) ? arr[i].toUpperCase() : arr[i].toLowerCase();
        }

        // 리턴
        return answer;
    }
}