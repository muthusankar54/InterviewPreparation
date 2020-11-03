package io.muthu.leetcode.nov2020Challenge;

public class ConsecutiveCharacters {


    public int maxPower(String s) {
        char [] chArray = s.toCharArray();
        int chLength = chArray.length;
        char prev,next;
        int count = 0;
        int max_count =1;
        char max_char = chArray[0];
        for(int i=0;i<chLength-1;i++){
            prev = chArray[i];
            next = chArray[i+1];
            if(prev == next){
                count +=1;
            }else{
                count=1;
            }
            if(count>max_count){
                max_count= count;
                max_char=chArray[i];
            }
        }
        System.out.println("Max count==>"+max_count);
        System.out.println("Max count char==>"+max_char);

        return max_count;

    }

    public static void main(String[] args) {

        String s = "cc";
        ConsecutiveCharacters cs = new ConsecutiveCharacters();
        cs.maxPower(s);
    }
}
