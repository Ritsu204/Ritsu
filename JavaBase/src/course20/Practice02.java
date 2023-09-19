package course20;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] arr1 = { 10, 20, 30, 40, 50 };

		//練習問題①

		int z = 333;

		for (int a : arr1) {
			z = z - a;
		}
		System.out.println(z);
		System.out.println();

		//実践問題
		int s = 0;
		String[] arr2 = { "x", "y", "x", "y", "x" };
		for (String b : arr2) {
			if (b.equals("x")) {
				s = s + 1;
			}
		}
		System.out.println("xの数は" + s);
		System.out.println();
		
	}

}
