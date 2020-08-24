package com.sapient.week2;

import java.util.*;

public class calculate {
	convert_currency convert;
	ReadingInput read;
	WritingOutput write;
	private ArrayList<Income> incomes;
	calculate(){
		convert = new convert_currency();
		read = new ReadingInput();
		write = new WritingOutput();
		incomes = new ArrayList<Income>();
	}
	public ArrayList<Income> getIncomes() {
        return this.incomes;
    }

    public void setIncomes(ArrayList<Income> incomes) {
        this.incomes = incomes;
    }
	
    public void readData(String filePath, String fileType) throws Exception {
        ArrayList<String[]> records = new ArrayList<String[]>();
        if (fileType.toLowerCase().equals("csv")) {
            records = this.read.readCSV(filePath);
        }

        this.incomes = new ArrayList<Income>();
        for (String[] record : records) {
            Income newIncome = new Income();
            newIncome.setCity(record[0].toLowerCase());
            newIncome.setCountry(record[1].toLowerCase());
            newIncome.setGender(record[2].toLowerCase());
            newIncome.setCurrency(record[3].toLowerCase());
            newIncome.setAmount(Double.parseDouble(record[4]));
            this.incomes.add(newIncome);
        }
    }
    public void getReport(String fileName) throws Exception {
        Collections.sort(this.incomes, new CustomComp());
        
        this.write.getFinalReport(fileName, incomes);
    }
}
