import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 배열 오름차순
        Arrays.sort(array);
        // 배열의 길이
        int len = array.length;
        
        int answer = 1;
        
        if(len % 2 == 0) { // 배열의 길이가 짝수일 경우
            return answer = (array[len/2-1] + array[len/2]) /2;
        } else { // 배열의 길이가 홀수일 경우
            return answer = array[len/2];
        }
        
    }
}