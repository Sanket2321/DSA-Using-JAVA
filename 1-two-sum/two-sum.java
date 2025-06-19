//first method
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];

        for(int i =0; i < nums.length - 1; i++) {
            for(int j = i + 1 ; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            } 
        }

        return ans;
    }
}




//second method
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int r_n=target-nums[i];
            if(hm.containsKey(r_n))
            {
                int arr[]={hm.get(r_n),i};
                return arr;
            }
            hm.put(nums[i],i);

        }
        return null;
        
    }
} */