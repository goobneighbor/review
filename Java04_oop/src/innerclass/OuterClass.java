package innerclass;

public class OuterClass {
	
	int productNo = 1234;
	String productName = "컴퓨터";
	
	public OuterClass() {
		System.out.println("OuterClass() 생성자");
	}
	
	public void productList() {
		System.out.println("상품번호->"+productNo);
		System.out.println("상품명->"+productName);
	}
	
	public void createInner() {
		//내부클래스 객체를 외부클래스의 영역에서 사용할 때는 외부클래스를 이용하지 않고 내부클래스 객체를 생성할수 있음.
		InnerClass i1 = new InnerClass();
		i1.memberOutput();
	}
	/*내부클래스
		클래스 내에 선언한 클래스
		1. 클래스 영역에 만들기
		2. 메소드 내에 만들기
		3. 익명(Anonymous)로 만들기	 
	*/
	
	//1. 클래스 영역에 내부클래스 만들기
	class InnerClass{
		int code = 9999;
		String userid = "ggm";
		//static String username ="ggt";
		// The field username cannot be declared static in a non-static inner type, unless initialized with a constant expression
		// instance 클래스 내부에서는 static 선언이 불가하다. 단, 상수(변하지 않는 값)인 final static 선언은 가능하다.
		
		InnerClass(){
			System.out.println("InnerClass() 생성자");
		}
		
		void memberOutput() {
			System.out.println(code+" = "+userid);
		}
		void changeData() {
			code = 8888; //내부클래스 멤버변수
			productNo = 5555; //외부클래스의 멤버변수. 접근가능.
			memberOutput(); //내부클래스 메소드
			productList(); // 외부클래스 메소드
		}
	}
	
	//////////////////////////////////////
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.productList();
		
		//내부 클래스 객체 생성 : 외부 클래스 없이 객체를 생성할수 없음.
//		new OuterClass().new InnerClass();
		OuterClass.InnerClass oi = oc.new InnerClass();
		
		oi.memberOutput();
		
		oi.changeData();
		
		oc.createInner();
		
	}

}
