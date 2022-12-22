package coreJava;

abstract class marks{
	public abstract float getPercentage();
}
class A extends marks{

	int mar1,mar2,mar3;
	A(int m1, int m2, int m3){
		mar1 = m1;
		mar2 = m2;
		mar3 = m3;
		
	}
	@Override
	public float getPercentage() {
		float total = ((mar1+mar2+mar3)/(float)300)*100;
		return total;
	}
	
}
class B extends marks{

	int mar1,mar2,mar3;
	B(int d1, int d2, int d3){
		mar1 = d1;
		mar2 = d2;
		mar3 = d3;
	}
	@Override
	public float getPercentage() {
		float total = ((mar1+mar2+mar3)/(float)400)*100;
		return total;
	}
}

public class StudentMarks {
	public static void main(String[] args) {
		
		A a = new A(70,50,100);
		System.out.println("Percentage A : "+a.getPercentage());
		
		B b = new B(90,64,86);
		System.out.println("Percentage B : "+b.getPercentage());
	}
}