package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month

    // a)
    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    // b) Feil (Metoden skal ta hensyn til hvilken strømavtale kunder har)
    public void computeAmount() {

        this.amount = 0;

        for (int dag = 0; dag < this.usage.length; dag++) {

            for (int time = 0; time < this.usage[dag].length; time++) {

                this.amount += usage[dag][time] * prices[dag][time];
            }
        }
    }

    // c)
    public void printInvoice() {

        double totalUsage = 0;

        for (int i = 0; i < this.usage.length; i++) {

            for (int j = 0; j < this.usage[i].length; j++) {

                totalUsage += this.usage[i][j];
            }
        }

        System.out.printf(
        "Customer number: " + c.getCustomer_id() + "\n" + 
        "Name: " + c.getName() + "\n" + 
        c.getEmail() + "\n" +
        c.getAgreement() + "\n" +
        "Måned: " + this.month + "\n" +
        "Forbruk: %.2f kWh\n" +
        "Beløp: %.2f kr", totalUsage, this.amount);
    }
}
