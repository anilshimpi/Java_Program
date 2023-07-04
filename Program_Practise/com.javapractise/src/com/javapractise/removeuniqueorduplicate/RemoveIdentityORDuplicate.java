package com.javapractise.removeuniqueorduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveIdentityORDuplicate {

	public static void main(String[] args) {
		
		List<Integer> listInteger=Arrays.asList(1,2,1,5,8,7,6,7);
		
		//iterate unique element from the list/remove duplicate
		
		Map<Integer,Long> unique=listInteger.
				stream().
				collect(Collectors.
						groupingBy(Function.identity(),
								Collectors.counting()));
		
		List<Integer> listOfUniqueInt=unique.entrySet()
				.stream()
				.filter(e->e.getValue()==1)
				.map(e->e.getKey())
				.collect(Collectors.toList());
		System.out.println(listOfUniqueInt);
		
		//iterate duplicate element from the list/remove unique
	Set<Integer> newList =new HashSet<>();	
	
	Set<Integer>listOfDuplicateNumber=	listInteger.stream()
		.filter(num->!newList.add(num))
		.collect(Collectors.toSet());
	System.out.println(listOfDuplicateNumber);
		
		

	}

}
