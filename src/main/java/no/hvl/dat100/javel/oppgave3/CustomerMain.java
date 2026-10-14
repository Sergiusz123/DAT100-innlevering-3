package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // e)
        Customer customer1 = new Customer("Bob", "Bob@gamil.com", 1355, PowerAgreementType.POWERSUPPORT);
        customer1.setName("Harry");
        customer1.setEmail("HarryPotter@gamil.com");
        customer1.setCustomer_id(1928);
        customer1.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCustomer_id());
        System.out.println(customer1.getAgreement());
        System.out.println();

        System.out.print(customer1.toString());
    }
}
