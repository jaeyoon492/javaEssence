package no04Array;

import java.util.Arrays;

public class Helloworld42_ArrayEx {

	public static void main(String[] args) {
		
		int[] iArr1 =new int[10];						//�迭�� ����� ���̸� �����Ͽ� �����ߴ�.
		int[] iArr2 =new int[10];						
//		int[] iArr3 =new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};				//�迭�� ������ �ʱ�ȭ�� ���ÿ� �Ҽ��ִ�.
		char[] charr = {'a','b','c','d'};
			for (int i = 0; i < iArr1.length; i++) {
				iArr1[i] = i + 1;					    //���̰� 10�� �迭�� for���� �̿��Ͽ� �� �ε����� intŸ���� ���� ������ 1~10(+1�� �Ͽ����Ƿ� 0~9���ƴ�)
			}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)((Math.random()*10)+1);     //���̰� 10�� �迭�� for���� �̿��Ͽ� �� �ε����� intŸ���� ���� (������)�� ������
		}
		
		for (int i = 0; i < iArr1.length; i++) {		//for���� �̿��ؼ� 1~10���� �����
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));		//Math.random()�� �̿����� 1~10������ �ε����� �������� ���ڿ��� ����Ѵ�.
		System.out.println(Arrays.toString(iArr3));		//������ �ʱ�ȭ�� �� �迭�� ���ڿ��� ����Ѵ�.
		System.out.println(Arrays.toString(charr));    	//char�迭�� ���ڿ��� ����Ѵ�.
		System.out.println(iArr3);						//���������� ����ص� ������ ������ ����.
		System.out.println(charr);						//char�迭�� println�޼���� ����ϸ� ������ ���� ��µȴ�.
		
		
		
	}

}
