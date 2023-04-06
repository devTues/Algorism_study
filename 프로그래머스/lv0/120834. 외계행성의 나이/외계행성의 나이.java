class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder(); // 문자열
        
        while(age > 0) {
            int remain = age % 10; // 나이를 10으로 나눈 몫 구하기
            char c = (char)('a' + remain); // 몫을 알파벳으로 변환
            sb.append(c); // append사용하여 추가
            age /= 10; // 나이를 10으로 나눈 나머지로 초기화
        }
        
        String answer = sb.reverse().toString(); //문자열 뒤집어서
        return answer;
    }
}