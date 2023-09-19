package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
	System.out.println("aの値を入力");	
	int a = stdIn.nextInt();
	System.out.println("bの値を入力");	
	int b = stdIn.nextInt();
	System.out.println("cの値を入力");	
	int c = stdIn.nextInt();
	
	if(a> b && a> c) {
		System.out.println("aが一番大きい数値です。");
	}else if(b > a && b > c){
		System.out.println("bが一番大きい数値です");
	}else if(c > a && c > a){
		System.out.println("cが一番大きい数値です");
	}
	
	
	
	
	
	
	
	}

}
