package course13_for;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね");

		int yy = stdIn.nextInt();

		for (int i = 1; i < yy+1; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}

	}

}
