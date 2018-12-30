package com.shikha.input;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVInputProcessor {

    public List<CSVInputManagerImpl> process(String filepath) {


        List<CSVInputManagerImpl> csvInputManagers = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(filepath));

            List<String[]> records = reader.readAll();
            Iterator<String[]> iterator = records.iterator();
            while (iterator.hasNext()) {

                String[] row = iterator.next();
                CSVInputManagerImpl inputTestRow = new CSVInputManagerImpl();


                inputTestRow.setTestID(row[0]);
                inputTestRow.setTestAction(row[1]);
                inputTestRow.setTestDescrption(row[2]);
                inputTestRow.setTestlocato(row[3]);
                inputTestRow.setTestValue(row[4]);
                inputTestRow.setTestverify(row[5]);


                System.out.println(inputTestRow.toString());


            }


        } catch (Exception e) {
            System.out.println();
        }

        return csvInputManagers;
    }

}

