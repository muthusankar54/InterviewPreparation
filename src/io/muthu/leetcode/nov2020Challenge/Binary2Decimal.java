package io.muthu.leetcode.nov2020Challenge;

public class Binary2Decimal {


    public static void main(String[] args) {

        int binary = 101;

        int result = binaryToDecimalConversion(binary);
        System.out.println("Final output  ===>"+result);
    }

    private static int binaryToDecimalConversion(int binary) {
        int base =1;
        int decValue = 0;
        int temp = binary;

        while (temp>0){
            int digit = temp%10;
            temp /= 10;
            decValue +=digit*base;
            base *=2;
        }

        return decValue;
    }
}
