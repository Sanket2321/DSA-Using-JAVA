// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//          int n=arr.length-1;
//    for(int i=0;i<=n;i++){
//     for(int j=i+1;j<=n;j++){
        
//         for(int k=j+1;k<=n;k++){

//             if(arr[i]%2==1 && arr[j]%2==1 && arr[k]%2==1){
//                 return true;
//             }
        
//         }
//     }
    

//    }

//     return false;
//     }
// }

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
