package com.sapient.week2;

public class App {
	public static void main(String[] args) {
        try {
            calculate cal = new calculate();
            cal.readData(args[0], args[0].substring(args[0].length() - 3));

            convert_currency cc = new convert_currency();
            cc.processIncomes(cal.getIncomes());

            cal.getReport(args[1]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
