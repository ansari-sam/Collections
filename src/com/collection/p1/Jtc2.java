package com.collection.p1;
import java.util.*;

public class Jtc2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(new Integer(99));
		al.add("som");
		al.add("123");
		al.add("som@jtc");
		al.add("som");//add next after next countinous manner
		System.out.println(al);
		al.add(0, "aaaa");//shift the present element to next and add to their position
		al.add(2, "bbbb");
		System.out.println(al);
		al.remove(4);// clear the index element
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.indexOf("som"));
		System.out.println(al.lastIndexOf("som"));
		al.set(0, "jtc");//replace the present element
		System.out.println(al);//[jtc, 99, bbbb, som, som@jtc, som]
		List list=al.subList(1, 4);//make sublist from index to before to index [99, bbbb, som]
		System.out.println(list);
		System.out.println("-------forward order--------");
		ListIterator li=al.listIterator();
		while(li.hasNext()){
		System.out.println(li.next());
		}
		System.out.println("-------reverse order-----------");
		while(li.hasPrevious()){
		System.out.println(li.previous());
		}

	}

}
