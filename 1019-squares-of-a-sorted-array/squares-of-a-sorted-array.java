class Solution {
    public int[] sortedSquares(int[] nums) {
    //    Arrays.sort(nums);
        int temp[]=new int[nums.length];
    
        for( int i=0;i<=nums.length-1;i++){
            
             temp[i]=nums[i]*nums[i];
        }
        Arrays.sort(temp);
        return temp;

        
    }
}