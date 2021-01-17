package no04Array;
import java.util.Scanner;
public class Helloworld54_multi_dimensional {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},				//[0][0],[0][1]
				{"김쵸크","태훈이형"},			//[1][0],[1][1]
				{"띵재윤","명재윤"}				//[2][0],[2][1]
		};
		
		Scanner sc= new Scanner(System.in);		//화면에서 입력받기 위해 스캐너객체 생성
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?" , i+1, words[i][0]);	//문제는 [i]행[0]에 있으므로 [i][0]으로 문제를 출력
			
			String tmp = sc.nextLine();			//화면에서 문자열 입력받기
			
			if (tmp.equals(words[i][1])) {								//정답은 [i]행[1]에 있으므로 [i][1]으로 정답과 대조
				System.out.printf("정답이오. %n%n");
			}else{
				System.out.printf("틀렸소. 정답은 %s이오!%n%n", words[i][1]);
			}
		}
	}
}
