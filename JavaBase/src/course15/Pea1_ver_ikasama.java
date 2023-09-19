package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1_ver_ikasama {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//いかさまダイス

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		//最初の10000円
		int z = 10000;

		while (z > 0 && z < 50000) {

			System.out.println("現在の所持金は" + z + "円です。");
			System.out.println("掛け金を入力してください。");
			int y = stdIn.nextInt();

			if (z < y) {
				y = z;
				System.out.println("上限を超えたので" + z + "円にします。");
			}

			System.out.println("掛け金は" + y + "円です。");

			System.out.println("a入力");
			System.out.println("b入力");
			System.out.println("c入力");

			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();

			System.out.println("サイコロの目は、");
			System.out.print(a + "　");
			System.out.print(b + "　");
			System.out.println(c);

			//サイコロの目↓	

			//１１１	
			if (a + b + c == 3) {
				System.out.println("ビンゾロ");
				z = z + 5 * y;
			} else

			//ゾロ目（1と7以外）
			if (a == b && b == c && a != 1 && a != 7) {
				System.out.println("ゾロ目");
				z = z + 3 * y;
			} else

			//四五六
			if (a == 4 && b == 5 && c == 6 || a == 4 && b == 6 && c == 5 || a == 5 && b == 4 && c == 6
					|| a == 5 && b == 6 && c == 4 || a == 6 && b == 5 && c == 4 || a == 6 && b == 4 && c == 5) {
				System.out.println("シゴロ");
				z = z + 2 * y;
			} else

			//通常の目
			if (a == b && a != c && b != c && a != 7 || b == c && b != a && c != a && b != 7
					|| c == a && c != b && a != b && c != 7) {
				System.out.println("通常の目");
			} else

			//ションベン
			if (a == 7 && b == 7 || a == 7 && c == 7 || b == 7 && c == 7) {
				System.out.println("ションベン");
				z = z - y;
			} else

			//一二三
			if (a == 1 && b == 2 && c == 3 || a == 1 && b == 3 && c == 2 || a == 2 && b == 1 && c == 3
					|| a == 2 && b == 3 && c == 1 || a == 3 && b == 2 && c == 1 || a == 3 && b == 1 && c == 2) {
				System.out.println("ヒフミ"); 
				z = z - 2 * y;
			} else {
				System.out.println("役無し");
				z = z - y;
			}
			System.out.println();
		}
		System.out.println("最終結果は" + z + "円");

		int x = z;
		if (x >= 50000) {
			System.out.println("クリア");
		} else if (x <= 0) {
			System.out.println("1050年地下行き！");
		}
	}

}
//いかさま