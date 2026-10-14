package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void print_PowerUsage(double[][] usage) {

        double prisdag = 0;
        double prismaaned = 0;
        for ( int i = 0; i<usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                prisdag += usage[i][j];
            }
            System.out.printf(" Dag %d: %.2f NOK%n ", i, prisdag);
            prismaaned += prisdag;
            prisdag = 0;
            System.out.println("\n");
        }
        
        System.out.printf("Pris for hele måneden: %.2f NOK ", prismaaned);

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (double stromBruk: DayPowerData.powerusage_day) {

            System.out.print(stromBruk + " kWh ");
        }
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for(double power : usage){
            sum += power;
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;

        while ( exceeded == false && i< powerusage.length){
            for( int j = 0; j<powerusage[i].length; j++){
                usage += powerusage[i][j];
                System.out.printf("%.2f kWh",usage);
                System.out.println();
            }

            if ( usage > threshold ){
                exceeded = true;
        }
            i++;
    }
    }
    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        double prisOver = 0;

        if (price > THRESHOLD) {
            prisOver = price - THRESHOLD;
        }

        support = prisOver * PERCENTAGE * usage;

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for(int i = 0; i < usage.length; i++){
            double pris = usage[i] * prices[i];
            double utenStottePris = pris - 0.9625;
            double stotte = utenStottePris * 0.9;
            
            support += stotte;
        }

        return support;
    }

    // g) compute norges pris for a single day
    private static final double NORGESPRIS_KWH = 0.5;

    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        // TODO

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = usage[0];

        for (int i = 0; i < usage.length; i++) {

            if (temp_max < usage[i]) {
                temp_max = usage[i];
            }
        }

        return temp_max;
    }

    // i) 
    public static double findAvgPower(double[] usage) {

        double average = 0;
        double sum = 0;

        for(double power : usage){
            sum += power;
        }
        average = sum / usage.length;

        return average;
    }
}