class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),new boolean[nums.length]);
        return res;
    }
    void backtrack(int[] nums,List<Integer> ans,boolean[] used){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;
            ans.add(nums[i]);
            used[i]=true;
            backtrack(nums,ans,used);
            used[i]=false;
            ans.remove(ans.size()-1);
        }
    }
}