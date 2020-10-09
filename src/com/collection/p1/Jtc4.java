package com.collection.p1;
import java.util.*;
public class Jtc4 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Integer(99));
		System.out.println(hs.add("som"));//add & return boolean-true
		hs.add("som@jtc");
		System.out.println(hs.add("som"));//did not duplicate element return boolean-false
		System.out.println(hs);
		
		TreeSet ts=new TreeSet();
		//ts.add(new Integer(99));
		System.out.println(ts.add("som"));
		ts.add("som@jtc");
		System.out.println(ts.add("som"));
		ts.add("aaaa");
		ts.add("cccc");
		ts.add("bbbb");
		System.out.println(ts);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("som"));
		lhs.add("som@jtc");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);

		
		
	}

}
