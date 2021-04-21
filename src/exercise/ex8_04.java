// 1~100까지 임의의 값 맞추기 게임.
// 예외처리를 통해 숫자가 아닌값을 입력했을 때 다시 입력받도록하기

package exercise;

import java.util.*;

public class ex8_04 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1; //1~100까지의 임의의 값
		int input = 0;  // 사용자 입력을 저장할 공간
		int count = 0;  // 시도횟수 카운트하는 변수

		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			
			//input = new Scanner(System.in).nextInt();
			try {
				input = new Scanner(System.in).nextInt();
			}catch(Exception e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if( answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 "+count+"번 입니다.");
				break;
			}
		}while(true); //무한반복문
	}

}
