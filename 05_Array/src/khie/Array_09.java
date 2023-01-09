package khie;

/*
 * 
 * -다차원 배열 //아파트 같은 느낌.
 * =>1차원 배열이 여러개 묶여 있는 형태의 배열을 말함.
 * =>행과 열의 개념이 적용이 됨.
 * 
 */
public class Array_09 {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];// 3차원 배열은 int[][][] //게임에서 다차원 배열을 많이 사용함.
		int count = 10;

		System.out.println(arr.length);
		System.out.println(arr.length);
		System.out.println(arr[1].length);

		for (int i = 0; i < arr.length; i++) { // 행 길이 3

			for (int j = 0; j < arr[i].length; j++) { // 열 길이 4

				arr[i][j] = count;

				count += 10;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.println("arr[" + i + "][" + j + "] >>> " + arr[i][j]);

			}
			System.out.println();

		}

	}

}
