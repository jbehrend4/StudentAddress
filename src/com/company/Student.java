package com.company;

public class Student {

    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.name = name;
        this.age = age;   
        address.setStreetAddress(streetAddress);
        address.setZipCode(zipCode);
        address.setState(state);
        address.setPhone(phone);
    }
    
    public void StudentAddress(Address address) {
        address.getStreetAddress();
        address.getZipCode();
        address.getState();
        address.getPhone();
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }
}
