package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		// ppt04 - 15 / HashSet을 이용하여 미니로또 만들기
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			if(iSet.size()>=6) {
				break;
			}
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);
		}
		/*
		for (int count=0; count<6; count++) {
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);
		}
		*/
		
		for (Integer num : iSet) {
			System.out.println(num.toString());
		}

		
		
		
		
		

	
	
		
		
	}

}
