package com.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    @Test
    //to validate person is added in AddressBook or not
    public void givenPersonDetails_ShouldAddedInAddressBook()
    {
        AddressBook addressBook = new AddressBook();
        boolean check = addressBook.addPerson();
        Assertions.assertEquals("true",check);
    }
}
