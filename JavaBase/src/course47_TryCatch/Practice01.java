package course47_TryCatch;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		try {
			int[] array = { 1, 2, 3 };
			for (int i = 0; i < /*=←原因*/ array.length; i++) {
				System.out.println(array[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();//←おまけ
			System.out.println(e);
		}
		System.out.println(/*改行*/);

		//練習問題②
		try {
			int number = /*0←原因*/5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(/*改行*/);

		//練習問題③
		try {
			int number2 = /*0←原因*/5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(/*改行*/);

		//練習問題④
		try {
			int result = divideNumbers(10, /*0←原因*/2);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}///////これはmainメソッドの外に書いて////////

	//④メソッド
	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
