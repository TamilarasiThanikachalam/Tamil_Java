package collections;

import java.util.HashSet;

public class HashSetPractice {
	static boolean b;
	

	public static void main(String[] args) {
		boolean b1;
		
		HashSet hset = new HashSet<>();
		HashSet hset2 = new HashSet<>();
		HashSet<String> hset3 = new HashSet<>();
		
		
		
		hset.add(1);
		hset.add("Tamil");
		hset.add('s');
//		System.out.println(hset);		
//		hset.clear();
		hset2 = (HashSet) hset.clone();
		System.out.println(hset2);
		
		hset3 = (HashSet<String>) hset.clone();
		System.out.println(hset3);
		hset3.add(null);
		
		System.out.println("***********contains()*****************");
		System.out.println(hset3);
		b = hset3.contains(null);
		System.out.println(b);
		System.out.println(hset3.contains(3));
		
		System.out.println("****************containsAll()**************");
		b = hset3.containsAll(hset);
		System.out.println(b);
		b = hset.containsAll(hset3);
		System.out.println(b);
		
		System.out.println("*****************Equal()************");
		b = hset3.equals(hset2);
		System.out.println(b);
		b = hset2.equals(hset);
		System.out.println(b);
		
					
		System.out.println("*************Empty()**********");
		b = hset3.isEmpty();
		System.out.println(b);
		
		System.out.println("*************hashcode************ \n" +hset.hashCode());
		
		System.out.println("**********isEmpty()***********");
		b = hset3.isEmpty();
		System.out.println(b);
		
		hset.clear();
		System.out.println(hset.isEmpty());
		
		System.out.println("**********remove()***************\n" +hset3.remove(1));
		System.out.println(hset3);
		
		HashSet hset4 = new HashSet<>();
		hset4 = (HashSet) hset3.clone();
		
		System.out.println("************retainAll()******************");
		hset4.add("Mithran");
		System.out.println(hset4);
		hset4.retainAll(hset3);//it will keep elements which are available in hset3, any other present will be removed
		System.out.println(hset4);
		
//		hset3.retainAll(hset4);
//		System.out.println(hset3);
		
		Object[] obj = hset4.toArray();
//		System.out.println("*toArray()**********\n" +hset4);
		for(int i = 0; i < hset4.size(); i++) {
			System.out.println(obj[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
