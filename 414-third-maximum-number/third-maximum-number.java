class Solution {
    public int thirdMax(int[] nums) {
     
     Set<Integer> hs=new HashSet<>();
     for(int a:nums){
     hs.add(a);
     }
     int k=0;
     int a1[]=new int[hs.size()];
     for(int i:hs){
        a1[k]=i;
        k++;
     }
     Arrays.sort(a1);
     if(a1.length<3) return a1[a1.length-1];
     else return a1[a1.length-3];

        
    }
}