import com.multi.Student;

//클래스가 public // Student.java랑 복습

public class ModifierTest01 {

	public ModifierTest01() {
		//접근제한자는 public > protected > default(생략) > private(캡슐화)
		// public : 공용
		// default : 같은 패키지내에서만 허용
		
		//객체생성
		// 생성자 메소드가 public
		Student student = new Student();
		
		System.out.println("이름="+student.name);
		
		student.studentPrint();
		
	}

	public static void main(String[] args) {
		new ModifierTest01();
		
		
	}

}
