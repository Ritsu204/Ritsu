package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("xを入力");	
		int x = stdIn.nextInt()	;
		System.out.println("yを入力");
		int y = stdIn.nextInt();
		
	if(x > y) {
		System.out.println("xがでかい!なぜならxは"+ x +"でyは"
	+ y + "だから" );
	}else if(x == y){
		System.out.println("おなじー");
	}else {
		System.out.println("yがでかい！なぜならyは"+ y +"でxは"
				+ x + "だから");
	}
	
	}

}
