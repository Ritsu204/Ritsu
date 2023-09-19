package course13_for;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数字を入力");
		Scanner stdIn = new Scanner(System.in);
		int i = stdIn.nextInt();

		for (int a = 1; a <= i; a++) {
			if (a >= 100) {
				System.out.println("どれだけ回すの");
			}
			if (a % 2 == 0) {
				System.out.println("偶数だよ");
			}
			if (a % 2 == 1) {
				System.out.println("奇数だよ");
			}
			System.out.println("現在" + a + "回目");

		}
	}
}
