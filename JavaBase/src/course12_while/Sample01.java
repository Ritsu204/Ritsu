package course12_while;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 1;

		while (a < 4) {
			System.out.println("ループ" + a + "回目");
			a++;
		}

		System.out.println(""); //空白

		int b = 100;
		while (b >= 0) {
			System.out.println("残り" + b);
			b--;
			if (b == -1) {
				System.out.println("終了");
				break;
			}
		}

	}

}
