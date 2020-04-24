import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CodingAssignment {
	
	public static void main(String[] args) {
// Question 1			
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Josh Smith");
		employeeNames.add("Sam Johnson");
		employeeNames.add("Tobias Burkley");
		employeeNames.add("John Rawlings");
		employeeNames.add("Sherry Southwick");
		
		//for (int i = 0; i < employeeNames.size(); i++) {
		//	System.out.println(employeeNames.get(i));
		//}
// Question 2 
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		//for (int id : ids) {
		//	System.out.println(id);
		//}
		
// Question 3		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
// Question 4  Added entries to employeeNames & ids
		
// Question 5
		int i = 0;
		
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		//System.out.println(employeeMap);
// Question 6		
		for (Integer key : ids) {
			System.out.println(key + ": " + employeeMap.get(key));
		}
// Question 7		
		StringBuilder idsBuilder = new StringBuilder();
		
// Question 8 
		for (Integer id : ids) {
			idsBuilder.append(id + " - ");
		}

// Question 9 
		System.out.println(idsBuilder.toString());
		
// Question 10		
		StringBuilder namesBuilder = new StringBuilder();
		
// Question 11
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		
// Question 12
		System.out.println(namesBuilder.toString());
		
	}
}