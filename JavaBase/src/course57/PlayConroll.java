package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayConroll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		
		/**
		String[] st = new String[4];
		st[0] = "筋力";
		st[1] = "学力";
		st[2] = "見た目";
		st[3] = "面白さ";
		**/

		//主人公のステータス初期	
		Player me = new Player();
		//1～5のランダムな数値を設定
		int mk = rnd.nextInt(5) + 1;
		int mg = rnd.nextInt(5) + 1;
		int mm = rnd.nextInt(5) + 1;
		int mo = rnd.nextInt(5) + 1;
		me.setKinryoku(mk);
		me.setGakuryoku(mg);
		me.setMitame(mm);
		me.setOmosiro(mo);
		
		/**
		int[] mes = new int[4];
		mes[0] = me.getKinryoku();
		mes[1] = me.getGakuryoku();
		mes[2] = me.getMitame();
		mes[3] = me.getOmosiro();
		**/

		//ヒロインのステータス初期
		Target koku = new Target();
		int kk = rnd.nextInt(10) + 3;
		int kg = rnd.nextInt(10) + 3;
		int km = rnd.nextInt(10) + 3;
		int ko = rnd.nextInt(10) + 3;
		koku.setHituyouKin(kk);
		koku.setHituyouGaku(kg);
		koku.setHituyouMita(km);
		koku.setHituyouOmo(ko);

		/**
		int[] kokus = new int[4];
		kokus[0] = koku.getHituyouKin();
		kokus[1] = koku.getHituyouGaku();
		kokus[2] = koku.getHituyouMita();
		kokus[3] = koku.getHituyouOmo();
		**/
		
		
		int kaisu = 0;

		while (kaisu < 7) {

			kaisu = kaisu + 1;

			System.out.println("主人公のステータス");
			System.out.println("筋力：" + me.getKinryoku());
			System.out.println("学力：" + me.getGakuryoku());
			System.out.println("見た目:" + me.getMitame());
			System.out.println("面白さ：" + me.getOmosiro());

			System.out.println("何する？");
			System.out.println("1.筋トレ 2.勉強 3.整形 4.人と喋る ");
			int select = stdIn.nextInt();

			switch (select) {

			case 1:
				System.out.println("主人公の筋肉が１上がった");
				me.setKinryoku(me.getKinryoku() + 1);
				break;

			case 2:
				System.out.println("主人公の学力が１上がった");
				me.setGakuryoku(me.getGakuryoku() + 1);
				break;

			case 3:
				System.out.println("主人公の見た目が１上がった");
				me.setMitame(me.getMitame() + 1);
				break;

			case 4:
				System.out.println("主人公の面白さが１上がった");
				me.setOmosiro(me.getOmosiro() + 1);
				break;

			}

			int kokust = 0;

			kokust = rnd.nextInt(4) + 1;
			switch (kokust) {

			case 1:
				System.out.println("ヒロインの筋力：" + koku.getHituyouKin());

				break;

			case 2:
				System.out.println("ヒロインの学力：" + koku.getHituyouGaku());

				break;

			case 3:
				System.out.println("ヒロインの見た目:" + koku.getHituyouMita());

				break;

			case 4:
				System.out.println("ヒロインの面白さ：" + koku.getHituyouOmo());

				break;

			}

			System.out.println();//改行
		}

		System.out.println("告白する");
		System.out.println("何で勝負する？");
		System.out.println("1.筋肉 2.学力 3.見た目 4.面白さ");

		int select = stdIn.nextInt();
		int last = rnd.nextInt(4) + 1;

		switch (select) {

		case 1://////////////////////////////////////////////////////////////////////////////////
			if (me.getKinryoku() <= koku.getHituyouKin()) {
				System.out.println("ダメだった。ゲームオーバー");
			} else {
				while (select == last) {
					last = rnd.nextInt(4)+1;
				}

				switch (last) {

				case 2:

					if (me.getGakuryoku() <= koku.getHituyouGaku()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 3:

					if (me.getMitame() <= koku.getHituyouMita()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 4:

					if (me.getOmosiro() <= koku.getHituyouOmo()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;

				}

			}
			break;//////////////////////////////////////////////////////////////////////////////////

		case 2:///////////////////////////////////////////////////////////////////////////////////
			if (me.getGakuryoku() <= koku.getHituyouGaku()) {
				System.out.println("ダメだった。ゲームオーバー");
			} else {
				while (select == last) {
					last = rnd.nextInt(4)+1;
				}

				switch (last) {

				case 1:

					if (me.getKinryoku() <= koku.getHituyouKin()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 3:

					if (me.getMitame() <= koku.getHituyouMita()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 4:

					if (me.getOmosiro() <= koku.getHituyouOmo()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;

				}

			}
			break;///////////////////////////////////////////////////////////////////////////////////

		case 3://///////////////////////////////////////////////////////////////////////////////////////
			if (me.getMitame() <= koku.getHituyouMita()) {
				System.out.println("ダメだった。ゲームオーバー");
			} else {
				while (select == last) {
					last = rnd.nextInt(4)+1;
				}

				switch (last) {

				case 1:

					if (me.getKinryoku() <= koku.getHituyouKin()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 2:

					if (me.getGakuryoku() <= koku.getHituyouGaku()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 4:

					if (me.getOmosiro() <= koku.getHituyouOmo()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;

				}

			}
			break;//////////////////////////////////////////////////////////////////////////////////////

		case 4:///////////////////////////////////////////////////////////////////////////////////////////
			if (me.getOmosiro() <= koku.getHituyouOmo()) {
				System.out.println("ダメだった。ゲームオーバー");
			} else {
				while (select == last) {
					last = rnd.nextInt(4)+1;
				}

				switch (last) {

				case 1:

					if (me.getKinryoku() <= koku.getHituyouKin()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 2:

					if (me.getGakuryoku() <= koku.getHituyouGaku()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;
				case 3:

					if (me.getMitame() <= koku.getHituyouMita()) {
						System.out.println("ダメだった。ゲームオーバー");
					} else {
						System.out.println("告白成功");
					}

					break;

				}

			}
			break;///////////////////////////////////////////////////////////////////////////////////

		}

	}

}
