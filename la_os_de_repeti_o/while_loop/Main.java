package com.example;

public class Main {
    public static int sumFrom1ToN(int n) {
        int sum = 0;
        int current = 1;

        while (current <= n) {
            sum = sum + current;
            current = current + 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumFrom1ToN(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + result);
    }
}