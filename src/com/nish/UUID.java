package com.nish;

public class UUID {
    public static void main(String[] args) throws Exception 
    {
        double x = Math.pow(2, 122);
        for (int i = 35; i < 62; i++) 
        {
            double n = Math.pow(2, i);
            double p = 1 - Math.exp(-(n * n) / 2 / x);
            System.out.println("2^" + i + " = " + (1L << i) +  "  probability: 0 " + String.valueOf(1 + p).substring(1));
        }
    }
}