class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
/*1,1,1,2,2,2,2
n=7
num[4];
2,3,3
n=3
num[1.5]*/