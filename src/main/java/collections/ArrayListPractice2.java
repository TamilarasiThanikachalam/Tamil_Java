package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		arrayList1(10);
	}
	public static ArrayList arrayList1() {
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add("String");
		arr.add('c');
		
		Iterator iter = arr.iterator();
		System.out.println(iter.hasNext());
//		iter.remove();
		
		System.out.println();
		for(int i=0; i<arr.size()-1; i++) {
			System.out.println(iter.next());
		}
		iter.remove();
		System.out.println("*****After remove()*********");
		iter.forEachRemaining(eachIter -> System.out.println(eachIter));
		
		return arr;
	}
	
	public static ArrayList arrayList1(int a) {
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add("String");
		arr.add('c');
		arr.add(120);
		arr.add("abc");
		
		ListIterator list = arr.listIterator();
		list.hasNext();
		System.out.println(list.next());
//		System.out.println(list.next());
		list.remove();
		list.forEachRemaining(eachList -> System.out.println(eachList));
		
		System.out.println("****remove()****");
		System.out.println(list.hasPrevious());
		while(list.hasPrevious()) {
			Object obj = list.previous();
			System.out.println(obj);
		}
		list.remove();
		list.forEachRemaining(eachList -> System.out.println(eachList));
		
		System.out.println("****remove()****");
		System.out.println(list.hasPrevious());
		while(list.hasPrevious()) {
			Object obj = list.previous();
			System.out.println(obj);
		}
		 return arr;
	
	}

}
