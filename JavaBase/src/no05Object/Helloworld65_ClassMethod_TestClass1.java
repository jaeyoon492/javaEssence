package no05Object;

class TestClass {
	void instanceMethod() {}//인스턴스 메서드
	static void staticMethod() {}//static 메서드
	
	void instanceMethod2() {	//인스턴스 메서드
		instanceMethod();	//다른 인스턴스메서드를 호출한다.
		staticMethod();	//static메서드를 호출한다.
	}
	
	static void staticMethod2() {	//static 메서드
		//instanceMethod(); //인스턴스메서드를 호출할 수 없다.
		staticMethod();	//static메서드는 호출 할 수 있다.
	}
}

/*같은 클래스에 속한 멤버들 간에는 볃도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다. 단,
 * 클래스 멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 겨우에는 인스턴스를 생성해야 한다.
 * 그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스 멤버가
 * 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있기 때문이다.
 */
