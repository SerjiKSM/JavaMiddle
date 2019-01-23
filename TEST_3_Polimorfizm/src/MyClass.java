// 1.  Functionalniy --- overait ---- ��������������� ������----������������� ���������������� ������ ��������

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

// 2.---- OverLoad -------------����������� ����������� � ������� ���������������� ������ � ��������� 
//����������� �������������(��� �� ���� �� ������� �� ����� �������� ��� ��������� ������� ���������� 
//���� ����� ��� ������ �����)

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




// 3.  Statment ----  ����������� ��������-----����������� ���������(��� ������ ��� ����������� ����������� 
//� ��� ��� �������������� ������������� ������� ����� (��������������) ��� ��������� � �������� ����������
//������ �������, ��� �������, ��� ��� ��� �������� ����������� ������ ������ ��������� (�����������).
//����������� �������� ������� � ���, ��� ��������� ����� ��������� ������������ ������� ���� (�� �������� ������)
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
			//���
	        Cat animalCat = new Cat();
	        System.out.println(animalCat.talk());
	        
	        Animal animalDog = new Dog();
	        //���
	        Dog animalDog = new Dog();
	        System.out.println(animalDog.talk());
	    }
	}
*/
