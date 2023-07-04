import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {
	
	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(
				
				new Employee(1, "aaa", 50000),
				new Employee(2, "aba", 40000),
				new Employee(3, "aab", 70000),
				new Employee(4, "baa", 65000)
				
				);
		
	Employee sal=	empList.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary)
				.reversed())
		.findFirst().get();
		
		System.out.println(sal.getSalary());
		
	}

	
}
