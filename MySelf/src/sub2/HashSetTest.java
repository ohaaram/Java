package sub2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		
		System.out.println(set);
		
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

}
