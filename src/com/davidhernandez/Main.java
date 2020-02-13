package com.davidhernandez;


public class Main {

    public static void main(String[] args) {
//        Account davidsAcct = new Account();
//        davidsAcct.setCustomerName("David Hernandez");
//        davidsAcct.setAccountNumber("12345");
//        davidsAcct.setCustomerEmail("david@david.com");
//        davidsAcct.setPhoneNumber("814-135-1849");
//
//
//        davidsAcct.setBalance(100.00);
//        davidsAcct.withdrawal(100.00);
//
//        davidsAcct.deposit(50.00);
//        davidsAcct.withdrawal(100.00);
//
//        davidsAcct.deposit(51.00);
//        davidsAcct.withdrawal(101.00);
        VIPCustomer customer = new VIPCustomer();
        System.out.println(customer.getName());

        VIPCustomer customer1 = new VIPCustomer("David", 1500);
        System.out.println(customer1.getName());

        VIPCustomer customer2 = new VIPCustomer("Tina", 1000, "tina@gmail.com");
        System.out.println(customer2.getName());

    }
}
