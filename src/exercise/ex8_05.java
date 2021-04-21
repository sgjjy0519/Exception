package exercise;

public class ex8_05 {

	public static void main(String[] args) {
		try {
			method1();                   // 예외발생
			System.out.println(6);       // 예외 발생되서 실행X
		}catch (Exception e) {
			System.out.println(7);
		}

	}
	
	static void method1() throws Exception{
		try {
			method2();
			System.out.println(1);		// 예외 발생되서 실행X
		}catch (NullPointerException e) {
			System.out.println(2);
			throw e; // 예외를 다시 발생시킨다.(예외 되던지기)
		}catch (Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
	
	static void method2() {
		throw new NullPointerException();  // NullPointerException 발생
	}
}
