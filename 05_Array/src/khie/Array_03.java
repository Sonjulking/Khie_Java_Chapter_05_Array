package khie;

import java.util.Scanner;

/*
 * [문제] 내가 여행가고 싶은 5개 나라를 키보드로 입력받아서 배열에 저장 후 화면에 출력해 보세요.
 * 
 */

public class Array_03 {

	public static void main(String[] args) {

		String[] nations = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "번째 가고싶은 나라 : ");
			nations[i] = sc.next();

		}

		for (int i = 0; i < 5; i++) {

			System.out.print(nations[i]);

			if (i < nations.length - 1) {// 마지막 배열에서 콤마를 출력하지 않는다.

				System.out.print(", ");

			}

		}

		// 단축 for문(개선된 for문, 향상된 for문) page 218참조

		/*
		 * =>jdk 1.5 버전부터 추가된 기능. =>주로 배열의 요소(값)를 처리(출력)할 때 사용함.
		 *
		 * 형식) for(자료형 변수명 : 배열명) { 반복 실행문; }
		 * 
		 * -실행 방법 =>배열의 첫번째 인덱스[0]에 있는 데이터를 좌변의 변수에 저장하여 출력을 해 줌. =>데이터의 수 만큼 자동으로 반복하여
		 * 출력을 함.
		 * 
		 * -주의사항 =>우변에 있는 배열명의 자료형과 좌변에 있는 변수명의 자료형은 반드시 일치해야 함. =>만약 일치하지않으면 error가
		 * 발생한다.
		 */

		System.out.println();

		// 향상된 for문을 이용하여 출력을 해보자.

		for (String na : nations) {

			System.out.println(na);

		} // 인덱스는 따로 구해야됌

//		int index = 0;
//		for(String arrayValue : array){
//		    System.out.println("Index : " + index);
//		    System.out.println(arrayValue);
//		    index++;
//		}

		sc.close();

	}

}
