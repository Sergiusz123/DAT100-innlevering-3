package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;


public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer person1 = new Customer("Alice Smith", "alice@example.com", 3953, PowerAgreementType.SPOTPRICE);
        Customer person2 = new Customer("Bob Johnson", "bob@example.com", 4821, PowerAgreementType.POWERSUPPORT);
        Customer person3 = new Customer("Clara Nilsen", "clara@example.com", 2764, PowerAgreementType.NORGESPRICE);
        Customer person4 = new Customer("David Olsen", "david@example.com", 6190, PowerAgreementType.SPOTPRICE);

        // a)
        Customers customer = new Customers(4);
        
        // b)
        System.out.println("Antall kunder: " + customer.countNonNull());
        System.out.println();

        // d)
        customer.addCustomer(person1);
        customer.addCustomer(person2);
        customer.addCustomer(person3);
        customer.addCustomer(person4);
        System.out.println("Antall kunder etterpå: " + customer.countNonNull());
        System.out.println();

        // c)
        System.out.println(customer.getCustomer(person1.getCustomer_id()));
        System.out.println();
        System.out.println(customer.getCustomer(person2.getCustomer_id()));
        System.out.println();
        System.out.println(customer.getCustomer(person3.getCustomer_id()));
        System.out.println();
        System.out.println(customer.getCustomer(person4.getCustomer_id()));
        System.out.println();

        // e)
        customer.removeCustomer(person4.getCustomer_id());

        // f)
            System.out.println("Hele lista: ");
        for(Customer person : customer.getCustomers()){
            System.out.println(person);
            System.out.println();

        }
    }
}
