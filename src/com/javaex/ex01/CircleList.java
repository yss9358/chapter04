package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	
	private Circle[] cArray;
	private int crtPos;
	
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	
	public void add(Circle c) {
		// 현재배열개수+1 배열을 새로만든다
		// 이전배열의 값을 새배열에 옮긴다
		// 마지막방에 새주소를 추가한다
		cArray[crtPos]= c;
		// crtPos = crtPos +1;
		crtPos +=1;
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	

}
