package com.javapractise.countword;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatedWord {

	public static void main(String[] args) {
		
		String para="this is the paragraph and this is the sentence";
		
		LinkedHashMap<String,Integer> stringCount=new LinkedHashMap<>();
		
		String[] str=para.split(" ");
		
		for(String s:str) {
			
			if(stringCount.containsKey(s)) {
				stringCount.put(s, stringCount.get(s)+1);
			}
			else {
				stringCount.put(s, 1);
			}
		}
		System.out.println(stringCount);
	}

}
