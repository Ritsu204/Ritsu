package course24;

import java.util.Scanner;

public class ouyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("1 足し算 2 引き算");
		int a = stdIn.nextInt();
	
		if (a == 1) {
			System.out.println("2つ数字を入力");
			int b = stdIn.nextInt();
			int bb = stdIn.nextInt();
			plus(b, bb);
		} else if(a==2) {
			System.out.println("2つ数字を入力");
			int b = stdIn.nextInt();
			int bb = stdIn.nextInt();
			minus(b, bb);
		}

	}

	static void plus(int c, int cc) {
		System.out.println(c + "+" + cc + "=" + (c + cc));
	}

	static void minus(int c, int cc) {
		System.out.println(c + "-" + cc + "=" + (c - cc));
	}

}
