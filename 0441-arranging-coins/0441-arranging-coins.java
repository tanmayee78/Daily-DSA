class Solution {
    public int arrangeCoins(int n) {
        int low = 1, high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            long k = (long)mid*(mid+1)/2;
            if(k <= n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
}