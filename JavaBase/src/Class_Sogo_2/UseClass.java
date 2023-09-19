package Class_Sogo_2;

import java.util.Random;
import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdin = new Scanner(System.in);
		Random rnd = new Random();

		//プレイヤーネームの設定
		System.out.println("プレイヤーネームの設定");
		String playername = stdin.next();
		Trainer trainer = new Trainer();
		trainer.name = playername;
		System.out.println("名前は" + trainer.name);
		System.out.println();//改行

		//ゲーム内のポケトンたち///////////////////////////////////////
		//名前、タイプ、HP、MP、攻撃、防御、素早さ、逃げ

		Pocketon all1 = new Pocketon("不思議リーフ", "草", 10, 3, 5, 5, 1, 1);
		Pocketon all2 = new Pocketon("火蜥蜴", "炎", 10, 3, 5, 5, 1, 1);
		Pocketon all3 = new Pocketon("銭亀", "水", 10, 3, 5, 5, 1, 1);
		Pocketon all4 = new Pocketon("沼吾郎", "炎", 25, 6, 11, 11, 9, 7);
		Pocketon all5 = new Pocketon("鹿山鳥", "草", 18, 3, 8, 6, 7, 4);
		Pocketon all6 = new Pocketon("ゴロんにゃ", "地", 20, 3, 10, 21, 3, 6);
		Pocketon all7 = new Pocketon("巨石", "地", 22, 5, 8, 11, 5, 6);
		Pocketon all8 = new Pocketon("コハル", "水", 15, 5, 7, 9, 7, 8);
		Pocketon all9 = new Pocketon("やニー", "炎", 15, 2, 3, 2, 2, 0);
		Pocketon all10 = new Pocketon("首領篇擬き", "飛", 18, 4, 7, 9, 5, 4);

		Pocketon[] all = new Pocketon[100];
		all[1] = all1;
		all[2] = all2;
		all[3] = all3;
		all[4] = all4;
		all[5] = all5;
		all[6] = all6;
		all[7] = all7;
		all[8] = all8;
		all[9] = all9;
		all[10] = all10;

		///////////////////////////////////////////////////////////////////

		//メニュー選択
		int menu = 0;
		while (menu != 99) {
			menu = 0;

			while ((menu != 1) && (menu != 2) && (menu != 3) && (menu != 99)) {
				System.out.println("メニュー");
				System.out.println("1…捕獲 2…図鑑を見る 3…バトル 99…プログラム終了");
				menu = stdin.nextInt();
			}

			switch (menu) {

			case 1://捕獲を選択
				System.out.println("捕獲");

				//ポケトン抽選
				int allr = rnd.nextInt(10) + 1;

				System.out.println(all[allr].name + "が現れた。");
				System.out.println(all[allr].name + "を捕まえますか？");
				System.out.println("1.捕まえる 2.逃げる");
				int hokaku = stdin.nextInt();

				while (hokaku != 1 && hokaku != 2) {
					System.out.println("1か2で選択してね");
					hokaku = stdin.nextInt();
				}

				if (hokaku == 1) {
					trainer.capture(all[allr]);
					trainer.display();
				}

				if (hokaku == 2) {
					System.out.println(playername + "は逃げた。");
				}

				break;

			case 2:
				System.out.println("図鑑を見る");
				trainer.display();
				break;

			case 3:
				System.out.println("バトル");

				System.out.println("戦うポケトンを番号で1体選んでね");

				int poke1 = stdin.nextInt();

				Pocketon pockes1 = trainer.myPockes[poke1 - 1];

				Pocketon pockes2 = all[rnd.nextInt(10) + 1];

				if (pockes1 == null) {
					System.out.println("ポケトンがいないよ");
				} else {
					Battle bt = new Battle();

					String winner = bt.doBattle(pockes1, pockes2, trainer.name);
					System.out.println("勝者:" + winner);

				}

				break;

			case 99:
				System.out.println("プログラム終了");
				break;
			}
			System.out.println();//改行
		}

	}

}
