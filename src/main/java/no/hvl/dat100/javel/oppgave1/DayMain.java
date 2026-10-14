package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // Oppgave 1 a)

        // Oppgave 1 b)
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);

        // Oppgave 1 c)
        System.out.println("\n" + DailyPower.computePowerUsage(powerusage_day));

        // Oppgave 1 d)

        // Oppgave 1 e)

        // Oppgave 1 f)
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));

        //Oppgave 1 h)
        System.out.println(DailyPower.findPeakUsage(powerusage_day));

        // Oppgave 1 i)
        System.out.println(DailyPower.findAvgPower(powerusage_day));
    }
}
