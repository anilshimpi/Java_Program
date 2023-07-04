package com.javapractise.customehashmap;

import java.util.Map.Entry;

public class CustomeHashMap<K,V> {
	
	//initial default capacity of map =16
	private int capacity=16;
	
	//create array of entry object
	private Entry<K, V>[] table;

	//create default constructor
	public CustomeHashMap() {
		super();
		table=new Entry[capacity];
	}
	
	//create custructor with capacity
	public CustomeHashMap(int capacity) {
		
		this.capacity=capacity;
		table=new Entry[capacity];
	}
	
	//create custome put method
	
	/*
	 * Put() Operation in HashMap
	 * 
	 * V put(K key, V value);
	 * 
	 * map.put("mercury", 1);
	 * 
	 * put() operation accepts K as a key and V as a. Now, to add this key-value
	 * pair in a Map, first, the hashcode of the key is generated and a bit-wise
	 * modulus operation(&) is performed with the size of HashMap(15) to find the
	 * exact bucket number. The modulus operation ensures the index to be in the
	 * range 0...size of hashmap -1. Below is the prototype.
	 * 
	 * 
	 * put(K k, V v) int hash = hash(k) //calculates the hashcode e.g. - 87673459
	 * int index = hash & (n - 1) //n is the capacity or size of HashMap. In a
	 * defualt implementation it is 16.
	 * 
	 * Suppose, the index value is calculated as 4 then this key value pair would be
	 * stored in the fourth bucket(as a 4th element in the array) as an Entry object
	 * and an Entry object contains the key, value, hashcode and a pointer to next
	 * node.
	 * 
	 * 
	 * In this case, the pointer to the next object will be null as there is a
	 * single element is this node. A pointer to the next node comes into picture
	 * when there is a case of collision.
	 */
	public void put(K key, V value) {
		
		
	}
	
//	create custome get method
	
	
	public V get(K key) {
		
	
	}
	//create remove method
	public void remove(K key) {
		
	}

	public void display() {
		
		for(int i=0;i<capacity;i++) {
			
			if(table[i]!=null) {
				
				Entry<K, V> currentNode=table[i];
				
				while(currentNode!=null) {
					
					System.out.println(String.format("Key is %s and Value is %s ", currentNode.getClass(),currentNode.getValue()));
					
					currentNode=currentNode.getNext();
					
				}
			}
			
		}
	}
}
