package java_example_180525;

public class ch6_22_memberService {
	String ID, Password;
	public boolean login(String ID, String Password){
		this.ID = ID;
		this.Password = Password;
		if(ID.equals("yourid") &&  Password.equals("12345"))
			return true;
		else
			return false;
	}
	
	public void logout(){
		System.out.println(this.ID + "님 로그아웃 되었습니다.");
	}
	
}
