package net.ukr.ksm;

public class Main {
	
	public static void main(String[] args) {

		doJob();
		
	}
	
	public static void doJob(){
		try {
			int res = doSqr(-1);
			//int res = doSqr(2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static int doSqr(int a) throws Exception{
		System.out.println("Doing sqr()...");
		return sqr(a);
	}

	public static int sqr(int a) throws Exception{
		if(a < 0) throw new Exception("Не правельный параметр!");
		return a * a;
	}
	
}
