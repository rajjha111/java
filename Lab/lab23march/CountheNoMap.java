package lab23march;
import java.util.HashMap;
import java.util.Map;
public class CountheNoMap {
	public static void main(String[] args) {
		Map<String, Integer> Map =new HashMap<String, Integer>();
		// Add some key-value mappings to the map
		Map.put("apple",1);
		Map.put("banana", 2);
		Map.put("grapes",3);
		Map.put("pineapple", 4);
		// Count the number of key-value mappings in the map
		int count=Map.size();
		System.out.println("Number of key-value mappings in the map: " +count);
	}

}
