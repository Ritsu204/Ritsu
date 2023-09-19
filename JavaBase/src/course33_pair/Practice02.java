package course33_pair;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		//Level5

		offOff();
		System.out.println();//改行

		//Level6
		String moji = prapra("練習問題");
		System.out.println(moji);
		System.out.println();//改行
		
		//Level7
		
		Food food = new Food();
		food.display();
		
		food.name ="苺";
		food.price = 500;
		food.display();
		
	}
	/////////////////////////////////////////////////////
	
	//Level5メソッド
	static void offOff() {
		System.out.println("呼び出されました");
	}
	
	//Level6メソッド
	static String prapra(String x) {
		return x+"を受け取りました";
	}
	
	
	
	

}
