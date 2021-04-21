
public class ex04 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음"); // 예외 객체 생성(생성자에 들어가는게 예외메세지)
			throw e;
		
		}catch (Exception e) {
			System.out.println("에러 메세지 : "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");

	}

}
