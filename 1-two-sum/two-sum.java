class Solution {
    public int[] twoSum(int[] nums, int target) {
        
 
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//              if(nums[i]+nums[j]==target){
//                 return new int[]{i,j};

//             }
//         }
//     }
//    return new int[]{};

     int ans[]=new int[2];

     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
     }
     return ans;

}
}