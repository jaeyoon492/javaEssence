package no02Operator;

public class Helloworld09_operator {
	public static void main(String[] args) {

		int i = 5, j = 0;

		j = i++; //������
		System.out.println("j=i++; ������, i=" + i + ", j=" + j);//������ i=5 j=5 ���� ++�� ���� i=5+1 j=5

		i = 5;
		j = 0;

		j = ++i; //������
		System.out.println("j=++i; ������, i=" + i + ", j=" + j);//i=
		
		int num1 = 1;
		int num2 = 1;
		System.out.println(++num1); // num1�� +1 ��Ų �ڿ� ���� ������ �����
		// �����϶� ��ǻ�Ϳ��� ����� ����
		System.out.println(num2++); // �ϴ� ���� ���� �״�� ���� �� ������ +1
		num2 = num2+1; 
	}
}
