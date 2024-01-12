package com.javaex.ex01;

public class PointList {
	
	// 필드
	
	private Point[] pArray;
	private int crtPos;
	
	// 생성자
	
	public PointList() {
		// 원래 만들지 않지만 편의상 가정
		pArray = new Point[3];
		crtPos = 0;
	}
	
	// 메소드 g/s
	
	// 메소드 일반
	
	public void add(Point p) {
		// 현재배열의 개수+1 배열을 새로 만든다
		// 이전배열의 칸을 새배열에 올린다
		//마지막방에 새주소를 추가한다
		
		pArray[crtPos] = p;
		//crtPos = crtPos + 1;
		crtPos+=1;
	}
	
	public int size() {
		
		return crtPos;
	}
	public Point get(int index) {
		return pArray[index]; // index 방 안에있는 주소
	}
}
