package javaprogram;

import java.util.TreeSet;

public static main(String[] args) {
	IdentityHashMap h=new IdentityHashMap();
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	h.put(i1, "mahesh");
	h.put(i2, "babu");
	System.out.println(h);
	
}
}}