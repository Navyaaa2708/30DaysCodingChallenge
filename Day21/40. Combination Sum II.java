class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        Arrays.sort(candidates);
        subsets(candidates,new ArrayList<>(),0,target);
        return res;
    }
    void subsets(int[] nums,List<Integer> ans,int i,int target){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int j=i;j<nums.length;j++){
            if(j>i&&nums[j]==nums[j-1])continue;
            if(nums[j]>target)break;
            ans.add(nums[j]);
            subsets(nums,ans,j+1,target-nums[j]);
            ans.remove(ans.size()-1);
        }
    }
}