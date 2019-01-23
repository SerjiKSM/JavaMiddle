package net.ukr.ksm;

import java.lang.Character.Subset;



class ArrayConteyner{
	
	protected int[] arr;

	/**
	 * @param arr the arr to set
	 */
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	
	/*
	 * —читает среднее арифметическое массива
	 */
	public double averrage() {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();		
		for (int i = 0; i < arr.length; i++) 
			stringBuilder.append(arr[i]).append(",");
		return stringBuilder.toString();		
	}
		
}



class NewArrayConteyner extends ArrayConteyner{

	/* (non-Javadoc)
	 * @see net.ukr.ksm.ArrayConteyner#toString()
	 */
	@Override
	public String toString() {
		//StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder(super.toString());		
		for (int i = 0; i < arr.length; i++) 
			stringBuilder.append(arr[i]).append("+");
		return stringBuilder.toString();
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		
		ArrayConteyner arrayConteyner = new ArrayConteyner();		
		arrayConteyner.setArr(new int[] {1, 2, 3, 4});		
		System.out.println(arrayConteyner.toString());	
		System.out.println(arrayConteyner.averrage());
		
		System.out.println("--------------------------------------------------------");	
		
		NewArrayConteyner newArrayConteyner = new NewArrayConteyner();
		newArrayConteyner.setArr(new int[] {1, 2, 3, 4});		
		System.out.println(newArrayConteyner.toString());
		System.out.println(newArrayConteyner.averrage());
		
	}

}


