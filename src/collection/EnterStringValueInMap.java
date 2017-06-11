package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EnterStringValueInMap {

	public static void main(String[] args) {
		
		String mapString = "Sonal";
		
		char[]s= mapString.toCharArray();
		
		HashMap <Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i<s.length;i++){
			if (map.containsKey(s[i])){
				map.put(s[i], map.get(s[i])+1);
			}
			
			map.put(s[i], 1);
		}
			
		Set<Character> charSet= map.keySet();
		
		Iterator <Character> iterator= charSet.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next());
		}
	
		System.out.println(map);
			
		Set<Map.Entry<Character, Integer>> entrySet= map.entrySet();
		
		for (Entry <Character, Integer> entry: entrySet){
			
			System.out.print(entry.getKey());
			
						
		}
	}

}
