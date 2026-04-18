package com.matrix.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListCore {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
			nums.add(10);
			nums.add(5);
			nums.add(30);
			nums.add(9);
			nums.add(6);
			
			System.out.println(nums);
			

			
			Stream<Integer> s1 = nums.stream();
						
				 s1.forEach(System.out::println);
			
			
			
			
	}
}
