package org.itstep.model;

import java.util.ArrayList;
import java.util.List;

public class AppRuner {

	public static void main(String[] args) {

		Curency curency1 = new Curency();

		curency1.setName("Dolar");
		curency1.setSymbol("USD");
		curency1.setValue(25.95);

		Curency curency2 = new Curency();

		curency2.setName("Euro");
		curency2.setSymbol("EUR");
		curency2.setValue(30.11);

		Curency curency3 = new Curency();

		curency3.setName("Ruble");
		curency3.setSymbol("RUB");
		curency3.setValue(0.47);

		List<Curency> curencies = new ArrayList<>();

		curencies.add(curency1);
		curencies.add(curency2);
		curencies.add(curency3);

		String output = "";
		for (Curency oneCur : curencies) {
			output += oneCur.getSymbol() + ":" + oneCur.getValue() + " ";
		}
		output.trim();
		System.out.println(output);

		
		String[] words = output.split(" ");
		
		output = "";
		for (String curText : words) {
			String[] curFields = curText.split(":");
			if (curFields.length>1) {
				output += curFields[1] + ":" + curFields[0] + " ";				
			}
		}
		output.trim();
		System.out.println(output);


	}

}
