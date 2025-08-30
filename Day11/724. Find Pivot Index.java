class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }  
        int prefSum=0;
        for(int i=0;i<nums.length;i++){
            int sufSum=sum-prefSum-nums[i];
            if(prefSum==sufSum) return i;           
            prefSum+=nums[i];
        }
        return -1;
    }
}