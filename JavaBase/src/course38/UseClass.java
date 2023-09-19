package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題③
		Pocketon poke1 = new Pocketon();
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;

		//練習問題④
		String[] arr2 = new String[3];
		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";

		for (int a = 0; a < arr2.length; a++) {
			System.out.println("arr[" + a + "]: " + arr2[a]);
		}

		//練習問題⑤	
		Pocketon[] myPockes = new Pocketon[3];
		myPockes[0] = poke1;

		//練習問題⑥
		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;

		//練習問題⑦
		myPockes[1] = poke2;

		//練習問題⑧
		System.out.println(myPockes[0].name);

		//練習問題⑨
		System.out.println(myPockes[1].difficult);

		//練習問題⑩
		Scanner stdin = new Scanner(System.in);

		System.out.println("名前,戦闘力,");
		System.out.println("捕獲難易度 入力");
		String n3 = stdin.next();
		int p3 = stdin.nextInt();
		int d3 = stdin.nextInt();

		Pocketon poke3 = new Pocketon();
		poke3.name = n3;
		poke3.power = p3;
		poke3.difficult = d3;

		myPockes[2] = poke3;

		//練習問題⑪
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);

		//練習問題⑫
		for (int b = 0; b < myPockes.length; b++) {
			System.out.println(myPockes[b].name);
		}

	

	//練習問題⑬
	myPockes[1].display();
}
}