package no01Variable;

import java.util.*;		//1.ScannerŬ������ ����ϱ� ���� �߰�

public class Helloworld08_scanner {
		public static void main(String[] args) {
		//2.ScannerŬ������ ��ü ����
		Scanner scanner = new Scanner(System.in);	//(System.in)�� ȭ���Է�
		
		System.out.println("���ڸ� ������ �Է��ϼ���");
		//int num=scanner.nextInt();				/*�ι����� �и���Ű�� �ʰ� �� 
													//�ѹ������� ��ü����*/
		//���δ����� �Է¹����� ����
		String input = scanner.nextLine();			//ȭ�鿡�� �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);			//���ڿ�(input)�� ����(num)���� ��ȯ
		scanner.close();
		
		System.out.println("�Է³���:"+ input);
		System.out.printf("num=%d%n", num);
		
		
		
		
	}
}
