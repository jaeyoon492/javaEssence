package no04Array;
import java.util.Arrays;
public class Helloworld53_multi_dimensional {

	public static void main(String[] args) {
		int[][] score= {
				 {100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
			};
			int kor = 0;
			int eng = 0;
			int math = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("==================================");
		
		for (int i = 0; i < score.length; i++) {			//행을 나타냄 score.length(원래 0~4인데) 밑에 (i+1을 해서 1~5로 표시됨) 5행
			int sum = 0;
			float avg = 0.0f;
			
			kor += score[i][0];						//국어점수 각 열을 다더함
			eng += score[i][1];						//수학점수 각 열을 다더함
			math += score[i][2];					//영어점수 각 열을 다더함
			
			System.out.printf("%3d",i+1);					//행의 갯수를 출력 
			
			for (int j = 0; j < score[i].length; j++) {	//(0,1,2)3열
				sum += score[i][j];						//각열을 더한 수(과목별총점)
				
				System.out.printf("%6d" ,score[i][j]);	//[행][배열] 위치를 통해 각 자릿값을 구함 [0][2]=100 [2][2]=30
			}
			
			avg = sum/(float)score[i].length;			//다 더한값(sum)에서 (score[i].length)3열을 나누면됨 대신 평균을 정확히 하기위해 float형변환후 3.0f로 나눔
			System.out.printf("%5d %5.1f%n" , sum, avg);
			
		}
		
		System.out.println("==================================");
		System.out.printf("총점:%4d %4d %4d%n", kor,eng,math);
	}
}
