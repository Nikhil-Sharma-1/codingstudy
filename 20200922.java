class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int [prices.length];
        int count = 0;
        int val = 0;
        while(val<prices.length){
            count=0;
        for(int i=val;i<prices.length-1;i++)
        {
            if(prices[val]>prices[i])
            {
                break;
            }
            count++;
        }
            answer[val] = count;
            val++;
        }
        return answer;
    }
}
