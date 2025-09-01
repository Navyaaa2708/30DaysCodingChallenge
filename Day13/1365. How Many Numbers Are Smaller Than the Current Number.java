class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] hash = new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=sum(hash,nums[i]);
        }
        return ans;
    }
    int sum(int[] hash,int no){
        int sum=0;
        for(int i=0;i<no;i++)
            sum+=hash[i];
        return sum;
    }
}