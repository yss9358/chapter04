package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		// set - HashSet 
		// 순서 없이, 중복 저장 안됨
		// 

		Set<Integer> iSet = new HashSet<Integer>(); // generic 에선 대문자를 써야 함 < > 사이 
		
		//int a = 3; // a에 3 값이 들어간다
		//Integer b = new Integer(3); // b 에 3의 주소값이 들어간다
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);
		
		iSet.add(i01); 
		iSet.add(i02);
		iSet.add(i03);
		
		// iSet.add(null);  // 괄호안에는 Integer 가 아니라 주소가 들어가야함
		
		System.out.println(iSet.size()); // iSet 에 몇개 들어있는지
		System.out.println(iSet.toString()); // iSet에 어떤 값들이 들어있는지
		
		System.out.println("------------------------------------------");
		// 반복문 for(갯수가 정해져있다) , while (갯수가 정해져 있지 않다)
		
		//향상된 for 문
		// for ( 자료형 변수명 : 배열명 )
		
		for(Integer num : iSet) {
			System.out.println(num.toString());
		}
		
		System.out.println("------------------------------");
		
		Integer i04 = new Integer(100);
		iSet.add(i04);
		
		System.out.println(iSet.size()); // 중복된 값은 같은 추가 하지 않음
		System.out.println(iSet.toString()); // 값이 추가되어도 위치가 뒤에 배치되는게 아니라 무작위로 배치됨

		System.out.println("-----------------------------");
		
		for( Integer no : iSet) {
			System.out.println(no.toString()); // no 변수에 iSet의 값을 하나씩 출력
		}
		
		System.out.println(iSet.size()); // iSet 값이 몇개 있는지 확인
		System.out.println(iSet.toString()); // iSet 의 값들을 나열
		
	}

}
