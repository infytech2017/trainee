package com.infy.core.ioc.util;

import com.infy.core.ioc.dao.IOutputGenerator;

public class OutputHelper
{
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}