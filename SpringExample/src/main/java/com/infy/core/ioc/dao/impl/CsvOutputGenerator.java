package com.infy.core.ioc.dao.impl;

import com.infy.core.ioc.dao.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator
{
    public void generateOutput(){
        System.out.println("Csv Output Generator");
    }
}