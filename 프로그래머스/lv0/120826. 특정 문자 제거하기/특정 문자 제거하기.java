class Solution {
    public String solution(String my_string, String letter) {
       
        StringBuilder sb = new StringBuilder(); // 결과 문자열을 담을 StringBuilder 객체 생성

        for (int i = 0; i < my_string.length(); i++) { // my_string의 각 문자에 대해 반복
            char c = my_string.charAt(i);
            if (c != letter.charAt(0)) { // 현재 문자가 letter와 같지 않은 경우에만 StringBuilder에 추가
                sb.append(c);
            }
        }
        String answer = sb.toString();
        
        return answer;
    }
}