class Solution {
    public void moveZeroes(int[] nums) {

        int n=nums.length;
        int zeros[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
         
            if(nums[i]!=0){
             zeros[index]=nums[i];
            index++;

            }

        }
        for(int i=0;i<n;i++){
            nums[i]=zeros[i];
        }

        
    }
}