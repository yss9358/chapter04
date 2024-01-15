package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		// ctrl + shift + o  == import 가 자동으로 됨;

		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		Point p04 = new Point(3,6);
		
		pSet.add(p04);
		
		
		//System.out.println(pSet.toString());
		/*
		for (Point p : pSet) {
			System.out.println(p.hashCode());
		}
		*/
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		
		
		
		
	}

}
