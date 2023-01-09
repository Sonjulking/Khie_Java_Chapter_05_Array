package khie;

import java.util.Scanner;

//키보드로 배열에 크기를 입력을 받아보자.

public class Array_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요. >>> ");

//		int size = sc.nextInt();
//
//		String[] str = new String[size];

		String[] str = new String[sc.nextInt()];

		for (int i = 0; i < str.length; i++) {

			System.out.print((i + 1) + "번째 배열의 문자열을 입력해 주세요. >>> ");

			str[i] = sc.next();

		}

		System.out.print("입력된 배열의 값은 ");

		for (int i = 0; i < str.length; i++) {

			System.out.print(str[i]);

			if (i < str.length - 1) {

				System.out.print(", ");
			}

		}

		System.out.println(" 입니다.");

		for (int i = 0; i < str.length; i++) {

			System.out.println("str[" + i + "] >>> " + str[i]);

		}

		// 문자열 배열에 저장된 문자열을 검색해 보자.

		System.out.print("검색할 문자열을 입력하세요. : ");

		String search = sc.next();

		for (int i = 0; i < str.length; i++) {

			if (search.equals(str[i])) {

				System.out.println("찾은 문자열 >>>" + str[i]);
				System.out.println("찾은 인덱스 >>>" + "str[" + i + "]");

			} // else {

			// System.out.println("찾는 문자열이 없습니다."); //쉽게 하려면 arraylist를 이용해야된다..

			// } //배열에서 else문이 의미가없음... 3개가 출력되어버린다.

		}

		sc.close();

	}

}
