// class Solution {
//     public int[] plusOne(int[] digits) {
         
//          StringBuilder sb1=new StringBuilder();
//          for(int i:digits){
//             sb1.append(i);
//          }
//           int num= Integer.parseInt(sb1.toString());
//           int n=num+1;
//           StringBuilder sb=new StringBuilder();
//        for(int i:digits){
//            sb.append(i);
           
//        }
//         n=Integer.parseInt(sb.toString());
//      num=n+1;


//  String numStr=Integer.toString(num);
//            int arr1[]=new int[numStr.length()];
//            for(int i=0;i<numStr.length();i++){
//                       arr1[i]=Character.getNumericValue(numStr.charAt(i));
//            }
//            return arr1;
//     }
// }
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb1 = new StringBuilder();
        for (int i : digits) {
            sb1.append(i);
        }

        // Use BigInteger to handle large numbers
        BigInteger num = new BigInteger(sb1.toString());
        BigInteger n = num.add(BigInteger.ONE);

        String numStr = n.toString();
        int arr1[] = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            arr1[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return arr1;
    }
}