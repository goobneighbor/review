package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	
	public ExceptionTest1() {}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.print("첫번째 수=");
			int num1 = scan.nextInt();
			System.out.print("두번째 수=");
			int num2 = scan.nextInt();
			
			int hap = num1 + num2;
			int cha = num1 - num2;
			int mul = num1 * num2;
			int div = num1 / num2;	//<-------------
			
			//		   5 + 10 = 15
			//		   printf(String format, Object... args)
			System.out.printf("%-5d + %-5d = %7.2f\n", num1, num2, (double)hap);
			System.out.printf("%d - %d = %d\n", num1, num2, cha);
			System.out.printf("%d * %d = %d\n", num1, num2, mul);
			System.out.printf("%d / %d = %d\n", num1, num2, div);
			
			int data[]= {10,20,30};
			System.out.println("배열->"+data[data.length-1]);
			
			
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println("두번째 값은 0을 입력하지 마세요.");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aioe) {
			System.out.println(aioe.getMessage());
		}finally {
			System.out.println("무조건 실행됨.");
		}
		
	}

	public static void main(String[] args) {
		
		new ExceptionTest1().start();
//		ExceptionTest1 et = new ExceptionTest1();
//		et.start();
		
	}

}
