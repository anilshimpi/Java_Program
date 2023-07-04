package com.javapractise.sortmapusingvalue;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.javapractise.displaycourse.DisplayCourseName;

public class SortMapUsingValue {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> courseName = new LinkedHashMap<>();
		
		courseName.put(1,"Java");
		courseName.put(2,"Aws");
		courseName.put(3,"Python");
		courseName.put(4,"Angular");
		
	
		Map<Integer,String> result=SortMap(courseName);
		
		for(Entry entry:result.entrySet()) {
			
			System.out.print("KEY: " +entry.getKey());
			System.out.println(" Value :"+entry.getValue());
		}

	}

	public static LinkedHashMap SortMap(LinkedHashMap map){
		
		List<Entry<Integer, String>> courseList =new LinkedList<>(map.entrySet());
		
		Collections.sort(courseList, 
			(i1,i2)->i1.getValue().compareTo(i2.getValue())
				);
		
		LinkedHashMap<Integer, String> result=new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entry: courseList ) {
			
			result.put(entry.getKey(),entry.getValue());
		}
		
		return result;
		
	}
}
