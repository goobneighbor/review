
public class PrivateStudent {
	int num = 999;
	//캡슐화 : 외부에서 쓸수 없게 정보 보호
	private String name = "gildong";
	
	PrivateStudent() {

	}
	public void output() {
		System.out.println(num+","+name);
	}
	
	//캡슐화된 변수의 정보를 외부에서 사용하도록 메소드를 생성해줘야 함.
	// getter : get멤버변수() / 외부로 내보내는 기능
	public String getName() {
		return name;
	}
	// setter / 외부에서 값을 수정할때 사용
	public void setName(String name) {
		this.name = name;
	}
}
