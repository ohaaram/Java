package sub3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HahMapTest {
	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		map.put('A', "apple");
		map.put('B',"Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		System.out.println("map 크기 : "+map.size());
		
		System.out.println("map A값 : "+map.get('A'));
		System.out.println("map B값 : "+map.get('B'));
		System.out.println("map C값 : "+map.get('C'));
		
		for(char k:map.keySet()) {
			System.out.println(k+"-"+map.get(k));
		}
		
		List<Map<Integer,Apple>> mylist = new ArrayList<>();
		
		Map<Integer,Apple> m1 = new HashMap<>();
		
		m1.put(101,new Apple("한국",3000));
		m1.put(102, new Apple("영국",3000));
		m1.put(103, new Apple("일본",3000));
		
		Map<Integer,Apple> m2 = new HashMap<>();
		
		m2.put(201,new Apple("미국",3000));
		m2.put(202,new Apple("영국",3000));
		m2.put(203,new Apple("호주",3000));
		
		Map<Integer,Apple> m3 = new HashMap<>();
		
		m3.put(301, new Apple("대만",3000));
		m3.put(302, new Apple("태국",3000));
		m3.put(303, new Apple("인도",3000));
		
		mylist.add(m1);
		mylist.add(m2);
		mylist.add(m3);
		
		Map<Integer, Apple> resultMap1 = mylist.get(0);
		Apple apple1 = resultMap1.get(101);
		apple1.show();
		
		mylist.get(1).get(203).show();
		mylist.get(2).get(302).show();
		
		
		
	}

}
