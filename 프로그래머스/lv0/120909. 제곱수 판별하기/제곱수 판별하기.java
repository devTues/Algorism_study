class Solution {
    public int solution(int n) {
        int answer = 2;
        
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n) {
            answer = 1;
        }
        
        return answer;
    }
}