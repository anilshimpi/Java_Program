package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		
		
		List<Employee> list=Arrays.asList(
				
				new Employee(01,"abc", 50000),
				new Employee(02,"xyz", 30000),
				new Employee(02,"xyz", 30000)
				);
	
				
			Map<Employee,Long> mapList= list.stream()
				  .collect(Collectors.
						  groupingBy(Function.identity(),
								  Collectors.counting()));
				
			
			List<Employee> empList=mapList.entrySet() 
			.stream().distinct()
			.filter(e->e.getValue()==1)
			.map(e->e.getKey()).collect(Collectors.toList());
			
		for(Employee e:empList) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}
	}
	
}
