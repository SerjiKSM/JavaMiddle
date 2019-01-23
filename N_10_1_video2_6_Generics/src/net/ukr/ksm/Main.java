// Generics

package net.ukr.ksm;


public class Main {

	public static void main(String[] args) throws Exception {
		
		Conteiner1 conteiner1 = new Conteiner1();
		conteiner1.setValue("test string");
		System.out.println("conteinerString = " + conteiner1.getValue());
		System.out.println("///////////--------------------//////////////////////");
		
		Conteiner2 conteiner2 = new Conteiner2();
		conteiner2.setValue(4);
		System.out.println("conteinerInt = " + conteiner2.getValue());
		System.out.println("///////////--------------------//////////////////////");
		
		
		System.out.println("///////////-----GENERICS-----//////////////////////");
		
		ConteinerGenerics<String> conteinerGenerics = new ConteinerGenerics<String>();
		conteinerGenerics.setValue("test string");
		System.out.println("conteinerGenerics = " + conteinerGenerics.getValue());
		System.out.println("///////////--------------------//////////////////////");
		
		ConteinerGenerics<Integer> conteinerGenerics2 = new ConteinerGenerics<Integer>();
		conteinerGenerics2.setValue(5);
		System.out.println("conteinerGenerics2 = " + conteinerGenerics2.getValue());
		
	}

}

class Conteiner1{
	
	private String value;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
		
}

class Conteiner2 {
	
	private int value;

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
		
}