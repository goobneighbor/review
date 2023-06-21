package java05_exception;

import java.util.Scanner;

public class ExceptionTest2 {
	Scanner scan = new Scanner(System.in);
	
	public ExceptionTest2(){}
	
	public void start() {
		
		try {
			System.out.print("첫번째 수=");
			int num1 = scan.nextInt();	//5 <---------- InputMismatch
			System.out.print("두번째 수=");
			int num2 = scan.nextInt();	//10 <----------  "
			
			int hap = num1 + num2;
			int cha = num1 - num2;
			int mul = num1 * num2;
			int div = num1 / num2;	//<------------- Arithmetic
			
			//		   5 + 10 = 15
			//		   printf(String format, Object... args)
			System.out.printf("%-5d + %-5d = %7.2f\n", num1, num2, (double)hap);
			System.out.printf("%d - %d = %d\n", num1, num2, cha);
			System.out.printf("%d * %d = %d\n", num1, num2, mul);
			System.out.printf("%d / %d = %d\n", num1, num2, div);
			
			int data[]= {10,20,30};
			System.out.println("배열->"+data[data.length]); //ArrayIndexOutOfBounds
			
		//catch() 순서는 하위>상위 순으로 쓸 것. Exception을 제일 마지막에 써야 됨.	
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열의 index가 잘못 처리되었습니다.");
		}catch(Exception e) {//모든 예외 클래스는 Exception 클래스를 상속 받음.
							//하위클래스는 상위클래스에 대입 가능(반대는 불가)
							//같은 실행문을 쓰는 다른 종류의 Exception 들을 동시에 처리할 때 사용.
			System.out.println("입력 값은 정수를 입력하고 두번째 값은 0을 제외하여야 합니다.");
		}		
	}

	public static void main(String[] args) {
		new ExceptionTest2().start();
	}

}
