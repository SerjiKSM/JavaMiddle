package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();
		try {
			group.listStudent();
			{
				System.out.print("We search - ");
				group.search("Danilova");
			}

		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
