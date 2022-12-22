package coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class mobile{
	private long price;
	private String company;
	private String ram;
	
	mobile(long price,String company, String ram)
	{
		this.price = price;
		this.company = company;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "price : "+price+"Company : "+company+"Ram"+ram;
	}
}
public class ListPractical {
	public static void main(String[] args) {
		mobile d1 = new mobile(75000,"Apple", "16-GB");
		mobile d2 = new mobile(22000,"Samsung" ,"16-GB");
		mobile d3 = new mobile(25000,"Realme", "16-GB");
		mobile d4 = new mobile(25500,"Motorola", "16-GB");
		mobile d5 = new mobile(27400,"MI ","16-GB  	");
		
		List<mobile> list = new ArrayList<mobile>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		System.out.println(list);
		
		Iterator<mobile> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}