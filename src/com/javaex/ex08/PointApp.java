package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		// Map <자료형,Class명> 변수명 = new HashMap<자료형,Class명>(); 
		
		Map<String,Point> pMap = new HashMap<String,Point>();

		Point p01 = new Point(2,100002);
		Point p02 = new Point(5,5);
		Point p03 = new Point(12,22);
		
		// Map 은 add 대신 put 사용
		// put(자료형변수, 주소값)
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("정우성").getY());
		
		System.out.println(p01.toString());
		
		/*
		// key 값이 같으면 뒤에 저장한 값으로 수정됨
		Point p04 = new Point(100,100);
		pMap.put("박명수", p04);
		System.out.println(pMap.toString());
		*/
		
		// key 값을 Set으로 관리 
		// key 값이 
		Set <String> keys = pMap.keySet(); 
		
		//키 전체 출력하기
		for (String name :keys) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------");
		// 전체출력하기
		
		for (String name : keys) {
			System.out.println(pMap.get(name));
			System.out.println(pMap.get(name).toString());
			System.out.println(pMap.get(name).getY());
		}
		
		
		
		
		
		
		
	}

}
