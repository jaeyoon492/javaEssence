package no03Control;

import java.util.*;

public class Helloworld26_if_Nesting {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ',opt=' ';
		
		System.out.print("점수를 입력해 주세요. >");
		
		Scanner scanner= new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다.%n", score);
		
		if (score >= 90) {					 //score가 90점 보다 같거나 크면 A학점 (grade)
			grade = 'A';
			if ( score >= 98) {				//90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if (score <= 94) {		  //90점이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >=80) {			   //score가 80점 보다 같거나 크면 B학점(grade)
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
		} else {							   //나머지는 D학점
			grade = 'D';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n" , grade, opt);
		}
		
	}


