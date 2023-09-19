package course12_while;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//鉄板文法
		int i = 0;
		do {
			System.out.println("ここに実行したい"
					+ "ことを書く");
			i++;
		} while (i < 3);

		System.out.println(""); //空白

		//変則系(ifとの組み合わせ)
		int x = 0;
		do {
			if (x < 3) {
				System.out.println("ifとの組み合わせ");
			} else if (x == 2) {
				break;
			}
			x++;
		} while (x < 3);

	}

}
