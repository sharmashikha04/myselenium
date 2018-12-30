package com.shikha;

import com.shikha.input.CSVInputProcessor;
import com.shikha.output.CSVOutputBuilder;
import com.shikha.output.CSVOutputManegerImpl;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class MySeleniumDriverApp {


    public static void main(String args[]) {
        String filepath="src/main/resources/output.csv";

      /*  String filepath="src/main/resources/input.csv";
        CSVInputProcessor csvProcessor=new CSVInputProcessor();
        csvProcessor.process(filepath);


       System.out.println(" Hi Kunal ....");*/


        CSVOutputManegerImpl csvmanager= new CSVOutputManegerImpl();
        csvmanager.setTestID("Test id 1");
        csvmanager.setTestDescrption("This is first demo");
        csvmanager.setTestResult("pass");
        csvmanager.setTestTime(10);

        CSVOutputManegerImpl csvmanager1= new CSVOutputManegerImpl();

        csvmanager1.setTestID("Test id 2");
        csvmanager1.setTestDescrption("This is first demo -2");
        csvmanager1.setTestResult("pass");
        csvmanager1.setTestTime(100);


        List result=new ArrayList();
        result.add(csvmanager);
        result.add(csvmanager1);

        CSVOutputBuilder csvOutputBuilder=new CSVOutputBuilder();
        csvOutputBuilder.build(result,filepath);



    }
}