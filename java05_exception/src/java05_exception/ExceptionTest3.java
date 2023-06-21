package java05_exception;

import java.util.Scanner;

public class ExceptionTest3 {
	
	public ExceptionTest3() {}
	
	public void inData() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수->");
		String n1 = scan.nextLine();//콘솔에서 한줄씩 입력함.(enter 포함)
		System.out.print("두번째 수->");
		String n2 = scan.nextLine();
		int n1Int = Integer.parseInt(n1); // 문자열을 정수형 int로 변환해주는 메소드
		int n2Int = Integer.parseInt(n2);
		divide(n1Int, n2Int);
	}
	
	public void divide(int n1, int n2) throws Exception {
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
		array();
	}
	
	public void array() throws Exception {
		int data[] = {25,52,6,4};
		System.out.println(data[4]);
	}

	public static void main(String[] args) {
		
		try {
			ExceptionTest3 et3 = new ExceptionTest3();
			et3.inData();
		}catch(Exception e) {
			System.out.println("예외 발생함.....");
		}

	}

}
