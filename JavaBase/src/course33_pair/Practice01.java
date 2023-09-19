package course33_pair;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Level1
		String moji = "私はJavaを勉強中です。";
		System.out.println(moji);
		System.out.println();//改行
		
		//Level2
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("文字入力");
		String a =stdIn.next();
		System.out.println(a);
		System.out.println();//改行
		
		//Level3
		
		System.out.println("数値入力");
		int b = stdIn.nextInt();
		if(b>=50) {
			System.out.println(b+"は50以上です");
		}else {
			System.out.println(b+"は49以下です");
		}
		System.out.println();//改行
		
		//Level4
				System.out.println("配列数入力");
				int x = stdIn.nextInt();

				int[] variable = new int[x];

				System.out.println("要素数：" + x);

				System.out.println();//改行

		
	}

}
