package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++) {

            System.out.print("Dag " + (i+1) + ": ");

            for (int j = 0; j < prices[i].length; j++) {

                System.out.printf("%.2f kr ", prices[i][j]);
            }
            
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(double[] powerDay : usage){
            for(double power : powerDay){
                sum += power;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        // TODO

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {

            for (int j = 0; j < usage[i].length; j++) {

                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                double pris = usage[i][j] * prices[i][j];
                double utenStottePris = pris - 0.9625;
                double stotte = utenStottePris * 0.9;
                
                support += stotte;
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
