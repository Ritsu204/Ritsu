package Class_Sogo;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdin = new Scanner(System.in);

		//プレイヤーネームの設定
		System.out.println("プレイヤーネームの設定");
		String playername = stdin.next();
		Trainer trainer = new Trainer();
		trainer.name = playername;
		System.out.println("名前は" + trainer.name);
		System.out.println();//改行

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

				System.out.println("捕獲したいポケモンの設定");

				System.out.println("名前");
				String pname = stdin.next();

				String ptype = "";
				while ((!ptype.equals("炎")) &&
						(!ptype.equals("水")) &&
						(!ptype.equals("地面")) &&
						(!ptype.equals("草"))) {

					System.out.println("タイプを 炎、水、地面、草 から選んでね");
					ptype = stdin.next();

				}

				System.out.println("戦闘力");
				int ppower = stdin.nextInt();

				System.out.println("捕獲難易度");
				int pdiff = stdin.nextInt();

				Pocketon pockes = new Pocketon(pname, ptype, ppower, pdiff);

				trainer.capture(pockes);
				trainer.display();

				break;
			case 2:
				System.out.println("図鑑を見る");
				trainer.display();
				break;

			case 3:
				System.out.println("バトル");

				System.out.println("戦うポケトンを番号で選んでね");

				int poke1 = stdin.nextInt();
				int poke2 = stdin.nextInt();

				Pocketon pockes1 = trainer.myPockes[poke1 - 1];
				Pocketon pockes2 = trainer.myPockes[poke2 - 1];

				if (pockes1 == null || pockes2 == null) {
					System.out.println("ポケトンがいないよ");
				} else {
				if(poke1!=poke2) {	
					Battle bt = new Battle();

					String winner = bt.doBattle(pockes1, pockes2);
					System.out.println("勝者:" + winner);
				}else {
					System.out.println("同じポケトンは使えないよ");
				}
				
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
