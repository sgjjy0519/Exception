package exercise;

public class ex8_07_NotExistIDException extends Exception {
	// 모든 예외의 조상인 Exception 상속
	public ex8_07_NotExistIDException() { //기본생성자
		
	}
	public ex8_07_NotExistIDException(String message) {
		super(message);
	}

}
