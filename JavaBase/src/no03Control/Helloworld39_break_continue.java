package no03Control;
import java.util.*;
public class Helloworld39_break_continue {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {											//무한반복
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴 (1~3)를 선택하세요(종료:0)>");
			
			String tmp = scanner.nextLine();					//콘솔에서 받은 내용을 tmp로 저장
			menu = Integer.parseInt(tmp);						//tmp를 int형태로 menu에 저장
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");	//0을 입력하면 break가 작동되서 멈춤
				break;
			}else if (!(1<= menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 "+ menu + "번입니다.");
		}
	}
}
