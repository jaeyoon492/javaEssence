package no03Control;

import java.util.*;

public class Helloworld26_if_Nesting {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ',opt=' ';
		
		System.out.print("������ �Է��� �ּ���. >");
		
		Scanner scanner= new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("����� ������ %d �Դϴ�.%n", score);
		
		if (score >= 90) {					 //score�� 90�� ���� ���ų� ũ�� A���� (grade)
			grade = 'A';
			if ( score >= 98) {				//90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';
			} else if (score <= 94) {		  //90���̻� 94�� �̸��� A-
				opt = '-';
			}
		} else if (score >=80) {			   //score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else if(score >=70) {
			grade = 'C';
			if (score>=78) {
				opt = '+';
			} else if (score <74) {
				opt = '-';
			}
		} else {							   //�������� D����
			grade = 'D';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n" , grade, opt);
		}
		
	}


