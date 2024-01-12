package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	// 필드
	
	private T[] tArray;
	private int crtPos;
	
	// 생성자
	public MyList() {
		tArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	public void add(T o) {
		tArray[crtPos] = o;
		crtPos +=1;
	}
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return tArray[index];
	}

	@Override
	public String toString() {
		return "MyList [tArray=" + Arrays.toString(tArray) + ", crtPos=" + crtPos + "]";
	}
	
	

}
