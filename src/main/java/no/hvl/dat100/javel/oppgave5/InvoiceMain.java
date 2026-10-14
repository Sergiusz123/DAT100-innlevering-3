package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer kunde1 = new Customer("Ola Badil", "olabadil@gmail.com", 1005, PowerAgreementType.SPOTPRICE);
        Invoice faktura1 = new Invoice(kunde1, "Januar", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);

        Customer kunde2 = new Customer("Kari Hansen", "karihansen@gmail.com", 1006, PowerAgreementType.NORGESPRICE);
        Invoice faktura2 = new Invoice(kunde2, "Februar", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);

        Customer kunde3 = new Customer("Per Lunde", "perlunde@gmail.com", 1007, PowerAgreementType.POWERSUPPORT);
        Invoice faktura3 = new Invoice(kunde3, "Mars", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);
        // b)
        faktura1.computeAmount();

        // c)
        faktura1.printInvoice();

        // d)
        System.out.println("\n oppgave 5 d \n");
        Invoice[] yearInvoices = {faktura1, faktura2, faktura3};
        Invoices.processInvoices(yearInvoices);
        
    }

}
