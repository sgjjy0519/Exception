// 다중 catch
public class ex09 {

	public static void main(String[] args) {
		try {
			//매개값이 없을때 예외발생 13라인 catch문 실행
			String data1 = args[0];
			String data2 = args[1];
			//매개값이 숫자가 아닐 경우 예외발생 15라인 catch문 실행
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
		
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요."); // 예외 발생 여부 상관없이 실행
		}

	}

}
