package com.shikha.output;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

public class CSVOutputBuilder implements OutputBuilder {

    public void build(List result,String filepath)
    {

         System.out.println("I am inside build method ");

         try{

             FileWriter writer=new FileWriter(new File(filepath));

             Iterator itr= result.iterator();
             while (itr.hasNext())
             {
                 CSVOutputManegerImpl csvmanager1= (CSVOutputManegerImpl)itr.next() ;

                 String finalResult=csvmanager1.getTestID()+","+csvmanager1.getTestDescrption()+","+csvmanager1.getTestResult()+","+csvmanager1.getTestTime()+"\n";//"kunal,shikha,tolu,shivam";
                 writer.write(finalResult);

             }


             writer.flush();
             writer.close();
         }catch (Exception e){
             System.out.println(e.getMessage());
         }


    }





}
