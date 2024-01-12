package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		// 점 관리
		MyList<Point> pList = new MyList<Point>();
		Point p01 = new Point(2,2);
		Point p02 = new Point(5,5);
		Point p03 = new Point(10,10);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString());
		
		// 원 관리
		
		MyList<Circle> cList = new MyList<Circle>();
		Circle c01 = new Circle(100);
		Circle c02 = new Circle(200);
		Circle c03 = new Circle(250);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		System.out.println(cList.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
