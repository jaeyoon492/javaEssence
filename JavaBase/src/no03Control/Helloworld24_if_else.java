package no03Control;

import java.util.Scanner;//ScannerŬ������ ����ϱ� ���� �߰�

public class Helloworld24_if_else {
	public static void main(String[] args) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
	}
}
