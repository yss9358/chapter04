package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		// ArrayList 
		// ArrayList<Class> x = new ArrayList<Class>();
		// add(),size()
		
		List<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(3,3);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);
		
		// pList의 사이즈 확인
		System.out.println("size= " + pList.size());
		
		// 변수를 통해 y값 확인
		System.out.println("p01의 y값= " + p01.getY());
		
		// 주소를 통해 y값 확인
		System.out.println("p01의 y값= " + pList.get(0).getY());
		System.out.println("p01을 toString 사용 " + pList.get(0).toString());
		
		System.out.println("--------------------------");
		
		// ArrayList에서는 length 가 아니라 size를 사용한다
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
				
		System.out.println("--------------------------");
		
		// pList에서 0번째 방을 지우기
		// size가 하나 줄어들고 배열에서 제거한다. 한칸씩앞으로 땡겨와 뒷배열이 0번째 방을 차지함
		pList.remove(0);
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("--------------------------");
		
		pList.remove(p03);
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("---------------------------");
		
		
		// ArrayList 가 toString을 재정의해서 사용중인것을 사용할 수 있다.
		System.out.println(pList.toString());
		
		System.out.println("---------------------------");
		
		List<Integer> iList = new ArrayList<Integer>();
		
		Integer i01 = new Integer(3); // new Integer(3); 대신 3; 만 넣어도 Integer는 자동으로 박싱되어 주소값이 입력된다.
		Integer i02 = 6; // Integer i02 = 6; 을 해도 상관없음. new 뒤에는 대문자가 와야됨.. int 사용x , Integer 사용o
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		
	}

}
