package course48_seki;

import java.util.Random;//Random追加
import java.util.Scanner;//Scanner追加

public class 藤倉班 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);//Scanner文と
		Random rnd = new Random();//Random文の追加

		int[][] zaseki = new int[6][6];//座席の配列作成(6X6)
		int[] hantei = new int[36];//すでに選んだ出席番号を格納する配列(0~35)
		int h = 0;//hantei配列の初期番号
		int syuuryou = 0;//最後にプログラムを終了するために使う(1000で終了)

		System.out.println("席替えをします");
		System.out.println("1.ランダム 2.選択");
		int www = stdIn.nextInt();//"ランダム" or "選択" の決定

		//１．ランダムを選択した場合の処理
		if (www == 1) {

			System.out.println("左上から順に席を決めていくよ");

			for (int a = 0; a < 6; a++) {//列の移動⇓
				for (int b = 0; b < 6; b++) {//行の移動⇒

					int syusseki = rnd.nextInt(36) + 1;//出席番号の設定

					////////////////////////////すでに選んだ出席番号かを確認///////////////////////////////////////////////
					int d = 0;//dはhantei配列0～35と選んだ出席番号が被らなかった数
					while (d != 36) {
						d = 0;//dの初期化
						for (int c = 0; c <= 35; c++) {//選んだ出席番号がhantei配列の0～35まで
							if (syusseki != hantei[c]) {//被っていないかを確認する
								d++;//被らなかった数を1増やす
							}
						}

						if (d == 36) {//全て被っていなければ
							zaseki[a][b] = syusseki;//a行目b列目の出席番号にsyussekiを設定
							hantei[h] = syusseki;//hantei配列のh番目に選んだ出席番号を格納
							h++;//次に入れるhantei配列の番号を増やす 例）1→2
						}
						if (d != 36) {//一つでもかぶれば

							syusseki = rnd.nextInt(36) + 1;//もう一度出席番号を選択
						}
					}
					//////////////////////////////////////////////////////////////////////////////////////////////////////////

				}
			}

			///////////////////////////座席表示/////////////////////////////////////
			for (int a = 0; a < 6; a++) {
				for (int b = 0; b < 6; b++) {

					System.out.print(zaseki[a][b] + " ");

				}
				System.out.println();
			}

			//２．選択を選んだ時の処理
		} else if (www == 2) {

			System.out.println("左上から順に席を決めていくよ");

			for (int a = 0; a < 6; a++) {//列の移動⇓
				for (int b = 0; b < 6; b++) {//行の移動⇒

					System.out.println("上から" + (a + 1) + ",左から" + (b + 1) + ",の出席番号を選んでね");

					int syusseki = stdIn.nextInt();//出席番号の設定

					//選んだ出席番号が1～36かを確認////////////////////////////////////////////////
					if (syusseki > 36 || syusseki < 1) {//36より大きいまたは1より小さい番号を選択したら↓
						while (syusseki > 36 || syusseki < 1) {//ループさせ出席番号を再設定
							System.out.println("1～36の間の数を選んでね");
							System.out.println("もう一度出席番号を選んでね");
							syusseki = stdIn.nextInt();//出席番号選択
						}

					}
					/////////////////////////////////////////////////////////////////////////////

					//すでに選んだ出席番号かを確認///////////////////////////////////////////////
					int d = 0;//dはhantei配列0～35と選んだ出席番号が被らなかった数
					while (d != 36) {
						d = 0;//dの初期化
						for (int c = 0; c <= 35; c++) {//選んだ出席番号がhantei配列の0～35まで
							if (syusseki != hantei[c]) {//被っていないかを確認する
								d++;//被らなかった数を1増やす
							}
						}

						if (d == 36) {//全て被っていなければ
							zaseki[a][b] = syusseki;//a行目b列目の出席番号にsyussekiを設定
							hantei[h] = syusseki;//hantei配列のh番目に選んだ出席番号を格納
							h++;//次に入れるhantei配列の番号を増やす 例）1→2
						}
						if (d != 36) {//一つでもかぶれば
							System.out.println("その出席番号はもう使ったよ");
							System.out.println("もう一度出席番号を選んでね");
							syusseki = stdIn.nextInt();//もう一度出席番号を選択
						}
					}
					///////////////////////////////////////////////////////////////////////////

				}
			}

			//座席表示/////////////////////////////////////
			for (int a = 0; a < 6; a++) {
				for (int b = 0; b < 6; b++) {

					System.out.print(zaseki[a][b] + " ");

				}
				System.out.println();
			}
			///////////////////////////////////////////////

			//１または２以外を選択してしまった場合の処理
		} else {
			System.out.println("もう一度実行しなおし1か2を選んでください");
			syuuryou = 1000;//ループを終了するためにsyuuryouを1000にする
		}

		//変更するかしないかの処理
		//変更が連続する可能性があるため999までのwhile
		while (syuuryou <= 999) {
			System.out.println("これでよろしいですか？");
			System.out.println("1.確定 2.変更");

			int k = stdIn.nextInt();//確定か変更を選ぶ

			//確定選択時の処理（席表示）
			if (k == 1) {

				//座席表示/////////////////////////////////////
				for (int a = 0; a < 6; a++) {
					for (int b = 0; b < 6; b++) {

						System.out.print(zaseki[a][b] + " ");

					}
					System.out.println();
				}
				///////////////////////////////////////////////

				System.out.println("終了");
				syuuryou = 1000;//ループを終了するためにsyuuryouを1000にする
			}

			//変更が選ばれた時の処理
			if (k == 2) {

				//a1は入れ替え元の列選択
				//a2は入れ替え元の行選択
				//a3は入れ替え先の列選択
				//a4は入れ替え先の行選択

				int a1 = 0;

				//①配列が６×６のため1未満か、６より大きい数字が入力されたら再入力させる
				while (a1 < 1 || a1 > 6) {
					System.out.println("入れ替え元を入力してね[][]←側");
					a1 = stdIn.nextInt();
					if (a1 < 1 || a1 > 6) {
						System.out.println("もう一度入れ替え元を入力してね[][]←側");
					}
				}
				System.out.println();//改行

				int a2 = 0;
				//①同様 (168段目)
				while (a2 < 1 || a2 > 6) {
					System.out.println("入れ替え元を入力してね[][]→側");
					a2 = stdIn.nextInt();
					if (a2 < 1 || a2 > 6) {
						System.out.println("もう一度入れ替え元を入力してね[][]→側");
					}
				}
				System.out.println();//改行

				int a3 = 0;
				//①同様 (168段目)
				while (a3 < 1 || a3 > 6) {
					System.out.println("入れ替え元を入力してね[][]←側");
					a3 = stdIn.nextInt();
					if (a3 < 1 || a3 > 6) {
						System.out.println("もう一度入れ替え元を入力してね[][]←側");
					}
				}
				System.out.println();//改行

				int a4 = 0;
				//①同様 (168段目)
				while (a4 < 1 || a4 > 6) {
					System.out.println("入れ替え元を入力してね[][]→側");
					a4 = stdIn.nextInt();
					if (a4 < 1 || a4 > 6) {
						System.out.println("もう一度入れ替え元を入力してね[][]→側");
					}
				}
				System.out.println();//改行

				int save = 0;//空白の箱を作る
				save = zaseki[(a3 - 1)][(a4 - 1)];//空白の箱の中に入れ替え先を入れる
				zaseki[(a3 - 1)][(a4 - 1)] = zaseki[(a1 - 1)][(a2 - 1)];//空いた入れ替え先に入れ替え元を入れる
				zaseki[(a1 - 1)][(a2 - 1)] = save;//入れ替え元に保存した入れ替え先を入れる
				System.out.println("変更後の席はこちらです");
				for (int a = 0; a < 6; a++) {
					for (int b = 0; b < 6; b++) {

						System.out.print(zaseki[a][b] + " ");

					}
					System.out.println();
				}

			}

			//1と2以外を選んだ輩用
			else {
				//134行目のwhileに戻る
			}
			/////////////////////////////////////

		}

	}

}
