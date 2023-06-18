package innerclass; //Sample.java와 같이 복습

public class AnonymousInnerClass {
	
	String myName = "고구마";
	
	public AnonymousInnerClass() {}
	
	public void start() {
		//	3. 익명(Anonymous)의 내부클래스 만들기
		//	클래스명이 존재하지 않는 클래스
		//	한번만 사용하거나 자주 사용하지 않을때 익명 내부클래스를 만듦.
		
		Sample s = new Sample() {//클래스 선언과 동시에 객체 생성
			//내부클래스
			//변수 선언
			int tot = 120;
			
			//메소드
			void totOutput() {
				System.out.println("tot=" + tot);
				System.out.println("myName=" + myName);
			}
			
			//Sample의 메소드를 오버라이딩
			//오버라이딩은 상위클래스 형변환하더라도 오버라이딩 된 기능을 유지함.
			public void getSum() {
				int total = 0;
				for(int i=2; i<=100; i+=2) {
					total+=i;
				}
				System.out.println("evenSum ->" + total);
			}
			
		};
		
		//익명의 내부클래스에서 새로 생성된 메소드는 상위의 Sample 클래스에 대입하면 사용할수 없음.
		//s.totOutput();
		
		s.getSum();
	}
	
	
	///////////////////////////////////
	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		aic.start();
		
	}
	
}
