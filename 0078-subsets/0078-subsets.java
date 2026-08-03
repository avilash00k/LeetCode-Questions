class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void subsets(int[] nums, int idx, List<Integer> curr, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        subsets(nums, idx + 1, curr, ans);
        curr.remove(curr.size() - 1);
        subsets(nums, idx + 1, curr, ans);
    }
}