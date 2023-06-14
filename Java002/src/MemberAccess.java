
public class MemberAccess {
	String id = "goguma";
	String name = "고구마";
	String tel = "010-8888-7777";
	String email = "goguma@daum.net";
	
	public MemberAccess() {}
	
	public MemberDTO getMember() {
		MemberDTO dto = new MemberDTO();
		dto.setUserid(id);
		dto.setUsername(name);
		dto.setTel(tel);
		dto.setEmail(email);
		
		return dto;
	}
	
	public MemberDTO[] getAllMember() {
		
		MemberDTO m1 = new MemberDTO();
		m1.setUserid("java");
		m1.setUsername("홍길동");
		m1.setTel("010-3244-6563");
		
		MemberDTO m2 = new MemberDTO("main", "메인", "010-8888-3333");
		MemberDTO m3 = new MemberDTO("admin","관리자","010-2222-5555");
		
		MemberDTO[] member = new MemberDTO[3];
		member[0] = m1;
		member[1] = m2;
		member[2] = m3;
		
		return member;
	}
	
}
