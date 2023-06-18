package innerclass;

public class MethodInnerClass {
		String email = "goguma777@nate.com";
		public MethodInnerClass() {
			System.out.println("MethodInnerClass()생성자메소드");
		}
		
		public void emailOutput() {
			System.out.println("이메일=>"+email+"\n===================");
		}
		
		//	2. 메소드 내에 내부클래스 만들기
		public void createInner() {
			int num = 100;
			//메소드에 생성하는 내부클래스
			//	외부클래스의 정보와 메소드 내에서 정의한 정보를 사용할 수 있음.
			class InnerClass{
				String name = "세종대왕";
				String telBefore = "010-7896-9999";
				
				InnerClass(){
					System.out.println("num=====>"+num);
					System.out.println("name=====>"+name);
					System.out.println("tel=====>" + telBefore); //클래스 정의 이전에 선언한 정보라 사용가능
					System.out.println("tel=====>" + telMember); //멤버영역에 있는 멤버변수라 사용가능
					//System.out.println("tel=====>" + telAfter); //클래스 정의 이후에 선언한 정보라 사용불가
					
				}
				
				void getInformation() {
					emailOutput();//외부클래스의 메소드 호출
					System.out.println("email*****:" + email);
					System.out.println("addr*****:" + addr); // 멤버영역에 있는 멤버변수가 제일 먼저 실행됨
				}
				String telMember = "010-2324-5555";
			}
			String telAfter = "010-7896-9999";// 클래스 정의 이전에 선언한 정보만 사용 가능해서 사용 불가.
			
			//메소드에서 정의한 내부클래스 객체 만들기
			InnerClass ic = new InnerClass();
			ic.getInformation();
		}
		//외부의 멤버영역(클래스 영역)
		String addr = "서울시 성동구";//위치상 뒤/아래에 쓰여있어도 멤버영역에 있는 멤버변수는 생성자 메소드와 메소드보다 먼저 반영됨.

	public static void main(String[] args) {
		MethodInnerClass mic = new MethodInnerClass();
		mic.createInner();
	}

}
