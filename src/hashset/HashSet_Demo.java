package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		HashSet hs2 = new HashSet(100);			//initial capacity is 100
		HashSet hs3 = new HashSet(100, (float)0.75);
		HashSet hs4 = new HashSet(100, (float)0.90);		
		HashSet<Integer> hs5 = new HashSet<Integer>();
		
		HashSet hs = new HashSet();		//default capacity 16, load factor is 0.75
		
		hs.add("HashSet");
		hs.add(100);
		hs.add('C');
		hs.add(true);
		hs.add(null);
		hs.add(34.5);
		
		System.out.println(hs);		//HashSet is not preserved insert order
		
		hs.remove('C');
		System.out.println(hs);		//only remove by value, can't do with index
		
		System.out.println( hs.contains(200));
		System.out.println( hs.contains(true));
		
		System.out.println( hs.isEmpty());
		
		for(Object value: hs) {
			System.out.println(value);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs_evenNumber = new HashSet<Integer>();
		hs_evenNumber.add(2);
		hs_evenNumber.add(4);
		hs_evenNumber.add(6);
		hs_evenNumber.add(8);
		System.out.println(hs_evenNumber);
		
		HashSet<Integer> hs_evenNumber_New = new HashSet<Integer>();
		hs_evenNumber_New.addAll(hs_evenNumber);
		hs_evenNumber_New.add(6);
		hs_evenNumber_New.add(8);
		hs_evenNumber_New.add(10);
		System.out.println(hs_evenNumber_New);
		
//		hs_evenNumber_New.removeAll(hs_evenNumber);
//		System.out.println(hs_evenNumber_New);
		
		hs_evenNumber.addAll(hs_evenNumber_New);		//union: addAll number, but not allowed duplicate
		System.out.println(hs_evenNumber);
		
		hs_evenNumber.retainAll(hs_evenNumber_New);		//intersection: give only common number in 2 HashSet
		System.out.println(hs_evenNumber);
		
		
		System.out.println( hs_evenNumber.containsAll(hs_evenNumber_New));		//subset: 
		
		
		
		
		

	}

}
