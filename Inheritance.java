package coreJava;
class Parent {
	public void Parentprint() {
		System.out.println("This is Parent Class.");
	}
}

class Child extends Parent {
	public void Childprint() {
		System.out.println("This is Child Class.");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		p.Parentprint();
		c.Childprint();
		c.Parentprint();
	}
}