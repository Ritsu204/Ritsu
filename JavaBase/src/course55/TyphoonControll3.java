package course55;

import java.util.Scanner;

public class TyphoonControll3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		//台風情報////////////////////////////////////////////////
		Typhoon3 ty0 = new Typhoon3(1, 20220408, "マラカス");
		Typhoon3 ty1 = new Typhoon3(2, 20220410, "メーギー");
		Typhoon3 ty2 = new Typhoon3(3, 20220630, "チャバ");
		Typhoon3 ty3 = new Typhoon3(4, 20220701, "アイレー");
		Typhoon3 ty4 = new Typhoon3(5, 20220728, "ソングダー");
		Typhoon3 ty5 = new Typhoon3(6, 20220731, "トローセス");
		Typhoon3 ty6 = new Typhoon3(7, 20220809, "ムーラン");
		Typhoon3 ty7 = new Typhoon3(8, 20220812, "メアリー");
		Typhoon3 ty8 = new Typhoon3(9, 20220822, "マーゴン");

		Typhoon3[] typhoonList = new Typhoon3[15];
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
		System.out.println("55.台風情報の新規追加");
		System.out.println("99.編集モード");
		//モード選択
		int a = stdIn.nextInt();
		System.out.println();//改行

		//0 99 以外選択時
		while (a != 0 && a!=55 && a != 99) {
			System.out.println("0か99で選択");
			a = stdIn.nextInt();
		}

		//0 を選択
		if (a == 0) {

			//確認/////////////////////////////////////////////
			for (int list = 0; list < 9; list++) {
				System.out.println("令和4年台風" + typhoonList[list].getTyphoonbango() + "号");
				
				System.out.print(typhoonList[list].getHasseibi()/10000+"年");
				System.out.print(typhoonList[list].getHasseibi()%10000/100+"月");
				System.out.println(typhoonList[list].getHasseibi()%100+"日");
				
				System.out.println(typhoonList[list].getAsiaName());
				System.out.println();//改行
			}
			///////////////////////////////////////////////////

		}
		
		if(a==55) {
			System.out.println("台風番号を1~15で入力");
			int a1 = stdIn.nextInt();
			
			System.out.println("発生日を入力");
			System.out.println("例)2021年7月16日");
			System.out.println("⇒20210716");
			
			int a2 = stdIn.nextInt();
			while(a2<9999999||a2>99999999||(a2%10000/100)>13||(a2%10000/100)<0||
					a2%100>31||a2%100<0) {
			
				
				
				System.out.println("入力に不備あり");
				System.out.println("再入力");
				a2 = stdIn.nextInt();
			
			}
			
			
			
			
			
			
			System.out.println("台風名を入力");
			String a3 = stdIn.next();
					
			typhoonList[a1-1].setTyphoonbango(a1);
			typhoonList[a1-1].setHasseibi(a2);
			typhoonList[a1-1].setAsiaName(a3);
			
			
			//確認/////////////////////////////////////////////
			for (int list = 0; list < 9; list++) {
				System.out.println("令和4年台風" + typhoonList[list].getTyphoonbango() + "号");
				
				System.out.print(typhoonList[list].getHasseibi()/10000+"年");
				System.out.print(typhoonList[list].getHasseibi()%10000/100+"月");
				System.out.println(typhoonList[list].getHasseibi()%100+"日");
				
				System.out.println(typhoonList[list].getAsiaName());
				System.out.println();//改行
			}
			///////////////////////////////////////////////////
			
					
		}
		
		
		
		
		

		if (a == 99) {
			System.out.println("変更する台風番号を指定");
			a = stdIn.nextInt();

			System.out.println("新しい名前を入力");
			String b = stdIn.next();
			typhoonList[a - 1].setAsiaName(b);
			System.out.println();//改行
			
			//確認/////////////////////////////////////////////
			for (int list = 0; list < 9; list++) {
				System.out.println("令和4年台風" + typhoonList[list].getTyphoonbango() + "号");
				
				System.out.print(typhoonList[list].getHasseibi()/10000+"年");
				System.out.print(typhoonList[list].getHasseibi()%10000/100+"月");
				System.out.println(typhoonList[list].getHasseibi()%100+"日");
				
				System.out.println(typhoonList[list].getAsiaName());
				System.out.println();//改行
			}
			///////////////////////////////////////////////////
			
		}
		
	}

}
