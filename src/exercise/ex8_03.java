package exercise;

public class ex8_03 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b)
				System.exit(0);
			System.out.println(2);
		}catch (RuntimeException r) {
			System.out.println(3);
			return;
		}catch (Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}
}
// 변수 b의 값이 true이므로 8 라인이 실행되어 프로그램 바로 종료되어  finally블럭 실행 안됨