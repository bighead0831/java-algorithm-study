class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int oddPos = 1;
        int evenSum = 0;
        int evenPos = 1;
        
        for(int i=num_list.length-1; i>=0; i--) {
            if(num_list[i]%2==0) {
                evenSum += num_list[i]*evenPos;
                evenPos *= 10;
            } else {
                oddSum += num_list[i]*oddPos;
                oddPos *= 10;
            }
        }
        
        return oddSum+evenSum;
    }
}