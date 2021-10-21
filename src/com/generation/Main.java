package com.generation;

import com.generation.Bank.BankAccount;
import com.generation.package1.Person;
import com.generation.package2.Beast;

public class Main {

    public static float number = 10;
    public static int divider = 0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("before the division");

        try {
            division = number / divider;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println(division);
        System.out.println("after the division");

        /*
        Person person= new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");

        System.out.println("name: " + person.getName());
        System.out.println("age: " + person.getAge());
        System.out.println("id: " + person.getId());

        BankAccount account = new BankAccount();
        account.setName("Somebody");
        account.setKey("123456789qw");
        account.setBalance(100000);

        System.out.println(account.getName());
        account.showBalance();

        // alt+enter importar
        Beast creature = new Beast();
        creature.name = "Elk";

         */

        /*
        Person pal = new Person();
        pal.name = "Moisés";
        pal.age = 25;
        pal.greet();
         */

    }
}
