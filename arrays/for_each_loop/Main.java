package com.example;

public class Main {
    public static boolean allWeightsPositive(int[] packageWeights) {
        for (int weight : packageWeights) {
            if (weight < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] packageWeights = {15, 22, 18, -4, 30, 25};

        if (allWeightsPositive(packageWeights)) {
            System.out.println("All packages have positive weights");
        } else {
            System.out.println("There are packages with negative weights");
        }
    }
}