package coreJava;

class rectangle
{
	int le,bre;
	
	public rectangle(int l,int b)
	{
		le = l;
		bre = b;
	}
	void print_area()
	{
		System.out.println(le*bre);
	}
	void print_perimeter()
	{
		System.out.println(2*(le+bre));
	}
}
class Square extends rectangle
{
	public Square (int s)
	{
		super(s,s);
	}
}

public class Rectangle_with_two_data_member {
	public static void main(String[] args) {
		rectangle r = new rectangle (9,5);
		Square s = new Square (8);
		r.print_area();
		r.print_perimeter();
		s.print_area();
		s.print_perimeter();
	}
}