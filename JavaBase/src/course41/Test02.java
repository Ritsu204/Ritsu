package course41;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//模擬テスト⑥
		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い1日を！");
		}
		System.out.println();//改行

		//模擬テスト⑦
		int[] numArr = new int[5];
		numArr[0] = 10;
		numArr[1] = 50;
		numArr[2] = 30;
		numArr[3] = 20;
		numArr[4] = 40;

		//模擬テスト⑧
		for (int a = 0; a < numArr.length; a++) {
			System.out.print(numArr[a] + " ");
		}
		System.out.println();//改行
		System.out.println();

		//模擬テスト⑨

		int[] numArr2 = new int[5];
		numArr2[0] = 0;
		numArr2[1] = 0;
		numArr2[2] = 0;
		numArr2[3] = 0;
		numArr2[4] = 0;

		



		//模擬テスト⑩
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] variable = new int[x];

		//模擬テストEX
		int[] numExArr = new int[5];
		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;

	}

}
