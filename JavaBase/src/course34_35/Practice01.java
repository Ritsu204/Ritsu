package course34_35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		//練習問題③
		System.out.println("数値入力①");
		int x = stdIn.nextInt();

		if (x >= 50) {
			System.out.println("数値入力②");
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}

	}///////////////////////////////////////////////////////

	//練習問題③メソッド
	static void calc(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}

	static void calc(int x) {
		System.out.println(x + "×10" + "=" + (x * 10));
	}

}
