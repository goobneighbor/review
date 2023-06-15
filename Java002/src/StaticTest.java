
public class StaticTest {
	
	//static
	//멤버변수, 일반 메소드에 static을 표기한다. 생성자 x
	//멤버변수에 static 은 데이터형 왼쪽에 기술하고
	//멤버변수를 접근할 때 객체를 생성하지 않고, 클래스명.멤버변수로 접근이 가능함.
	//객체를 여러개 만들더라도 static 변수는 1개만 존재함. 싱글톤
	
	int num = 10;					//객체 안만들면 못쓰는 변수
	String name = "홍길동"; 			//객체 안만들면 못쓰는 변수
	static String local = "강남구";	//객체 안만들어도 사용할수 있는 변수
	
	public StaticTest() {}
	
	//메소드에 static 만들기
	//객체를 만들지 않고 호출하여 사용할 수 있음.
	public static void testMethod() {
		int a = 500;
		//						같은 클래스 static 변수이므로 클래스명을 생략 가능.
		System.out.println("local="+local);
	}
	public void print() {
		System.out.println("num="+num);
	}
	
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		//값 변경
		StaticTest.local = "영등포구"; //객체생성 후 초기화
		System.out.println("st1->"+st1.local);
		System.out.println("st3->"+st3.local);
		System.out.println(local); //클래스명.local 로 쓰는게 일반적인 표기방법.
		System.out.println("pi->"+Math.PI); //클래스명(Math).PI / 그래서 api 에서 modifier에 static 있으면 클래스명.메소드명 이렇게 쓰는거였음.
		
		st1.print();
		//testMethod()는 static 메소드이므로 한개만 존재하고 클래스명.메소드명으로 호출할 수 있음.
		StaticTest.testMethod(); 
		//new StaticTest().testMethod(); //testMethod()가 static 이 아닐 경우 new 객체 생성후 객체명.메소드명으로 호출.
	}

}
/*
 st1        |     st2     |       st3
int num=10; | int num=10; | int num=10;
String name | String name | String name
= "홍길동";   | = "홍길동";  | = "홍길동";

static String local = "강남구";
(static 은 따로 저장함. single tone)
 */
class Test01{
	
	
}
class Test02{
	
	
}