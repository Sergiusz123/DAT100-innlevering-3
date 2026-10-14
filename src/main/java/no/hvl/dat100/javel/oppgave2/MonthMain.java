package no.hvl.dat100.javel.oppgave2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //Oppgave 2 a)
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        
        //Oppgave 2 b)
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        //Oppgave 2 c)
        System.out.println(MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println();

        //Oppgave 2 d)
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 2000));
        System.out.println();

        //Oppgave 2 e)
        System.out.printf("%.2f kr%n", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println();

        //Oppgave 2 f)
        System.out.println(MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println();

        //Oppgave 2 g)
        System.out.println(MonthlyPower.computeNorgesPrice(power_usage_month));
        System.out.println();
    }
}