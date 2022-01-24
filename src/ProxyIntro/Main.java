package ProxyIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
//	int[]allAges = {10,20,30,40,50,60,45};

	public static void main(String[] args) {
		Employee p1 = new Employee("anas", 80);
		Employee p2 = new Employee("ali", 40);
		Employee p3 = new Employee("taina", 50);
		List<Employee> employ = new ArrayList<>(Arrays.asList(p1,p2,p3));
		
		// or we can use HashMap
		Map<String , Integer> emp = new HashMap<>();
		emp.put("Teim",45);
		emp.put("fofo",30);
		emp.put("fahas",50);
		Secretary s = new Secretary();
		
		for (Integer item : emp.values()) {
			s.permession(item);
		}

	}

}
