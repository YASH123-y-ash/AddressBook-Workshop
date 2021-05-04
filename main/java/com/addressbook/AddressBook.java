package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> data = new ArrayList<>();
    public boolean addPerson()
    {
        Person person = new Person("Yash", "Wardhan", "purnea",
                "Bihar", "law collage road", "wardhan@gmail.com",
                "567474", 8834543444l);
        this.data.add(person);
        boolean added = this.data.add(person);
        return added;
    }

    public static void main(String[] args) {
        Person person = new Person("Yash", "Wardhan", "purnea",
                "Bihar", "law collage road", "wardhan@gmail.com",
                "567474", 8834543444l);
    }
}
