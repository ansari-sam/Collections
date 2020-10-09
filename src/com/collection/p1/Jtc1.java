package com.collection.p1;
import java.util.*;

public class Jtc1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add(new Integer(99));
		al.add("som"); 
		al.add("123");
		al.add("som@jtc"); 
		al.add(new Double(999.99));
		al.add(new Long(11111));
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		Object[] obj=al.toArray();
		System.out.println(obj.length);
		System.out.println("--------Print Directly-----------");
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("-----checking and casting--------");
		for(int i=0;i<obj.length;i++){
		Object o=obj[i];
		if(o instanceof String){
		String str=(String)o;
		System.out.println(str);
		}else if(o instanceof Integer){
		Integer in=(Integer)o;
		System.out.println(in);
		}else if(o instanceof Double){
		Double d=(Double)o;
		System.out.println(d);
		}else if(o instanceof Long) {
		Long l=(Long)o;
		System.out.println(l);
		}
			}
		System.out.println("------Iterator Operation------------");
		Iterator it=al.iterator();
		while(it.hasNext()){
		Object o=it.next();
		System.out.println(o);
		}
		System.out.println("------------");
		System.out.println(al.contains("som"));//boolean-true
		System.out.println(al.contains("jtc"));//boolean-false
		System.out.println(al);
		al.add("123");
		System.out.println(al);
		al.remove("123");
		System.out.println(al);
		
		System.out.println("----------------");
		
		ArrayList al1=new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		al1.add("dd");
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al1.size());
		//al.add(al1);
		//System.out.println(al);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.containsAll(al1));
		System.out.println(al);
		System.out.println("--------------");
		//al.removeAll(al1);
		//System.out.println(al);
		al.retainAll(al1);//except al1 object remove all other object
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
