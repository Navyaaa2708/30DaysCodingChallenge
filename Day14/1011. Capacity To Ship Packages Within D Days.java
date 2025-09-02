class Solution {
    public int shipWithinDays(int[] weights, int days){
        int low=0, high=0;
        for (int weight : weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while (low<high) {
            int mid=low+(high-low)/2;
            if (canShip(weights,days,mid)) high=mid;
            else low=mid+1;
        }
        return low;
    }
    private boolean canShip(int[] weights, int days, int capacity){
        int dayCount=1, curr=0;
        for (int weight : weights) {
            if (curr+weight>capacity) {
                dayCount++;
                curr=0;
            }
            curr+=weight;
        }
        return dayCount<=days;
    }
}