package no04Array;
import java.util.Arrays;
public class Helloworld52_multi_dimensional {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},									//0행 ((0,1,2)열)이런식으로 읽는다.
				{20,20,20},										//1행 ((0,1,2)열)이런식으로 읽는다.
				{30,30,30},										//2행 ((0,1,2)열)이런식으로 읽는다.
				{40,40,40},										//3행 ((0,1,2)열)이런식으로 읽는다.
		};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {						//score.length는(몇행인가?로 읽는다) 4행이므로 (4)
			for (int j = 0; j < score[i].length; j++) {					//score[i].length는 중첩포문이라 i의 한개의 행에 j의 (0,1,2열)총 3개의 열이 읽어지고 다음행 진행 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);	//[0행][0열] =100  [1행][1열]=20이렇게 읽는다.
				//System.out.println(Arrays.toString(score[i]));
				//System.out.println(Arrays.toString(score[j]));
				
				sum = sum + score[i][j];			//[0][0]~[3][2]까지 모두 더한것
			}
		}
		System.out.println("sum" + sum);
	}
}
