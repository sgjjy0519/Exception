// 실행 예외처리
public class ex08 {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; // 예외발생 ==> catch 문 실행
			data2 = args[1]; 
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1); // 매개값에 숫자가 아닌 값이 들어가면 예외발생==>catch문 실행
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println(data1 +"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요."); // 예외발생 여부와 상관 없이 실행
		}
	}

}
