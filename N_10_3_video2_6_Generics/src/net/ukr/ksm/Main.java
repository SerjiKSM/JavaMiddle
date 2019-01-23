// Generics
// www.rsdn.ru/article/java/genericsinjava.xml

package net.ukr.ksm;


public class Main {

	public static void main(String[] args) throws Exception {

	}

}

// Generics s opredelennumi ogranecheniyami

class A{ }

public class ContainerGenerics <E extends A> {
	private E value;

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

}

public class AnyClass1 {      }

public class AnyClass2 extends A {       }

ContainerGenerics<AnyClass2> m1 = new ContainerGenerics<AnyClass2>();   // OK
ContainerGenerics<AnyClass1> m2 = new ContainerGenerics<AnyClass1>();   // error tak kak ne extends A
