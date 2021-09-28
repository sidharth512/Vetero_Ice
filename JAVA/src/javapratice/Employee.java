package javapratice;

import java.util.TreeSet;

public class Employee {
	String name;
	int eid;

	Employee(String name,int eid)
	{
	this.name=name;
	this.eid=eid;
	}

	public String toString()
	{
		return name+" "+eid;
	}
	public int compareTo(Object o)
	{
		int eid1=this.eid;
		Employee e=(Employee)o;
		int eid2=e.eid;
		if(eid1<eid2)
			return -1;
			else if(eid1> eid2)
				return 1;
			else return 0;
	}
}
  class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("zahid",100);
		Employee e2=new Employee("Raveesh",500);
		Employee e3=new Employee("varun",400);
		Employee e4=new Employee("kishore",200);
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);

		}
	
	}


