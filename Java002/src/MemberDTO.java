
public class MemberDTO {
	private String userid;
	private String userpwd;
	private String username;
	private String tel;
	private String email;
	
	public MemberDTO() {}
	
	public MemberDTO(String userid, String username, String tel) {
		this.userid = userid;
		this.username = username;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", tel=" + tel
				+ ", email=" + email + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
