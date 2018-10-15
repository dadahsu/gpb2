package com.ruckuswireless.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Reader2 {
    public static void main(String[] args) throws IOException {
        AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder().mergeFrom(new FileInputStream(
                "D:\\tmp\\gpb3.bin")).build();
        System.out.println(person);
    }
}
