package com.infy.vivah;

/**
 * Created by ravi on 01/04/2017.
 */
class Employee1 {
    Address address; // =new Address();  //Assume Injection of another Object at reference variable declaration

    Employee1(){
        address=new Address(); //Assume Injection of another Object through constructor.
    }
}
