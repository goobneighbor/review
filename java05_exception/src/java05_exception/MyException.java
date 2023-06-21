package java05_exception;

//사용자 정의 예외 클래스 생성 규칙
// 1. 클래스명은 Exception을 마지막 단어로 합성. e.g.)단어 + Exception
// 2. api의 Exception 클래스나 RuntimeException 클래스 중 한개를 상속 받음

public class MyException extends Exception {
	public MyException() {
		super("1~100 사이의 값이 아닙니다.");
	}
	public MyException(String message) {
		super(message);
	}
}
