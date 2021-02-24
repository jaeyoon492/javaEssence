package no05Object;

import java.util.Arrays;
import java.util.Iterator;

public class Helloworld58_ObjectArrays {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[20];	//다뤄야되는 객체가 많으면 for 문을 쓰자
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			
			System.out.println(i);	//배열에 20개의 객체를 생성하였음.
		}
	}
}
