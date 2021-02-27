package no05Object;

public class Helloworld64_Ex_CallStack {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}

/*
 1~2: 예제를 실행시키면, JVM에 의해서 main 메서드가 호출됨으로써 프로그램이 시작됩니다. 이

때, 호출 스택에는 main메서드를 위한 메모리 공간이 할당되고 main메서드의 코드가 수행되기

시작한다.

 

3: main메서드에서 println를 호출한 상태이다. 아직 main메서드가 끝난 것은 아니므로 main메서드는 

호출 스택에 대기상태로 남아있고 println의 수행이 시작된다. println 메서드에 의해 "Hello World!"가 

화면에 출력됨

 

4. 수행이 완료된 println 메서드는 사라지고 호출했던 main메서드로 되돌아간다.(return) 

대기 중이던 main메서드는 println을 호출한 이후부터 수행을 재개한다.

 

5.main메서드에도 더 이상 수행할 코드가 없으므로 종료되어, 호출 스택은 완전히 비워지게 되고 프로그램은 종료됨.*/