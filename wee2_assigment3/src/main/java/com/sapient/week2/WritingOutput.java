package com.sapient.week2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WritingOutput {
	public void getFinalReport(String fileName, ArrayList<Income> incomes) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Income i : incomes) {
            String record = "";
            if (!i.getCountry().equals("")) record += i.getCountry();
            else record += i.getCity();
            record += "," + i.getGender() + "," + i.getAmountUSD() + "\n";
            writer.write(record);
        }
        writer.close();
    }
}
