package course12_while;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= 9) {
				System.out.print(a * b + ",");
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
