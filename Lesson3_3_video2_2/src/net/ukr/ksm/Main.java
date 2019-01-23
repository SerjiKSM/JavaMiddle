package net.ukr.ksm;

class Base{
	public void doJob(){
		System.out.println("Base");
	}
}

class Sub1 extends Base{
	@Override
	public void doJob(){
		super.doJob();
		System.out.println("Sub1");
	}
}

class Sub2 extends Base{
	public void doJob(){
		System.out.println("Sub2");
	}
}


public class Main {

	public static void main(String[] args) {
		
		// Что будет выведено на экран--??????
		
		Base b = new Sub1();
		b.doJob();   
		
		Sub2 s = new Sub2();
		s.doJob();
		
		/*
		s = new Base();  // Ошибка та нельзя делать, мы пытаемся в переменную "s"-объекта класса Sub2() засунуть новый объект "new Base()" 
		s.doJob();
		*/
	}
}
