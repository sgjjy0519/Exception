package exercise;

public class ex8_07_LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws ex8_07_NotExistIDException, ex8_07_WrongPasswordException {
		// id가 "blue"가 아니라면 ex8_07_NotExistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new ex8_07_NotExistIDException("아이디가 존재하지 않습니다.");
		}
		//password가 "12345"가 아니라면 ex8_07_WrongPasswordException 발생시킴
		if(!password.equals("12345")) {
			throw new ex8_07_WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
