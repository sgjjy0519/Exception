package exercise;

public class ex8_01 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) throw new ArithmeticException();
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
// b 가 true일때 = 예외가 발생할때 1, 3, 5 출력 , b가 false일때 1,3,5,6
// ArithmethicException은 RuntimeException의 자손이므로 
// RuntimeException이 정의된 cathc블럭에서 처리
// finally 블럭은 항상 처리