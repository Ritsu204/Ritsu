package course10;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を入力");
		int a = stdIn.nextInt();
		
	int b = a % 2;
	
	if (b == 1) {
		System.out.println("奇数");
		
	}else {
		System.out.println("偶数");
	}

	}

}
