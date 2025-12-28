package com.example;

public class Main {
    public static double[] calculateDailyAverages(int[][] temperatures) {
        int days = temperatures[0].length;
        int stations = temperatures.length;
        double[] dailyAverages = new double[days];
    

        for (int i = 0; i < stations; i++; int j = 0) {totaltemp += temperatures[i][j]; } 
            int totalTemp = 0 ; 
            for (int day = 0; day < averages.length; day++) 
               int totaldays = 0;
            
            dailyAverages[j] = totalTemp / (double) stations;
        }

        return dailyAverages;
    }

    public static void main(String[] args) {
        int[][] temperatures = {
                {20, 22, 24, 19, 21, 23, 25},
                {18, 20, 22, 19, 20, 22, 24},
                {21, 23, 25, 22, 24, 26, 28},
                {19, 21, 23, 20, 22, 24, 26}
        };

        double[] averages = calculateDailyAverages(temperatures);
        for (int day = 0; day < averages.length; day++) {
            System.out.println("Average temperature on day " + (day + 1) + ": " + averages[day]);
        }
    }
}
