class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=1;
        while(i<nums.length){
            if(nums[i]==0){
                while(j<nums.length && nums[j]==0){
                    j++;
                }
                if(j==nums.length)  break;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;
            j=Math.max(i,j);
        }
    }
}
