package no04Array;
import java.util.Arrays;
public class Helloworld52_multi_dimensional {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},									//0�� ((0,1,2)��)�̷������� �д´�.
				{20,20,20},										//1�� ((0,1,2)��)�̷������� �д´�.
				{30,30,30},										//2�� ((0,1,2)��)�̷������� �д´�.
				{40,40,40},										//3�� ((0,1,2)��)�̷������� �д´�.
		};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {						//score.length��(�����ΰ�?�� �д´�) 4���̹Ƿ� (4)
			for (int j = 0; j < score[i].length; j++) {					//score[i].length�� ��ø�����̶� i�� �Ѱ��� �࿡ j�� (0,1,2��)�� 3���� ���� �о����� ������ ���� 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);	//[0��][0��] =100  [1��][1��]=20�̷��� �д´�.
				//System.out.println(Arrays.toString(score[i]));
				//System.out.println(Arrays.toString(score[j]));
				
				sum = sum + score[i][j];			//[0][0]~[3][2]���� ��� ���Ѱ�
			}
		}
		System.out.println("sum" + sum);
	}
}
