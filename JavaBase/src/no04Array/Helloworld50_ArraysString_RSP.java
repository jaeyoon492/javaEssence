package no04Array;

import java.util.Arrays;
import java.util.Iterator;

public class Helloworld50_ArraysString_RSP {

	public static void main(String[] args) {
		String[] strArr = { "����", "����", "��" };		//index 0~2
			System.out.println(Arrays.toString(strArr));//Arrays.toString �޼ҵ带 ���� ���ڿ� �������� ���
			
			
		for (int i = 0; i < 3; i++) {
			int tmp = (int)(Math.random()*3); 			//0~2�� ������ ���� ��´�.
			System.out.print(tmp);						//0~2������ �ƹ����ڳ� ���´�.
			System.out.println();
			System.out.println(strArr[tmp]);			//strArr�迭�� tmp�� ������ �������� �´� �迭�� ��µȴ�.
														//Ex:�������� (2)�� ������ strArr�迭�� 2��° index�� "��"�� ��µȴ�.
		}
	}
}
