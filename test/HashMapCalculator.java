import java.util.HashMap;

public class HashMapCalculator {
public static void main(String[] args) {
	HashMapCalculator calc = new HashMapCalculator();
	HashMap<String, String> hashmap1 = new HashMap<String, String>();
	HashMap<String, String> hashmap2 = new HashMap<String, String>();
	calc.commonKeyValuePairs(hashmap1, hashmap2);
}
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int calcs = 0;
		if (hashmap1.containsKey("Alice") && hashmap2.containsKey("Alice")) {
			if (hashmap1.get("Alice").equals(hashmap2.get("Alice"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Mary") && hashmap2.containsKey("Mary")) {
			if (hashmap1.get("Mary").equals(hashmap2.get("Mary"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Bob") && hashmap2.containsKey("Bob")) {
			if (hashmap1.get("Bob").equals(hashmap2.get("Bob"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Chuck") && hashmap2.containsKey("Chuck")) {
			if (hashmap1.get("Chuck").equals(hashmap2.get("Chuck"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Felix") && hashmap2.containsKey("Felix")) {
			if (hashmap1.get("Felix").equals(hashmap2.get("Felix"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Ricardo") && hashmap2.containsKey("Ricardo")) {
			if (hashmap1.get("Ricardo").equals(hashmap2.get("Ricardo"))) {
				calcs+=1;	
			}
		}
		if (hashmap1.containsKey("Tam") && hashmap2.containsKey("Tam")) {
			if (hashmap1.get("Tam").equals(hashmap2.get("Tam"))) {
				calcs+=1;	
			}
		}
		
		System.out.println(calcs);
		return calcs;
	}

}
