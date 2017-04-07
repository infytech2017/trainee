package com.infy.ioc;

import java.util.List;

/**
 * Created by ravi on 01/04/2017.
 */
class Employee1 {
    Address address; // =new Address();  //Assume Injection of another Object at reference variable declaration
    List<Address> addressList;
    Employee1(){  //override default constructor
        address=new Address(); //Assume Injection of another Object through constructor. Tight Coupled
    }

    Employee1(Address address, List<Address> addressList){
        this.address=address;
        this.addressList=addressList;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
