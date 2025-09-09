class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets(nums, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }
    void subsets(int[] nums, List<Integer> ans, int i){
            if(i==nums.length){
                res.add(new ArrayList<>(ans));
                return;
            }
            ans.add(nums[i]);
            subsets(nums, ans, i+1);
            ans.remove(ans.size()-1);
            subsets(nums, ans, i+1);
    }
}