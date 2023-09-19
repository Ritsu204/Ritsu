package course55;

import java.util.Scanner;

public class TyphoonControll2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		//台風情報////////////////////////////////////////////////
		Typhoon ty0 = new Typhoon(1, "2022年04月08日", "マラカス");
		Typhoon ty1 = new Typhoon(2, "2022年04月10日", "メーギー");
		Typhoon ty2 = new Typhoon(3, "2022年06月30日", "チャバ");
		Typhoon ty3 = new Typhoon(4, "2022年07月01日", "アイレー");
		Typhoon ty4 = new Typhoon(5, "2022年07月28日", "ソングダー");
		Typhoon ty5 = new Typhoon(6, "2022年07月31日", "トローセス");
		Typhoon ty6 = new Typhoon(7, "2022年08月09日", "ムーラン");
		Typhoon ty7 = new Typhoon(8, "2022年08月12日", "メアリー");
		Typhoon ty8 = new Typhoon(9, "2022年08月22日", "マーゴン");

		Typhoon[] typhoonList = new Typhoon[9];
		typhoonList[0] = ty0;
		typhoonList[1] = ty1;
		typhoonList[2] = ty2;
		typhoonList[3] = ty3;
		typhoonList[4] = ty4;
		typhoonList[5] = ty5;
		typhoonList[6] = ty6;
		typhoonList[7] = ty7;
		typhoonList[8] = ty8;

		//////////////////////////////////////////////////////////

		System.out.println("0.台風情報を見る");
		System.out.println("99.編集モード");
		//モード選択
		int a = stdIn.nextInt();
		System.out.println();//改行

		//0 99 以外選択時
		while (a != 0 && a != 99) {
			System.out.println("0か99で選択");
			a = stdIn.nextInt();
		}

		//0 を選択
		if (a == 0) {

			for (int list = 0; list < 9; list++) {
				System.out.println("令和4年台風" + typhoonList[list].getTyphoonbango() + "号");
				System.out.print(typhoonList[list].getHasseibi());
				System.out.println(typhoonList[list].getAsiaName());
				System.out.println();//改行
			}

		}

		if (a == 99) {
			System.out.println("変更する台風番号を指定");
			a = stdIn.nextInt();

			System.out.println("新しい名前を入力");
			String b = stdIn.next();
			typhoonList[a - 1].setAsiaName(b);
			System.out.println();//改行
			
			for (int list = 0; list < 9; list++) {
				System.out.println("令和4年台風" + typhoonList[list].getTyphoonbango() + "号");
				System.out.print(typhoonList[list].getHasseibi());
				System.out.println(typhoonList[list].getAsiaName());
				System.out.println();//改行
			}

		}

	}

}
