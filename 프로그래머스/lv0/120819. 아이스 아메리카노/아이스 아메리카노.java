class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int maxCount = money / price; // 최대로 마실 수 있는 아메리카노의 잔 수
        int remainder = money % price; // 남는 돈
        
        int[] answer = { maxCount, remainder };
        return answer;
    }
}