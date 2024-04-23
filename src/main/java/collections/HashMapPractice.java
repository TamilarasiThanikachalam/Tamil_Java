package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		HashMap<Integer, String> hmap2 = new HashMap<>(hmap);
		
		hmap.put(1, null);
		hmap.put(2, "Mithran");
		hmap.put(3, "Tamil");
		hmap.put(3, "Tamilarasi");// if we give duplicate key, it will replace the old with new key value
		
		System.out.println(hmap);
		hmap2 = (HashMap<Integer, String>) hmap.clone();
		hmap2.put(4, null);// this will allow duplicate value
		System.out.println("*******hmap2*****\n" +hmap2);
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		System.out.println("*********entrySet()***********\n" +hmap.entrySet());
		
		Set<Entry<Integer, String>> entrySet = hmap.entrySet();
		
		Iterator hIterat = entrySet.iterator();
//		System.out.println("***********Using lampda expression**********");
//		hIterat.forEachRemaining(eachPair -> System.out.println(eachPair));
		
		System.out.println("***********Using while loop**********");
		boolean b = hIterat.hasNext();
		System.out.println("Do we have key value pair in the hashMap: " +b);
		while(hIterat.hasNext()) {
//			System.out.println(hIterat.next());
			Entry<Integer, String> entry =  (Entry<Integer, String>) hIterat.next();
		
		if( entry.getKey().equals(1)){
			System.out.println(entry.getValue());
		}
//		else {
//			System.out.println("No key value present");
//		}
		}
		
		

	}

}
