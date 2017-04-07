package com.infy.ioc;

/**
 * Created by ravi on 01/04/2017.
 */
    public class InfyEmployment {
    public static void main(String[] args) {
        //approach1 - Tight Coupled
        Employee1 employee1 = new Employee1();
        System.out.println("Employee1 getCurrentAddress: "+ employee1.address.getCurrentAddress());
        System.out.println("Employee1 getPermanentAddress: "+ employee1.address.getPermanentAddress());

        //approach2 a)
        Address addressSesh = new Address();
        Employee2 empShesh= new Employee2(addressSesh);
        System.out.println("Employee2 getCurrentAddress: "+empShesh.address.getCurrentAddress());
        System.out.println("Employee2 getPermanentAddress: "+empShesh.address.getPermanentAddress());

        //approach2 b)
        Address addressRavi = new Address("Glasgow, Scotland","Pandhurna, MP"); //address manipulation/ user define creation

        Employee2 empRavi= new Employee2(addressRavi);
        System.out.println("Employee3 getCurrentAddress: "+empRavi.address.getCurrentAddress());
        System.out.println("Employee3 getPermanentAddress: "+empRavi.address.getPermanentAddress());

    }
}
