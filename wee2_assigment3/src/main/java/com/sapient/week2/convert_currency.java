package com.sapient.week2;

import java.util.ArrayList;

public class convert_currency {
	public double inrTodoll(double inr) {
		return inr/66.0;
	}
	public double gbpTodoll(double gbp) {
		return gbp/0.67;
	}
	public double sgdTodoll(double sgd) {
		return sgd/1.5;
	}
	public double hkdTodoll(double hkd) {
		return hkd/8.0;
	}
	public void processIncomes(ArrayList<Income> incomes) {
        for (Income i : incomes) {
        	if(i.getCurrency().equals("inr")) {
        		i.setAmountUSD(this.inrTodoll(i.getAmount()));
        	}
        	if(i.getCurrency().equals("gbp")) {
        		i.setAmountUSD(this.gbpTodoll(i.getAmount()));
        	}
        	if(i.getCurrency().equals("sgd")) {
        		i.setAmountUSD(this.sgdTodoll(i.getAmount()));
        	}
        	if(i.getCurrency().equals("hkd")) {
        		i.setAmountUSD(this.hkdTodoll(i.getAmount()));
        	}
        }
    }
}
