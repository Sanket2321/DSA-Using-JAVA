class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;


    if(word.contains("a") && word.contains("A")){
        count++;
    }if(word.contains("b") && word.contains("B")){
        count++;
    } if(word.contains("c") && word.contains("C")){
        count++;
        }
        if(word.contains("d") && word.contains("D")){
        count++;
        }
        
        if(word.contains("e") && word.contains("E")){
        count++;
        }
        
        if(word.contains("z") && word.contains("Z")){
        count++;
        }
return count;
}
}

        // for(int i=0;i<word.length()-1;i++){
        //       char ch=word.charAt(i);
        //        if((ch=='a'&& ch=='A')){
        //         count++;
        //        }else if((ch=='b' && ch=='B')){
        //         count++;
        //        }
        //        else if(ch=='c' && ch=='C'){
        //           count++;
        //        }
        //        else{
        //         return 0;
        //        }

        // }
        // return count;
        
    