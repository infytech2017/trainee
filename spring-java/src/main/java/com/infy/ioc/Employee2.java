package com.infy.ioc;

/**
 * Created by ravi on 01/04/2017.
 */
class Employee2 {

    Address address; // =new Address();  //Assume Injection of another Object at reference variable declaration

    Employee2(Address incomingAddress){ //Constructor Injection
        this.address=incomingAddress; //Initialization/indirect object injection. To achive loose couplign
    }
}
