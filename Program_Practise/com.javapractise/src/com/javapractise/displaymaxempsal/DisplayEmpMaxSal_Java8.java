package com.javapractise.displaymaxempsal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DisplayEmpMaxSal_Java8 {

	public static void main(String[] args) {
		
		List<Employee> list=Arrays.asList(
				new Employee(011, "Anil", 56000),
				new Employee(012,"Priti",50000),
				new Employee(013, "xyz", 70000)
				);
//find second highest salary
		Employee salary=list.stream().sorted(Comparator
				.comparingDouble(Employee::getSalary)
				.reversed()).skip(1)
				.findFirst().get();
		
		//find highest salary
		Employee salary1=list.stream().sorted(Comparator
				.comparingDouble(Employee::getSalary)
				.reversed())
				.findFirst().get();
		
		//sort by name
		List<Employee> sortByName=list.stream()
				.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		
		
		//sort by name and salary
		List<Employee> groupSort =list.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getSalary)).collect(Collectors.toList());
		
		for(Employee e:sortByName) {
			System.out.println("Sort by Name: "+e.getName());
		}
		
		System.out.println("Second Highest salary "+salary.getSalary());
		System.out.println("Highest Salary "+salary1.getSalary());
	}

}
