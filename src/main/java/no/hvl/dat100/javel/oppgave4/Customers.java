package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for (Customer customer : customers) {
            if (customer != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for (Customer kunde : customers) {

            if (kunde != null) {

                if (kunde.getCustomer_id() == customer_id) {
                    return kunde;
                }
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;
        int i = 0;

        while (!inserted && customers.length > i) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
            }
            i++;
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        int i = 0;

        for (Customer kunde : customers) {
            if (kunde.getCustomer_id() == customer_id && kunde != null) {
                c = kunde;
                customers[i] = null;
                deleted = true;
            }
            i += 1;
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int counter = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                counter++;
            }
        }

        Customer[] customersV2 = new Customer[counter];

        int j = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                customersV2[j] = customers[i];
                j++;
            }
        }
        return customersV2;
    }
}