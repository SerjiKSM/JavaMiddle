// 1.  Functionalniy --- overait ---- переопределение метода----переписывание функциональности метода родителя

abstract class Animal {
	     String talk() {
			return "KY-KY";
		}
	}

class Cat extends Animal {
    String talk() { return "Meow!"; }
}

class Dog extends Animal {
    String talk() { return "Woof!"; }
}

public class MyClass {

    public static void main(String args[]) {
      
        Animal animalCat = new Cat();
        System.out.println(animalCat.talk());
        
        Animal animalDog = new Dog();
        System.out.println(animalDog.talk());
    }
}

// 2.---- OverLoad -------------полиморфизм проявляется в подборе соответствующего метода с заданными 
//параметрами пользователем(это не юзер не человек не живое существо это праграмма которая использует 
//этот метод или другой класс)

// example Pascal
/*
program Adhoc;

function Add( x, y : Integer ) : Integer;
begin
    Add := x + y
end;

function Add( s, t : String ) : String;
begin
    Add := Concat( s, t )
end;

begin
    Writeln(Add(1, 2));
    Writeln(Add('Hello, ', 'World!'));
end.

*/
/////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////




// 3.  Statment ----  Полиморфизм подтипов-----полиморфизм состояний(это значит что полиморфизм заключается 
//в том что предполагаться использование единого имени (идентификатора) при обращении к объектам нескольких
//разных классов, при условии, что все они являются подклассами одного общего надкласса (суперкласса).
//Полиморфизм подтипов состоит в том, что несколько типов формируют подмножество другого типа (их базового класса)
/*
	abstract class Animal {
	    abstract String talk();
	}

	class Cat extends Animal {
	    String talk() { return "Meow!"; }
	}

	class Dog extends Animal {
	    String talk() { return "Woof!"; }
	}


	public class MyClass {

	    public static void main(String args[]) {
	      	        
	        Animal animalCat = new Cat();   
			//или
	        Cat animalCat = new Cat();
	        System.out.println(animalCat.talk());
	        
	        Animal animalDog = new Dog();
	        //или
	        Dog animalDog = new Dog();
	        System.out.println(animalDog.talk());
	    }
	}
*/
