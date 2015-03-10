package com.bita.ws;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class MathTable {
	private String name = "MathTable";
	private int number;
	private int[] array;
	

	public MathTable() {
		this.number = 1;
		this.setArray(produceTable(getNumber()));
		System.out.println("commit in master");
	}

	
	public MathTable(int number) {
		this.setNumber(number);
		this.setArray(produceTable(number));
	}

	private int[] produceTable(int number) {
		int[] table = new int[10];
		for (int i = 1; i <= 10; i++) {
			table[i - 1] = i * number;
		}
		return table;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This table consists of" + "\n");
		sb.append("name: " + this.name + "\n");
		sb.append("number: " + number + "\n");
		sb.append("elements: ");
		for (int i = 0; i < array.length; i++) {
			sb.append("[" + array[i] + "]");
		}
		return sb.toString();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}
