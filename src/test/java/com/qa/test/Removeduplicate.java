package com.qa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
	//List list=new ArrayList(Arrays.asList(2,3,4,5,6,7,2,3,4,5,6));
		List list=Arrays.asList(2,3,4,5,6,7,2,3,4,5,6);
	
	Set set=new HashSet(list);
	List<Integer> l=new ArrayList(set);
	for(int x:l) {
		System.out.println(x);
		
		
	}
	///System.out.println(l);
	
	

	}

}
