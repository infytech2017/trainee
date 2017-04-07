package com.infy.ioc;

/**
 * Created by ravi on 01/04/2017.
 */
public class Address { //POJO
    private String currentAddress;
    private String permanentAddress;


    public Address() {
        this.currentAddress = new String("BTM Layout, Bangalore");
        this.permanentAddress = new String("Adyal, Bhandara");
    }
    public Address(String currentAddress, String permanentAddress) {
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
}
