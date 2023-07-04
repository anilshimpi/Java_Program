package com.javapractise.displaycourse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayCourseName {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				
				new Student("Anil", "Java", 20),
				new Student("abc", "Python", 20),
				new Student("pqr", "Aws", 20),
				new Student("xyz", "Angular", 20)
				);
		
		list.stream().map(Student::getCourseName).forEach(System.out::println);
		
		
	}

}
