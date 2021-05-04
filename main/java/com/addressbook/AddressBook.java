package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Person> data=new ArrayList<Person>();

    //method to read string value from user
    public String readString(String displayMessage){

        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        String input=sc.nextLine();

        return input;
    }

    //method to read long data
    public long readLong(String displayMessage){

        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        long input=sc.nextLong();

        return input;
    }

    //method to add person to address book
    public boolean addPerson(){
        String firstName=readString("Enter Person's first name: ");
        String lastName = readString("Enter person's last name");
        String city=readString("Enter where he/she lives first enter City: ");
        String state=readString("Now, enter State: ");
        String address=readString("Now, enter full address: ");
        String email=readString("Now, enter email: ");
        String zipCode=readString("At last enter, area's Zip Code: ");
        long phoneNumber=readLong("Enter his/her phone number: ");
        Person newEntry=new Person(firstName, lastName, city, state, address, email, zipCode, phoneNumber);

        this.data.add(newEntry);
        System.out.println(firstName+" added successfully to address book.");
        boolean added = this.data.add(newEntry);
        return added;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addPerson();

    }
}
