package course40;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		int number = 15;

		if (number > 10) {
			System.out.println("でか！！！");
		}

		//練習問題②
		int age = 20;

		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね＾＾");
		}

		//練習問題③
		int score = 85;

		if (score >= 90) {
			System.out.println("Excellent");
		} else if (score >= 80 && score < 90) {
			System.out.println("Good");
		} else {
			System.out.println("勉強しましょう。");
		}
		
		//練習問題④
		boolean isRaining = true;
		
		if(isRaining) {
			System.out.println("傘をもってけーーー");
		}else {
			System.out.println("良い1日を！");
			
		}
		
		//練習問題⑤
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値入力");
		int num = stdIn.nextInt();
		
		if(num%2==0) {
			System.out.println("偶数でっせ");
		}else {
			System.out.println("奇数だよ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
