package course41;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//模擬テスト①
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);
		System.out.println();//改行
		
		//模擬テスト②
		int x = 50;
		int y =100;
		int z = x*y;
		System.out.println(z);
		System.out.println();//改行
		
		//模擬テスト③
		Scanner stdIn = new Scanner(System.in);
		System.out.println("文字入力");
		String mogi3 = stdIn.next();
		System.out.println(mogi3);
		System.out.println();//改行
		
		//模擬テスト④
		for(int a =1;a<=5;a++) {
			System.out.println(a+"回目のループです");
		}
		System.out.println();//改行
		
		//模擬テスト⑤
		System.out.println("数値入力");
		int mogi5 = stdIn.nextInt();
		if(mogi5 >= 50) {
			System.out.println("50以上です。");
		}else {
			System.out.println("49以下です。");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
