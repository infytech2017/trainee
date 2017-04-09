package com.infy.ioc.dao.impl;

import com.infy.ioc.dao.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator
{
    public void generateOutput(){
        System.out.println("Csv Output Generator");
    }
}