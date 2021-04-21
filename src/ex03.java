
public class ex03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!ArithmeticException 발생
			System.out.println(4);	 // 실행되지않음
		}catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
