package course17;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int a = 13;   //10進数の13
	int b = 013;  // 8進数の13
	int c = 0x13; //16進数の13
		
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("c=" + c);
	
	System.out.println();
	
	Scanner stdIn =new Scanner(System.in);
	
	System.out.println("整数:");
	int x = stdIn.nextInt();
	
	System.out.printf("10進数では%dです \n", x);
	System.out.printf(" 8進数では%oです \n", x);
	System.out.printf("16進数では%xです \n", x);
}
}