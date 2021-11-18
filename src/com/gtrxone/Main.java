package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            String printNumbers = "";
            while (number >= 2) {
                int temp = number % 10;
                if (temp % 2 == 0) {
                    sum += temp;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
