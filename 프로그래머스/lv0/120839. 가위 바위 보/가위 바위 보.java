class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if (c == '2') { // 가위인 경우
                answer.append('0'); // 바위를 이기기 위해 '0'을 추가
            } else if (c == '0') { // 바위인 경우
                answer.append('5'); // 보를 이기기 위해 '5'를 추가
            } else if (c == '5') { // 보인 경우
                answer.append('2'); // 가위를 이기기 위해 '2'를 추가
            }
        }
        return answer.toString();
    }
}