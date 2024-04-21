package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListAndIteratorPractice {
	
	static boolean b;
	static int i;

	public static void main(String[] args) {
		
	
		ArrayList<Character> ch = new ArrayList<Character>();//Object creation in ref with ArrayList class, Homogeneous Array List
//		(Allows character list of elements)
		
		System.out.println("Creating ArrayList of elements");
		System.out.println(ch.size());
		
		ch.add('a');
		ch.add('b');
		
		ch.clear();
//		ch.addAll('c');
		ch.add('d');
//		ch.add(6);
		
//		ArrayList ch2 = new ArrayList((int) ch.clone());
//		System.out.println(ch2);
		
		ArrayList<Character> ch2 = new ArrayList<Character>();
		ch2 = (ArrayList<Character>) ch.clone();
		System.out.println(ch2);
		
		System.out.println(ch);
		
		ArrayList obj = new ArrayList<>();//Heterogeneous ArrayList,any type of elements can be added to this collection
		obj.add(1);
//		obj.add(2, "Mithran");
		obj.add(1, "Mithran");
		
		System.out.println(obj);
		
		obj.addAll(ch2);
		obj.addAll(3, ch);
		
		b = obj.contains('e');
		System.out.println(b);
		b = obj.containsAll(ch2);
		System.out.println(b);
		
		System.out.println(obj);
		
		System.out.println("Ensure that it can hold at least the number of elementsspecified by the minimum capacity argument");
		obj.ensureCapacity(4);
		obj.add(5);
		System.out.println(obj);
		obj.add("Mithran");
		System.out.println(obj);
		
		b = obj.equals(ch2);
		System.out.println(b);
		
//		obj.forEach(null);
		
		System.out.println(obj.get(3));
		
		System.out.println(obj.hashCode());
		
		System.out.println(obj);
		System.out.println(obj.indexOf("Mithran"));
		System.out.println(obj.lastIndexOf("Mithran"));
		
		System.out.println(obj.isEmpty());
				
//		obj.iterator();//Returns an iterator over the elements in this list in proper sequence.
		
		System.out.println(obj.remove(3));
		System.out.println(obj.remove("Mithran"));
//		System.out.println(obj.removeAll(ch2));
		
	    b = obj.removeAll(ch2);
		System.out.println(obj);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.addAll(num);
		System.out.println(num);
		
//		num.removeIf();
		
//		i = num.set(0,10);
//		System.out.println(i);
		
		System.out.println(num.set(0, 10));
		System.out.println(num);
		
		ArrayList num2 = new ArrayList();
		
		System.out.println(num.subList(1, 3));//toIndex not taking the pointing value, this will print from index - current element and toIndex - prevelement
//		num2 = (ArrayList) num.subList(1, 3);
//		System.out.println(num2);
		
//		ArrayList<Integer> num3 = new ArrayList<>();
//		num3 = (ArrayList<Integer>) num.subList(0, 2);
//		System.out.println(num3);
		
		Object[] a = num.toArray();
//		System.out.println(a);
		
		for(Object each:a) {
			System.out.println(each);
		}
		
//		Collection.sort(num);
		
		ArrayList<String> str = new ArrayList<>();
		str.add("Mithran");
		str.add("Tamil");
		str.add("Sathya");
		System.out.println(str);
		
		Object str1 = str.toString();
		System.out.println(str1);
//		for(Object eachstr: str1) {
//			System.out.println(eachstr);
//		}
	
		str.trimToSize();	
		System.out.println(str);
		
		Iterator<String> str3 = str.iterator();
		System.out.println(str3.hasNext());
		str3.forEachRemaining(eachStr -> System.out.println(eachStr));
		
		ArrayList<String> str6 = new ArrayList<>();
		str6.add("Java");
		str6.add("Selenium");
		str6.add("git");
		
		Iterator<String> str4 = str6.iterator();
//		str.add("Java");
		System.out.println(str4.next());
		while(str4.hasNext()) {
			Object str5 = str4.next();
			System.out.println(str5);
		}
		
		ListIterator<String> list = str6.listIterator();
		System.out.println(list.next());
//		System.out.println(list.hasNext());;
		b = list.hasNext();
		System.out.println(b);
		
		b = list.hasPrevious();
		System.out.println(b);
		
		System.out.println(list.nextIndex());
		Object c = list.previous();
		System.out.println(c);
		
		c = list.previousIndex();
		System.out.println(c);
		
		list.set("Tamil");
		for (String string : str6) {
			System.out.println(string);
		}
		list.hasNext();
		list.next();
		
		list.set("java");
		for (String string : str6) {
			System.out.println(string);
		}
		list.remove();
		list.hasNext();
		System.out.println("****Remove method****");
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		
		
		
		
		
		}
		


		
		
		
		

	}

	
	
	
	
	

