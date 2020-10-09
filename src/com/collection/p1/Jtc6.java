package com.collection.p1;
import java.util.*;
public class Jtc6 {

	public static void main(String[] args) {
		//using LinkedHashMap,TreeMap,Hashtable
		System.out.println("------LinkedHashMap-----");
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("sid", new Integer(99));//The constructor Integer(int) is deprecated since version 9
		hm.put("sname","Som");
		hm.put("fee",new Double(9000.99));//The constructor Double(double) is deprecated since version 9
		System.out.println(hm);
		hm.put("x","10");//LinkedHashMap has insertion method but HashMap doesn't
		hm.put(new Integer(99),"10");
		System.out.println(hm);
		hm.put("x","20");//replace 10-20
		System.out.println(hm);
		hm.put(null,null);// we can pass null also
		System.out.println(hm);
		
		System.out.println("------Hashtable------");// insert element in form of dictionary
		Hashtable ht=new Hashtable();
		ht.put("sid",new Integer(99));
		ht.put("sname","Som");
		ht.put("fee",new Double(9000.99));
		System.out.println(ht);
		ht.put("x","10");
		ht.put(new Integer(99),"10");
		System.out.println(ht);
		ht.put("x","20");
		System.out.println(ht);
		
		/*
		  ht.put("z",null); //Hashtable can't accept null values
		  System.out.println(ht);
		 
		ht.put(null,"s");//Hashtable can't accept null key also
		System.out.println(ht);
		*/
		System.out.println("----------TreeMap------");
		TreeMap tm=new TreeMap();//key must be String only
		tm.put("sid",new Integer(99));
		tm.put("sname","Som");
		tm.put("fee",new Double(9000.99));
		System.out.println(tm);
		tm.put("x","10");
		//tm.put(new Integer(99),"10");
		System.out.println(tm);
		tm.put("x","20");// insertion allowed
		System.out.println(tm);
		tm.put("z",null);//null values allowed
		System.out.println(tm);
		/*
		 * tm.put(null,"s"); // null key not allowed in TreeMap
		 * System.out.println(tm);
		 */
	}

}
