//Пример реализации вложенного интерфейса

package net.ukr.ksm;


public class PrB implements TopClass.IsNum {
	
	public boolean IsNumber(String t) {
		boolean flag = false;
		try {
			Double.valueOf(t);
			flag = true;
		} catch (Exception e) {
		}
		return flag;
	}

}
