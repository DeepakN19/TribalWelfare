package com.example.majorproject;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CSVReader {

    public static void readData(String category, InputStream is){


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";

        try {
            reader.readLine();
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if(row[2].length() > 2 ){
                    String catInCsv = row[2];
                    if (catInCsv.equalsIgnoreCase(category)) {
                    Log.d("BBB", "\n Name : "+ row[1] + "    Details: "+ row[2]);
                    }
                }else {
                    Log.d("FFFF",row[0]);
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
