package course01;

import java.util.Random;
import java.util.Scanner;

public class Gatya {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

	System.out.println("ガチャの回数(1 or 10)");	
	int c = stdIn.nextInt();	
	if(c>=10) {
		 c = stdIn.nextInt();
	}
	for(int d = 1; d<=c; d++) {	
		
		//ガチャ↓
int a = rnd.nextInt(100)+1;
		switch(a) {
		case 1,2,3:
			int b = rnd.nextInt(10)+1;
		if(b<=7) {
			System.out.print("ピックアップSSR ");
		}else {
			System.out.print("通常SSR ");
		}
		break;
		case 4,5,6,7,8,9,10,11,12,13,
		14,15,16,17,18:
			System.out.print("SR ");
		break;
		default:
			System.out.print("R ");
		}
		
	}

}}
